public class SphereVolume implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {
        // TODO Auto-generated method stub
        try
        {
            // checking valid number
            double r =  Double.parseDouble(input);
            try{
                if(r >= 0){
                    double sphereVolume = (4.0 / 3.0) * (Math.PI) * (Math.pow(r , 3));
                    System.out.println("Sphere Volume  = " + sphereVolume);
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


