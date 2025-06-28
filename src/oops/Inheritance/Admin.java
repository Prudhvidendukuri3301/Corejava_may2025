package oops.Inheritance;

public class Admin extends Faculty {
	String adminName;

	public void displayAdminDetails() {
		displaycollegedetails();
		System.out.println("Admin Name: " + adminName);
	}
}
