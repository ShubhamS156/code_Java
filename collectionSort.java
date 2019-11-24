import java.util.*;

public class collectionSort{
	public static void main(String[] args) {
		ArrayList<String> city=new ArrayList<String>();
		city.add("Jaipur");
		city.add("Mumbai");
		city.add("Goa");
		city.add("Pune");
		city.add("Hyderbad");
		city.add("Bangalore");

		System.out.println("Before Sorting City ArrayList: ");
		System.out.println(city);

		Collections.sort(city);
		System.out.println("After sorting City ArrayList: ");
		System.out.println(city);
		String ci=city.get(1);
		System.out.println(ci);
	}
}
