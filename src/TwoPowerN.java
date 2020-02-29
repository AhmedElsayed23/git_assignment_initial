public class TwoPowerN implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {
        // TODO Auto-generated method stub
          try {
            // checking valid number
           double in = Double.parseDouble(input);
           double r = Math.pow(2, in); 
           System.out.println("2^" + input + " = " + r);

        } catch (NumberFormatException e) {
            System.out.println(input + " is not a valid number");
        }

    }
}

