public class Person {
	// Person attributes to be modified by getter/setter methods.
	private String name;
	private int age;
	
	// Person constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	// name variable setter method.
	public void setName(String n) {
		name = n;
	}
	// age variable setter method.
	public void setAge(int a) {
		age = a;
	}
	// name variable getter method.
	public String getName() {
		return name;
	}
	// age variable getter method.
	public int getAge() {
		return age;
	}
	// Method to display person object details.
	public void displayDetails() {
		System.out.println("--- Person Details --- ");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}
