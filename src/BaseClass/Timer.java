package BaseClass;

import org.lwjgl.Sys;

import Exceptions.NotStartedException;

public class Timer {

	/**
	 * @param args
	 */
	 long t=0;
	 boolean isstarted=false;
	 public Timer() {
		// TODO Auto-generated constructor stub
	 }
	 public void startTimer(){
		 t=Sys.getTime();
		 isstarted=true;
	 }
	 public void reset() throws NotStartedException{
		 if(!isstarted){
			 throw new NotStartedException();
		 }
		 t=Sys.getTime();
		 
	 }
	 public long get() throws NotStartedException{
		 if(!isstarted){
			 throw new NotStartedException();
		 }
		 return Sys.getTime()-t;
	 }
	 public long getreset() throws NotStartedException{
		 if(!isstarted){
			 throw new NotStartedException();
		 }
		 long ans = Sys.getTime()-t;
		 reset();
		 return ans;
	 }
	
	

}
