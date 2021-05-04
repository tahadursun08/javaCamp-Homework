package kodlamaIoOdev;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Taha");
		student1.setLastName("Dursun");
		student1.setEmail("dursuntaha08@gmail.com");
		student1.setPassword("12345");
		student1.setPitcure("ResimTaha");
		student1.setAge("23");
		student1.setUniversity("Karabük Universitesi");
		student1.setNumberOfLessonsTaken("3");
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(2);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demirog");
		instructor1.setEmail("engindemirog@gmail.com");
		instructor1.setPassword("54321");
		instructor1.setPitcure("ResimEngin");
		instructor1.setAge("30");
		instructor1.setBranch("Yazılım");
		instructor1.setGraduateSchool("Başkent Universitesi");
		instructor1.setNumberOfLessonsTaught("5");
				
		UserManager user1=new UserManager(student1);
		user1.add();
		
		UserManager user2=new UserManager(instructor1);
		user2.add();
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.getNumberOfLessonsTaught(instructor1);
		
		StudentManager studentManager = new StudentManager();
		studentManager.getNumberOfLessonsTaken(student1);
	}

}
