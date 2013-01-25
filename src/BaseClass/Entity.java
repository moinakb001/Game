package BaseClass;

public class Entity {

	/**
	 * @param args
	 */
	private double[][] movemat=null;
	private int[] factorials={1,1,2,6,24,120,720,5040};
	public Entity(double[][] movemat) {
		// TODO Auto-generated constructor stub
		this.movemat=movemat;
	}
	public double[] get(int ind){
		return movemat[ind];
	}
	public void update(int delt){
		for (int i = 0; i < movemat.length; i++) {
			double[] arr=movemat[i];
			for (int j = 0; j < arr.length; j++) {
				arr=updateind(arr, j, delt);
			}
		}
	}
	private double[] updateind(double[] list, int ind, int t){
		for (int i = ind; i < list.length&&i<ind+8; i++) {
			list[ind]+=(1/factorials[i-ind])*pow(t,i-ind)*list[i];
		}
		return list;
	}
	private double pow(double base, double pow){
		double res=1;
		for (int i = 0; i < pow; i++) {
			res*=base;
		}
		return res;
	}

}
