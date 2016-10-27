package beans;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	Courier cour;

	public Courier getCour() {
		return cour;
	}

	public void setCour(Courier cour) {
		this.cour = cour;
	}
	/*public Flipkart() {
		System.out.println("FlipKart: 0-param constructor");
	}*/
	public Flipkart(Courier cour)
	{
//		System.out.println("FlipKart: 1-param constructor");
		this.cour = cour;
	}
	
	public void purchase(String[] items)
	{
		int order_id=0;
		Random random=new Random();
		order_id=random.nextInt(1000);
		System.out.println(Arrays.toString(items)+" are purchased and oder id is "+order_id);
		cour.delever(order_id);
	}
}
