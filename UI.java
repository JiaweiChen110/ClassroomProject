import java.util.ArrayList;
import java.util.Scanner;

public class UI {
	
	public static void main(String[] args) {
		int numStudent = 0;
		ArrayList<Student> arr = new ArrayList<>();
		
		while(true) {
			System.out.println("Please enter 1 to add new student");
			System.out.println("Please enter 2 to remove student");
			System.out.println("Please enter 3 to update student information using id");
			System.out.println("Please enter 4 to list all students in the class");
			Scanner scan = new Scanner(System.in);
			int t = scan.nextInt();
			if (t == 1 && numStudent > 9) {
				System.out.println("Class is full, can not add anymore student");
			}
			if (t == 1) {
				Student s = new Student();
				System.out.println("Please Enter the first name");
				s.setFirstName(scan.next());
				System.out.println("Please Enter the last name");
				s.setLastName(scan.next());
				System.out.println("Please Enter the phone number");
				s.setPhoneNumber(scan.nextInt());
				System.out.println("Please Enter the SSN");
				s.setSSN(scan.nextInt());
				System.out.println("Please Enter the GPA");
				s.setGPA(scan.nextDouble());
				System.out.println("Please Enter the Student ID");
				s.setStudentID(scan.nextLong());
				System.out.println("Please Enter the Email");
				s.setEmail(scan.next());
				arr.add(s);
				System.out.println(arr.get(0).getFirstName());
			} else if (t == 2) {
				System.out.println("Please enter the student ID to update the student information in the class");
				long ans = scan.nextLong();
				for (int i = 0; i < arr.size(); i++) {
					if (arr.get(i).getStudentID() == ans) {
						arr.remove(i);
						break;
					}
				}
			} else if (t == 3) {
				System.out.println("Please enter the student ID to remove from the class");
				long ans = scan.nextLong();
				for (int i = 0; i < arr.size(); i++) {
					if (arr.get(i).getStudentID() == ans) {
						System.out.println("Please Enter the first name");
						arr.get(i).setFirstName(scan.next());
						System.out.println("Please Enter the last name");
						arr.get(i).setLastName(scan.next());
						System.out.println("Please Enter the phone number");
						arr.get(i).setPhoneNumber(scan.nextInt());
						System.out.println("Please Enter the SSN");
						arr.get(i).setSSN(scan.nextInt());
						System.out.println("Please Enter the GPA");
						arr.get(i).setGPA(scan.nextDouble());
						System.out.println("Please Enter the Student ID");
						arr.get(i).setStudentID(scan.nextLong());
						System.out.println("Please Enter the Email");
						arr.get(i).setEmail(scan.next());
						break;
					}
				}
				System.out.println("There is no student with that id in the class");
			} else if (t == 4){
				System.out.println("Here are the students listed in the class");
				for (Student i:arr) {
					System.out.println("testing");
					System.out.println(i.getFirstName() + " , " + i.getLastName() + " , " + i.getPhoneNumber() + " , " + i.getSSN() + " , " + i.getGPA() + " , " + i.getStudentID() + " , "+ i.getEmail());
				}
			}
		}
	}
}
