package javacpackage;

public class Student {

	String stuName;
	String stuCourse;
	String stuPhoneNumber;
	String stuFees;
 
	// constructor
	public Student(String stuName, String stuCourse, String stuPhoneNumber, String stuFees) {
		this.stuName = stuName;
		this.stuCourse = stuCourse;
		this.stuPhoneNumber = stuPhoneNumber;
		this.stuFees = stuFees;

	}

	public static void main(String[] args) {

		Student stu1 = new Student("abc", "Webdriver", "454646464", "8000");
		System.out.println(stu1.stuName);
		System.out.println(stu1.stuCourse);
		System.out.println(stu1.stuPhoneNumber);
		System.out.println(stu1.stuFees);

		Student stu2 = new Student("XYZ", "angular js", "5465465446", "6000");

		System.out.println(stu2.stuName);
		System.out.println(stu2.stuCourse);
		System.out.println(stu2.stuPhoneNumber);
		System.out.println(stu2.stuFees);
	}

}
