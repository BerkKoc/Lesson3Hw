
public class StudentManager extends UserManager{
	public void listCoursesTaken(Student student) {
		for(String course : student.getCoursesTaken()) {
			System.out.println(course);
			
		}
			
			
	}

}
