
public class Main {

	public static void main(String[] args) {
		
		
		Student student1 = new Student();
		student1.setFirstName("Berk");
		student1.setLastName("Koç");
		student1.setEmail("berkkoc@berkkoc");
		student1.setId(0_1);
		student1.setPassword("12345");
		student1.setProcess("%0");
		String coursesTaken[] = {"Java React", "C# Angular"};
		student1.setCoursesTaken(coursesTaken);
		
		Instructor instructor1 = new Instructor();
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setEmail("engindemiroğ@engindemiroğ");
		instructor1.setId(1);
		instructor1.setPassword("1234567");
		String courses[] = {"Java React", "C# Angular", "Temel kurs"};
		instructor1.setCourses(courses);
		
		UserManager userManager = new UserManager();
		InstructorManager instructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();
		
		userManager.addUser(instructor1);
		userManager.addUser(student1);
		userManager.deleteUser(instructor1);
		userManager.deleteUser(student1);
		
		instructorManager.addCourse("Yeni kurs");
		instructorManager.giveTask();
		
		studentManager.listCoursesTaken(student1);
		
		
		

	}

}
