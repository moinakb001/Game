import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.xml.ws.Dispatch;

import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.PixelFormat;

import java.nio.ByteBuffer;


public class Game extends Thread {

	/**
	 * @param args
	 */
	String title="";
	public Game(String title) {
		// TODO Auto-generated constructor stub
		this.title=title;
	}
	public void run() {
		// TODO Auto-generated method stub
		Display.setTitle(title);
		
			ByteArrayOutputStream out=new ByteArrayOutputStream();
			try {
				ImageIO.write(ImageIO.read(new File("C:\\Desert.jpg")), "png", out);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ByteBuffer.wrap(out.toByteArray());
		
		Display.setIcon(new ByteBuffer[]{ByteBuffer.wrap(out.toByteArray())});
	}
	

}
