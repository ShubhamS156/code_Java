interface one{
	default public void name(){
		System.out.println("Shubham");
	}
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
	

	public static void main(String[] args) {
		multipleInheritance obj1=new multipleInheritance();
		obj1.name();
		obj1.sname();
		obj1.age();
	}
}