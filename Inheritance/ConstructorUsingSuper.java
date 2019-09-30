class Super{
	public Super(String msg){
		System.out.println("COnstructor of super class is called");
		System.out.println(msg);
	}
}
class Sub extends Super{
	String msg="illePode";
	public Sub(){
		super("hey");
		System.out.println("Constructor of sub class called");
	}
}

public class ConstructorUsingSuper{
	public static void main(String[] args) {
		Sub obj1=new Sub();
		//object of sub class created which will call its constructor and hence the constructor of super class;
	}
}