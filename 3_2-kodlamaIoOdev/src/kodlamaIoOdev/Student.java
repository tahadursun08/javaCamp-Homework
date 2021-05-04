package kodlamaIoOdev;

public class Student extends User{
	private String university;
	private String numberOfLessonsTaken;
	
	@Override
	public void add(String message) {
		System.out.println("Ogrenci: " +message);
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getNumberOfLessonsTaken() {
		return numberOfLessonsTaken;
	}

	public void setNumberOfLessonsTaken(String numberOfLessonsTaken) {
		this.numberOfLessonsTaken = numberOfLessonsTaken;
	}

}
