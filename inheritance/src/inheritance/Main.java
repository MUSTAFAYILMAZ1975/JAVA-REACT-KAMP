package inheritance;


public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course();
		course1.setId(1);
		course1.setName("Java");
		
		
		Student student=new Student();
			student.firstName="mustafa";
			
		Instructor instructor=new Instructor();
				instructor.firstName="engin";
				instructor.courseId=1;
				
				
		UserManager userManager=new UserManager();		
		User[] users = { student, instructor };
		userManager.addMultiple(users);		
	
		
					
		
		System.out.println("***********************************");
		
		CourseManager courseManager=new CourseManager();	
		courseManager.Add(course1);
		
		System.out.println(course1.getName());
		System.out.println("***********************************");
		
		System.out.println(student.firstName);
		
		System.out.println("***********************************");
		
		System.out.println(instructor.firstName);
	}
}
