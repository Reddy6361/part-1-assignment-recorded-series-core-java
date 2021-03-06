package part1SesssionTwo;

/*Steps to Create Immutable class:
 * 1) Create a final class
 * 2) Set the values of the variables/properties using only constructors.
 * 3) Make the properties as final.
 * 4) Do-not provide any setters for these properties, only provide getters.
 *  */
final public class Ex2 {
	private final int age;
	private final String name;

	  public Ex2(int age, String name) { // Initializing properties values.
		this.age = age;
		this.name = name;
	}

	public static void main(String[] args) {
		Ex2 ex = new Ex2(20, "pankaj");
		// object creation to assign values by calling constructor.
	}

	public String getName() { // getters
		return name;
	}

	public int getAge() { // getters
		return age;
	}
}
