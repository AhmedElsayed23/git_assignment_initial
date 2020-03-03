
public class circleArea implements ISubscriber {
	 @Override
	    public void notifySubscriber(String input) {
	        // TODO Auto-generated method stub
	        try
	        {
	            // checking valid number
	            double r =  Double.parseDouble(input);
	            if(r >= 0){
	                 double circleArea = r * r * (Math.PI) ;
	                 System.out.println("Area of the circle = " + circleArea);
	            }else {
	            	System.out.println("Positive number required");
	            }
	        }
	        catch (NumberFormatException e)
	        {
	            System.out.println(input + " is not a valid integer number");
	        }

	    }

}
