package BaseClass;

public class Entity {

	/**
	 * @param args
	 */
	private double[][] movemat=null;
	private double[] factorials=null;
	public Entity(double[][] movemat, int precision) {
		// TODO Auto-generated constructor stub
		this.movemat=movemat;
		factorials=new double[precision];
		factorials[0]=1;
		for (int i = 1; i < factorials.length; i++) {
			factorials[i]=factorials[i-1]*i;
		}
		
	}
	public double[] get(int ind){
		return movemat[ind];
	}
	public void update(double delt){
		for (int i = 0; i < movemat.length; i++) {
			double[] arr=movemat[i];
			for (int j = 0; j < arr.length; j++) {
				arr=updateind(arr, j, delt);
			}
		}
	}
	private double[] updateind(double[] list, int ind, double t){
		for (int i = ind+1; i < list.length&&i<ind+factorials.length; i++) {
			
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
