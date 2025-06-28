package oops.Inheritance;

public class Officestaff extends Faculty {

	String officeStaffName;
	String department;

	public void displayOffceStaffDetails() {
		displaycollegedetails();
		System.out.println("Office Staff Name: " + officeStaffName);
		System.out.println("Depatment: " + department);
	}
}
