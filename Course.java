import java.util.ArrayList;

public class Course {

		private ArrayList<Student> students = new ArrayList<>();
		private String name;
		
		public Course( String name) {
			this.name = name;
		}
		
		public void enrollStudent(Student aStudent) {
			students.add(aStudent);
		}
		
		public void printCourseDetails() {
			System.out.println("----------");
			System.out.println("Course Name: " + name);
			System.out.println("has the following students: ");
			for(Student student: students)
				System.out.println(student);
		}

		public String getName() {
			return name;
		}

		
		
}
  