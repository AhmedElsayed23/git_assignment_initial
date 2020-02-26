public class SphereCircumference implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {
        // TODO Auto-generated method stub
        try
        {
            // checking valid number
            double r =  Double.parseDouble(input);
            try{
                if(r >= 0){
                    double sphereCircumference = 2 * Math.PI * r;
                    System.out.println("Sphere circumference is " + sphereCircumference);
                }else {
                    throw new Exception ("Error, number can't be negative.");
                }
            }catch (Exception e){
                System.out.println("Positive number required");
            }

        }
        catch (NumberFormatException e)
        {
            System.out.println(input + " is not a valid integer number");
        }

    }
}