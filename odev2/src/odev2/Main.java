package odev2;


public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1,"Yazýlým Geliþtirici Yetiþtirme Kampý(C# + ANGULAR)","Engin Demirog",23);
		
		
		Course course2=new Course();
		course2.id=2;
		course2.name="Yazýlým Geliþtirici Yetiþtirme Kampý(JAVA + REACT)";
		course2.educatorName="Engin Demirog";
		course2.completion=32;
		
		Course[] courses= {course1,course2};
		
		for (Course course : courses) {
			System.out.println(course.name+"-"+course.educatorName+" Tamamlandý:%"+course.completion);
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.addToCourse(course1);
		courseManager.startLesson(course1);
		
		courseManager.addToCourse(course2);
		courseManager.startLesson(course2);

	}

}
