
public class CircleVolum implements ISubscriber{

	public void notifySubscriber(String in) {
		try {
		Double r= Double.valueOf(in);
		if (r<0) {
			System.out.println("The radius needs to be positive");
		}
		else {
		Double res=(4.0/3.0)*Math.PI*r*r*r;
		System.out.println("Circle volume =  "+res);
		}
	}
		catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
}
