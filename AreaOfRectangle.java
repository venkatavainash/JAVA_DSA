import java.util.*;

public class AreaOfRectangle {

	
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
	    System.out.println("enter the length of the rectangle:");
	    int a = obj.nextInt();
	    System.out.println("enter the breadth of the rectangle:");
	    int b = obj.nextInt();
	    int Area = a*b;
	    System.out.println("area Of The Rectangle :" + Area);
	}

}
