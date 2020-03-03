
public class SphereArea implements ISubscriber {
	@Override
	public void notifySubscriber(String input) throws NumberFormatException {
		
        double num =  Double.parseDouble(input);
        try{
            if(num >= 0){
                double sphereArea = 4 * Math.PI * Math.sqrt(num);
                System.out.println("Sphere area = " + sphereArea);
            }else {
                throw new Exception ("Error, number can't be negative.");
            }
        }catch (Exception e){
            System.out.println("Positive number required");
        }
	}

}
