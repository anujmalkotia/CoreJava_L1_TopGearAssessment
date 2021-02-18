package autmobile.TwoWheeler;

public class mainclass {

	public static void main(String[] args) 
	{
		Hero hero=new Hero();
		Honda honda = new Honda();
		
		System.out.println(hero.ownerName());
		System.out.println(hero.modelName());
		System.out.println(hero.registrationNumber());
		System.out.println(hero.speed());
		hero.radio();
		System.out.println("**********************************");
		System.out.println(honda.ownerName());
		System.out.println(honda.modelName());
		System.out.println(honda.registrationNumber());
		System.out.println(honda.speed());
		System.out.println(honda.cdplayer());

	}

}
