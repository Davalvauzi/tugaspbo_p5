package copy_cons;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("First object");
		Student std1 = new Student("Anisa", 21);
		System.out.println("First Name: " + std1.name
							+ " and Student ID: " + std1.id);
		
		System.out.println();
		
		System.out.println("Second object");
		Student std2 = new Student(std1);
		System.out.println("Copy Constructor used Second Object");
		System.out.println("Second name: " + std2.name
							+ " and Student id: " + std2.id);
	}
	
		

}
