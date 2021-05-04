package kodlamaIoOdev;

public class Instructor extends User{
	private String branch;
	private String graduateSchool;
	private String numberOfLessonsTaught;
	@Override
	public void add(String message) {
		System.out.println("Ogretmen: "+ message);
	}
	
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getGraduateSchool() {
		return graduateSchool;
	}
	public void setGraduateSchool(String graduateSchool) {
		this.graduateSchool = graduateSchool;
	}

	public String getNumberOfLessonsTaught() {
		return numberOfLessonsTaught;
	}

	public void setNumberOfLessonsTaught(String numberOfLessonsTaught) {
		this.numberOfLessonsTaught = numberOfLessonsTaught;
	}
	
}
