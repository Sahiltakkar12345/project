import java.util.*;

public class Disount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter product name");
		String name= s.next();
		System.out.println("enter product price");
		int price= s.nextInt();
		
		if(price>2000)
		{
			int dis = (price*10)/100;
			dis=price-dis;
			System.out.println("Discounted price " + dis);
		}
		else
		{
			int dis = (price*7)/100;
			dis=price-dis;
			System.out.println("Discounted price" + dis);	
		}
			
		
	}

}
