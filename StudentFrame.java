import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class StudentFrame extends JFrame{

	//step1
	private JPanel panel = new JPanel();
	
	//step2
	private JTextField nameField = new JTextField("Enter name");
	private JTextField idField = new JTextField("Enter id");
	private JTextField courseField = new JTextField("Enter course name");
	private JButton enrollButton = new JButton("Create and Enroll");
	private ArrayList<Course> courses = new ArrayList<>();
	
	public StudentFrame() {
		courses.add(new Course("Java"));
		courses.add(new Course("Databases"));
		courses.add(new Course("Python"));
		
		//step3
		panel.add(nameField);
		panel.add(idField);
		panel.add(courseField);
		panel.add(enrollButton);
		
		
		//step4
		this.setContentPane(panel);
		
		//step3
		ButtonListener listener = new ButtonListener();
		
		//step4
		enrollButton.addActionListener(listener);
		
		this.setVisible(true);
		this.setSize(400, 400);
		this.setTitle("Create and Enroll Student");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String name = nameField.getText();
			String id = idField.getText();
			
			Student newStudent = new Student(name,id);
			
			String courseName = courseField.getText();
			
			Course selectedCourse = null;
			for(Course course: courses) {
				if(course.getName().equals(courseName)){
					selectedCourse = course;
				}
			}
			
			selectedCourse.enrollStudent(newStudent);
			selectedCourse.printCourseDetails();
		}
		
	}
}
