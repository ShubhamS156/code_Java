import java.math.BigDecimal;
public class floating {
  public static void main(String[] args) {
    BigDecimal a=new BigDecimal("0.1");
    BigDecimal b=new BigDecimal(0.1f);

    System.out.println("0.1f=0.1 is "+(0.1f==0.1));
    System.out.println("0.1f is actually "+ b);
    System.out.println("0.1 is actually "+ a);

  }
}
