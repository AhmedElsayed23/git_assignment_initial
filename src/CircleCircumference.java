
public class CircleCircumference  implements ISubscriber{

	@Override
	public void notifySubscriber(String input) { 
		// TODO Auto-generated method stub
		try {
            
            double radius =  Double.parseDouble(input);
                if(radius >= 0){
                    double circlecircumference = 2 * Math.PI * radius;
                    System.out.println("circle circumference = " + circlecircumference);
                }else {
                	 System.out.println("Positive number required");
                }
		}
        catch (NumberFormatException e)
        {
            System.out.println(input + " is not an integer number");
        }

    
		}
}