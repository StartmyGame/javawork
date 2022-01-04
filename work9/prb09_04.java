package work9;

import javawk1.copy9_03;

public class prb09_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		copy9_03 tv1=new copy9_03();
		tv1.turnOn();
		tv1.setChannel(30);
		tv1.setVolume(3);
		copy9_03 tv2=new copy9_03();
		tv2.turnOn();
		tv2.channelUp();
		tv2.channelUp();
		tv2.volumeUp();
		System.out.println("tv1's channel is "+tv1.channel+" and volume level is "+tv1.volumeLevel);
		System.out.println("tv2's channel is "+tv2.channel+" and volume level is "+tv2.volumeLevel);
	}

}
