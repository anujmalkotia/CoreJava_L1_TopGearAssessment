package Topic_4;

public class Assignment_6 {

	public static void main(String[] args) 
	{
		A1 a=new A1();
		a= new A1();
		a= new A1();
		Runtime.getRuntime().gc(); 
	}

}
class A1
{
	A1()
	{
	System.out.println("inside class A1");
	}
	
	@Override
	protected void finalize() throws Throwable 
	{
		System.out.println("Garbage collector called");
		System.out.println("inside finalize method");
	}
}
