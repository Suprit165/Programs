
//class Plane
//{
//	void takeOff()
//	{
//		System.out.println("plane is taking off");
//	}
//	
//	void fly()
//	{
//		System.out.println("plane is flying...");
//	}
//	
//	void land()
//	{
//		System.out.println("plane is landing...");
//	}
//}

//class CargoPlane extends Plane
//{
//	void fly()
//	{
//		System.out.println("CargoPlane is flying at low height...");
//	}
//	
//	void carryCargo()
//	{
//		System.out.println("CargoPlane is carrying cargo...");
//	}
//}
//
//class PassengerPlane extends Plane
//{
//	void fly()
//	{
//		System.out.println("PassengerPlane is flying at medium height...");
//	}
//	
//	void carryPassenger()
//	{
//		System.out.println("PassengerPlane is carrying passenger...");
//	}
//}
//
//class FighterPlane extends Plane
//{
//	void fly()
//	{
//		System.out.println("FighterPlane is flying at great height...");
//	}
//	
//	void carryWeapons()
//	{
//		System.out.println("FighterPlane is carrying weapons...");
//	}
//}




class EducationalInstitute
{
	void admitStudent()
	{
		System.out.println("Educational Institute admit Students");
	}
	
	void conductExams()
	{
		System.out.println("Educational Institute conduct Exams");
	}
}

class School extends EducationalInstitute
{
	void conductExam()
	{
		System.out.println("School's conduct Unit Test");
	}
	
	void conductFieldTrips()
	{
		System.out.println("School's conduct Field Trips");
	}
}

class College extends EducationalInstitute
{
	void conductExam()
	{
		System.out.println("College's conduct Internal Assessments");
	}
	
	void conductInternships()
	{
		System.out.println("College's conduct Internship");
	}
}

class University extends EducationalInstitute
{
	void conductExam()
	{
		System.out.println("University conducts Semester Exams");
	}
	
	void conductResearch()
	{
		System.out.println("University conducts Research");
	}
}




public class Day66 {

	public static void main(String[] args) {

//		CargoPlane cp = new CargoPlane();
//		PassengerPlane pp = new PassengerPlane();
//		FighterPlane fp = new FighterPlane();
//		
//		cp.takeOff();
//		cp.fly();
//		cp.land();
//		cp.carryCargo();
//		
//		System.out.println();
//		
//		pp.takeOff();
//		pp.fly();
//		pp.land();
//		pp.carryPassenger();
//		
//		System.out.println();
//		
//		fp.takeOff();
//		fp.fly();
//		fp.land();
//		fp.carryWeapons();
		
		School sc = new School();
		College col = new College();
		University uni = new University();
		
		sc.admitStudent();
		sc.conductExam();
		sc.conductFieldTrips();
		
		System.out.println();
		
		col.admitStudent();
		col.conductExam();
		col.conductInternships();
		
		System.out.println();
		
		uni.admitStudent();
		uni.conductExam();
		uni.conductResearch();
		
	}

}
