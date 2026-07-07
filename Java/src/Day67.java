
class Plane
{
	void fly()
	{
		System.out.println("Plane is flying...");
	}
}

class CargoPlane extends Plane
{
	void fly()
	{
		System.out.println("CargoPlane is flying at low height...");
	}
	
	void carryCargo()
	{
		System.out.println("CargoPlane is carrying cargo...");
	}
}

class PassengerPlane extends Plane
{
	void fly()
	{
		System.out.println("Passengerplane is flying at medium height...");
	}
	
	void carryPassenger()
	{
		System.out.println("PassengerPlane is carrying passenger...");
	}
}

class FighterPlane extends Plane
{
	void fly()
	{
		System.out.println("FighterPlane is flying at great height...");
	}
	
	void carryWeapons()
	{
		System.out.println("FighterPlane is carrying Weapons...");
	}
}


class Plane
{
	void takeOff()
	{
		System.out.println("Plane is taking off...");
	}
	
	void fly()
	{
		System.out.println("Plane is flying...");
	}
	
	void land()
	{
		System.out.println("Plane is landing...");
	}
}

class CargoPlane extends Plane
{
	void takeOff()
	{
		System.out.println("CargoPlane is taking off from a long runway...");
	}
	
	void fly()
	{
		System.out.println("CargoPlane is flying at low height...");
	}
	
	void land()
	{
		System.out.println("CargoPlane is landing on a long runway...");
	}
}

class PassengerPlane extends Plane
{
	void takeOff()
	{
		System.out.println("PassengerPlane is taking from a medium runway...");
	}
	
	void fly()
	{
		System.out.println("PassengerPlane is flying at medium height...");
	}
	
	void land()
	{
		System.out.println("PassengerPlane is landing on medium runway...");
	}
}

class FighterPlane extends Plane
{
	void takeOff()
	{
		System.out.println("FighterPlane is taking off from a short runway...");
	}
	
	void fly()
	{
		System.out.println("FighterPlane is flying at great height...");
	}
	
	void land()
	{
		System.out.println("FighterPlane is landing on a short runway...");
	}
}

class Airport
{
	void permit(Plane ref)
	{
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}





public class Day67 {

	public static void main(String[] args) {

		CargoPlane cp = new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		FighterPlane fp = new FighterPlane();
		
		cp.fly();
		pp.fly();
		fp.fly();
		
		Plane ref;
		
		ref = cp;
		ref.fly();
		((CargoPlane)(ref)).carryCargo();
		
		ref = pp;
		ref.fly();
		((PassengerPlane)(ref)).carryPassenger();
		
		ref = fp;
		ref.fly();
		((FighterPlane)(ref)).carryWeapons();
		
		Plane ref;
		
		ref = cp;
		ref.takeOff();
		ref.fly();
		ref.land();
		
		ref = pp;
		ref.takeOff();
		ref.fly();
		ref.land();
		
		ref = fp;
		ref.takeOff();
		ref.fly();
		ref.land();
		
		Airport a = new Airport();
		a.permit(cp);
		a.permit(pp);
		a.permit(fp);
	}

}
