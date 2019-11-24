import java.text.ParseException;
import java.util.*;
public class FCFS{
public void calcCompTime(int len,int[] compTimeArr,int burstArray[],int arrive){
int compTime=0;
  for(int i=0;i<len;i++){
    compTime=burstArray[i]+compTime;
    compTimeArr[i]=compTime;
  }
  System.out.println("Completion Time Calculated");
}
public void calcWaitTime(int len,int[] waitTimeArr,int[] burstArray,int[] compTimeArray,int arrive){
  for(int i=0;i<len;i++){
    waitTimeArr[i]=compTimeArray[i]-burstArray[i];

  }
  System.out.println("Wait Time Recorded...");
}
public static void main(String[] args) {
int arrival=0;
int compAv;
int waitAv;
int waitSum=0;
int compSum=0;
  Scanner scan =new Scanner(System.in);
  FCFS obj=new FCFS();
System.out.println("Enter Number of Processes ");
int numProc=scan.nextInt();
String[] procArray=new String[numProc];
int[] burstArray=new int[numProc];
int[] compTimeArray=new int[numProc];
int[] waitTimeArray=new int[numProc];
  System.out.println("Enter Processes Names: ");
  for(int i=0;i<numProc;i++){
    System.out.println("Process "+i+" :");
    procArray[i]=scan.nextLine();
  }
  System.out.println("Names Recorded....");
  System.out.println("Enter Burst Time of: ");
  for(int i=0;i<numProc;i++){
    System.out.println(procArray[i]+" :");
    burstArray[i]=scan.nextInt();
  }
  System.out.println("Burst Time Recorded...\nCalculating Completion Time...");
  obj.calcCompTime(numProc,compTimeArray,burstArray,arrival);
  System.out.println("Calculating Waiting Time");
  obj.calcWaitTime(numProc,waitTimeArray,burstArray,compTimeArray,arrival);
  for(int i=0;i<numProc;i++){
    waitSum=waitTimeArray[i]+waitSum;
  }
  for(int i=0;i<numProc;i++){
    compSum=compTimeArray[i]+compSum;
  }
  waitAv=waitSum/numProc;
  compAv=compSum/numProc;
  System.out.println("Processes  BurstTime  WaitTime  CompletionTime");

    for(int j=0;j<3;j++){
      System.out.println(procArray[j]+"  "+burstArray[j]+"  "+waitTimeArray[j]+"  "+compTimeArray[j]);
  }
  System.out.println("\n\nAverage Wait Time: "+waitAv+"\n+Average Completion Time :"+compAv);
}
}
