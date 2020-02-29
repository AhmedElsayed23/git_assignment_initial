import java.util.Scanner;

public class Main {
	private static ISubscriber subscribers [] = {
			//new SimpleSubscriber(),
			//new ReallySimpleSubscriber(),
			new SphereCircumference(),
			//new SphereVolume(),
			new CircleCircumference(),

			new CircleVolum()

	};
	public static void main(String[] args) {
		Topic mathTopic = new Topic();
		for (ISubscriber sub : subscribers) {
			mathTopic.addSubscriber(sub);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("enter input");
		String input = sc.next();
		mathTopic.dispatchEvent(input);
	}
}
