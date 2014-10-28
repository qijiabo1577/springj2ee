package test.baobaotao.MockTest;

import java.util.Calendar;


public class Checker{
	private Environmental env;
	
	public Checker(Environmental envment){
		env=envment;
	}
	
	public void reminder(){
		Calendar cal=Calendar.getInstance();
		cal.setTimeInMillis(env.getTime());
		int hour=cal.get(Calendar.HOUR_OF_DAY);
		if(hour>17){
			env.playWave("aaa.wav");
		}
	}
}
