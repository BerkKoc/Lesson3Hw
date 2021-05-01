
public class Student extends User{
	private String coursesTaken[];
	private String process;
	
	

	public String[] getCoursesTaken() {
		return coursesTaken;
	}

	public void setCoursesTaken(String coursesTaken[]) {
		this.coursesTaken = coursesTaken;
	}

	public String getProcess() {
		return process;
	}

	public void setProcess(String process) {
		this.process = process;
	}

}
