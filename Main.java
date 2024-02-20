public class Main {
	public static void main(String[] args) {
		// Person class tests
		Person new1 = new Person("John Smith", 45);
		new1.displayDetails();
		
		new1.setName("Carl Minata");
		new1.setAge(38);
		
		System.out.println();
		System.out.println(new1.getName());
		System.out.println(new1.getAge());
		System.out.println();
		
		new1.displayDetails();
		System.out.println();
		
		// Job class tests
		HardSkill new2 = new HardSkill("Java", "Beginner");
		new2.displayDetails();
		
		new2.setTitle("C++");
		new2.setLevel("Expert");
		
		System.out.println();
		System.out.println(new2.getTitle());
		System.out.println(new2.getLevel());
		System.out.println();
		
		new2.displayDetails();
		System.out.println();
		// HardSkill class tests
		job new3 = new job("Software Developer", 4);
		new3.displayDetails();
		
		new3.setTitle("Wizard");
		new3.setExperience(8);
		
		System.out.println();
		System.out.println(new3.getTitle());
		System.out.println(new3.getExperience());
		System.out.println();
		
		new3.displayDetails();
	}
	
}