import java.util.*;

public class swap_without_3rd_var {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("enter a value");
		int x= s.nextInt();
		System.out.println("enter 2nd value");
		int y= s.nextInt();
		x = x + y ;
		y = x - y ;
		x = x - y ;
		System.out.println("1st value is " + x +" and 2nd value is " + y);
	}

}
