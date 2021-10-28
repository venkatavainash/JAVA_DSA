import java.util.*;
public class SimpleIntrest {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the principle amount :\n");
		int principle = obj.nextInt();
		System.out.println("enter the time period :\n");
		int time = obj.nextInt();
		System.out.println("enter the rate of interest :\n");
		int rate = obj.nextInt();
		float simpleinterest = (principle*time*rate)/100;
		System.out.println("interest of the given principle : " + simpleinterest);
	}

}
