import java.net.URL;
import java.nio.ByteBuffer;

import org.lwjgl.Sys;
import org.lwjgl.opengl.GL11;

import BaseClass.Entity;
import BaseClass.Timer;
import Exceptions.NotStartedException;


public class Main {

	/**
	 * @param args
	 * @throws NotStartedException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws NotStartedException, InterruptedException {
		// TODO Auto-generated method stub
		Sys.openURL("google.com");
		printarr(new int[][]{{1,2},{1}});
		Entity a=new Entity(new double[][]{{1,-2,9.81,-5,2,-10,1}},700);
		Timer t=new Timer();
		t.startTimer();
		for (int i = 0; i < 20; i++) {
			
		
		Thread.sleep(1000);
		long time=t.getreset()/1000;
		System.out.println(time);
		a.update(time);
		System.out.println(a.get(0)[0]+" "+a.get(0)[1]);
		Thread.sleep(1000);
		 time=t.getreset()/1000;
		System.out.println(time);
		a.update(time);
		System.out.println(a.get(0)[0]+" "+a.get(0)[1]);
		}
		
		
		
		
	}
	public static void printarr(int[][] arr){
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[j].length; j++) {
				System.out.print(arr[i][j]+",");
			}
			System.out.println();
		}
	}

}
