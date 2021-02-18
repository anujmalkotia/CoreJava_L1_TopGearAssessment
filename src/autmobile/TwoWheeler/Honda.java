package autmobile.TwoWheeler;

import autmobile.Vehicle;

public class Honda extends Vehicle 
{

	public int speed()
	{
		return 66;
		
	}
	public int cdplayer()
	{
		System.out.println("Cd player is working fine");
		System.out.print("no of Cd player is ");
		return 1;
		
	}
	@Override
	public String modelName() 
	{
		return "HOND CITY";
	}

	@Override
	public String registrationNumber() 
	{
		return "DL 2BS 7785";
	}

	@Override
	public String ownerName() 
	{
		return "Neeraj";
	}

}
