package autmobile.TwoWheeler;
import autmobile.Vehicle;
public class Hero extends Vehicle 
{
	public int speed()
	{
		return 80;
		
	}
	public void radio()
	{
		System.out.println("Thanks For Choseing Hero");
		System.out.println("Radio Working Fine");
	}
	@Override
	public String modelName() 
	{
		
		return "Passion";
	}
	@Override
	public String registrationNumber() 
	{
		
		return "PN 12CAB 7788";
	}
	@Override
	public String ownerName() 
	{
		
		return "raamsingh";
	}

}
