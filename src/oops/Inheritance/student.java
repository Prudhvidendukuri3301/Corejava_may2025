package oops.Inheritance;

public class student extends college {

	String Studentname;
	int Studentrollno;
	String sQualification;

	public void displaystudentdetails() {

		displaycollegedetails();

		System.out.println("STUDENTNAME: " + Studentname);
		System.out.println("STUDENTROLLNO: " + Studentrollno);
		System.out.println("STUDENTQ: " + sQualification);
	}
}
