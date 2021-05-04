package odev2;

public class Course {
	
	public Course() {
		
	}
	
	public Course(int id,String name,String educatorName,int completion) {
		
		this.id=id;
		this.name=name;
		this.educatorName=educatorName;
		this.completion=completion;
	}
	
	int id;
	String name;
	String educatorName;
	int completion;
}
