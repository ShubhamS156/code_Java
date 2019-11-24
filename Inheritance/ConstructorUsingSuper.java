class Super{
	public Super(){
		System.out.println("Constructor of super class is called");
		System.out.println("hey");
	}
}
class Sub extends Super{
	String msg="illePode";
	public Sub(){
		super();
			System.out.println("Constructor of sub class called");

	}
}

public class ConstructorUsingSuper{
	public static void main(String[] args) {
		Sub obj1=new Sub();
		//object of sub class created which will call its constructor and hence the constructor of super class;
	}
}
