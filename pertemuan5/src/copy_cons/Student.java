package copy_cons;

public class Student {
	String name;
	int id;
	
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public Student(Student ostudent) {
		this.name = ostudent.name;
		this.id = ostudent.id;
	}
}
