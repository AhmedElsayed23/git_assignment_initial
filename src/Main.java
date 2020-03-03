import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	private static ISubscriber subscribers [] = {
			//new SimpleSubscriber(),
			//new ReallySimpleSubscriber(),
			new circleArea(),
			new CircleCircumference(),
			new CircleVolum(),
			new SphereArea(),
			new SphereCircumference(),
			new SphereVolume(),
			new TwoPowerN(),
	};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(  "1- Circle Area\n"
						+  "2- Circle Circumference\n"
				 		+  "3- Circle Volume\n"
						+  "4- Sphere Area\n"
				 		+  "5- Sphere Circumference\n"
						+  "6- Sphere Volume\n"
				 		+  "7- Two Power N\n"
						+  "8- Execute All functions\n"
						+  "9- Exit Program\n");
		int option;
		while(true) {
			System.out.print("Enter Your Choice : ");
			try {	
				option = sc.nextInt();
				switch (option) {
				
				case 1:
					System.out.print("Enter input = ");
					String input = sc.next();
					circleArea c = new circleArea();
					c.notifySubscriber(input);
					break;
				
				case 2:
					System.out.print("Enter input = ");
					input = sc.next();
					CircleCircumference cf = new CircleCircumference();
					cf.notifySubscriber(input);
					break;
		
				case 3:
					System.out.print("Enter input = ");
					input = sc.next();
					CircleVolum cv = new CircleVolum();
					cv.notifySubscriber(input);
					break;
			
				case 4:
					System.out.print("Enter input = ");
					input = sc.next();
					SphereArea s = new SphereArea();
					s.notifySubscriber(input);
					break;
				
				case 5:
					System.out.print("Enter input = ");
					input = sc.next();
					SphereCircumference sf = new SphereCircumference();
					sf.notifySubscriber(input);
					break;
				
				case 6:
					System.out.print("Enter input = ");
					input = sc.next();
					SphereVolume sv = new SphereVolume();
					sv.notifySubscriber(input);
					break;
				
				case 7:
					System.out.print("Enter input = ");
					input = sc.next();
					TwoPowerN p = new TwoPowerN();
					p.notifySubscriber(input);
					break;
				
				case 8:
					System.out.print("Enter input = ");
					input = sc.next();
					Topic mathTopic = new Topic();
					for (ISubscriber sub : subscribers) {
						mathTopic.addSubscriber(sub);
					}
					mathTopic.dispatchEvent(input);
					break;
			
				case 9:
					System.out.println("Exit Successfully.");
					System.exit(0);
					break;
			
				default:
					System.out.println("Invalid option");
					break;
				}
		
			}catch (InputMismatchException e) {
				// TODO: handle exception
				System.err.println("Invalid option exce\n");
				sc.next();
				continue;
			}
			
		}
	}
}
