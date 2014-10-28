package test.baobaotao.MockTest;

public class MockEnvironmental implements Environmental{
	private long currentTime;
	public long getTime(){
		return currentTime;
	}
	
	public void setTime(long time){
		currentTime=time;
	}

	public void playWave(String path) {
		// TODO Auto-generated method stub
		
	}
}
