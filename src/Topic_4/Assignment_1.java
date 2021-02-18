package Topic_4;

public class Assignment_1 {

	public static void main(String[] args) 
	{
		for (int i = 0; i <5; i++) 
		{
			Runnable r = new Runnable1();
	        Thread t = new Thread(r);
	        t.start();
			
		}
        
     
    }

}

class Runnable1 implements Runnable
{
    public void run()
    {
        int no =(int)(Math.random()*10);
        Runnable r2 = new Runnable2(no);
        System.out.println("no--->"+no);
        Thread t2 = new Thread(r2);
        t2.start();
        
    }
}

class Runnable2 implements Runnable
{
	int no;
	public Runnable2(int no)
	{
		this.no=no;
	}
	
    public void run()
    {
        int fact=1;
        for(int i=1;i<=no;i++)
        {
        	fact+=fact*i;
        }
        System.out.println("factorial--->"+fact);
    }
}

