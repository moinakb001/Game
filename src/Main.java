import java.net.URL;
import java.nio.ByteBuffer;

import org.lwjgl.Sys;
import org.lwjgl.opengl.GL11;

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
		Timer time=new Timer();
		
		
		
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
