package Topic_2_Ass_2.live;

import Topic_2_Ass_2.music.Playable;
import Topic_2_Ass_2.music.string.Veena;
import Topic_2_Ass_2.music.wind.Saxophone;

public class test 
{
	public static void main(String[] args) 
	{
		Veena v=new Veena();
		Saxophone s=new Saxophone();
		v.play();
		s.play();
		Playable p1=new Veena();
		Playable p2=new Saxophone();
		p1.play();
		p2.play();
	}
}
