
public class SphereVolume implements ISubscriber {
	@Override
	public void notifySubscriber(String input) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the Sphere Radius: ");
		
    	double radius = sc.nextDouble();
    	if (radius > 0) {
    		double  volume= (4.0 / 3.0) * (Math.PI) * (Math.pow(radius , 3));
    		System.out.println("The Sphere Volume is: " + volume);
    		}
            
    	else {
    		System.out.println ("NOTE: Radius must be greater than 0");
    		}
		
	}
}
