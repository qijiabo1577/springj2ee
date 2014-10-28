package test.baobaotao.MockTest;

public class SystemEnvironmental implements Environmental{
	public long getTime(){
		return System.currentTimeMillis();
	}

	public void playWave(String path) {
		// TODO Auto-generated method stub
		
	}
}
