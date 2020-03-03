public class SphereCircumference implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {
        // TODO Auto-generated method stub
        try
        {
            // checking valid number
            double r =  Double.parseDouble(input);
       
            if(r >= 0){
                double sphereCircumference = 2 * Math.PI * r;
                System.out.println("Sphere circumference = " + sphereCircumference);
            }else {
            	System.out.println("Positive Number requird");
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println(input + " is not a valid integer number");
        }

    }
}