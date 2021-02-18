package Topic_4;

import java.time.LocalTime;

public class Assignment_2 {

	public static void main(String[] args) throws InterruptedException {
		LocalTime currenttime = LocalTime.now();
		LocalTime newTime = currenttime.plusSeconds(20);
		for(int i=0;i<10;i++)
		{
			LocalTime time = LocalTime.now();
			System.out.println(newTime);
			Thread.sleep(2000);
			
		}

	}

}
