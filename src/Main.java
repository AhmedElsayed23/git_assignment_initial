import java.util.Scanner;

public class Main {
	private static ISubscriber subscribers [] = {
			//new SimpleSubscriber(),
			//new ReallySimpleSubscriber(),
			new SphereCircumference(),
			//new SphereVolume(),
			new CircleCircumference(),

			new CircleVolum(),
			
			new circleArea(),

	};
	public static void main(String[] args) {
		Topic mathTopic = new Topic();
		for (ISubscriber sub : subscribers) {
			mathTopic.addSubscriber(sub);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("enter input");
		String input = sc.next();
		// checking valid number
				char[] charArray = input.toCharArray();

				for (char ch : charArray) {
					// check maybe input is  negative number 
					// if no one need negative number remove this condition
					
					/*s
						condition to be reomved 
					if (ch == '-' && ch == charArray[0])
						continue;
					 */
					
					if (ch == '-' && ch == charArray[0])
						continue;
					try {
						if (!Character.isDigit(ch))
							throw new Exception("Error, number can't be negative.");
					} catch (Exception e) {
						System.out.println("only digit is required");
					}
				}
				// @Ahemd sayd can you check this try still gives me error can you fix it 
				// 
		mathTopic.dispatchEvent(input);
	}
}
