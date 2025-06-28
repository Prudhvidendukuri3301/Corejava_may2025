package oops.Inheritance;

public class Faculty extends student {
	String fName;
	String subject;

	public void displayFacultyDetails() {
		displaycollegedetails();
		System.out.println("Fculty Name: " + fName);
		System.out.println("Subject: " + subject);
	}

}
