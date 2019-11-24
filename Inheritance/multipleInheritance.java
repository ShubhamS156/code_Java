interface one{
	int x=20;
	 public void name();

}

interface two{
	default public void sname(){
		System.out.println("Sharma");
	}
}

interface three extends one,two{
	default public void age(){
		System.out.println("19");
	}
}

public class multipleInheritance implements three{
public void name(){
	System.out.println("Shubham");
}
	public static void main(String[] args) {
		multipleInheritance obj1=new multipleInheritance();
		obj1.name();
		obj1.sname();
		obj1.age();
		System.out.println(one.x);

	}
}
