package oops.Inheritance;

public class useCollegeData {

	public static void main(String[] args) {
		Faculty Fac = new Faculty();
		Fac.fName = "prudhvi";
		Fac.subject = "Testing";

		Fac.displayFacultyDetails();

		student S1 = new student();

		S1.Studentname = "varma";
		S1.Studentrollno = 999;
		S1.sQualification = "B.tech";

		S1.displaystudentdetails();

	}
}
