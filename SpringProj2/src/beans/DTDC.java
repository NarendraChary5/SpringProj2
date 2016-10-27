package beans;

public class DTDC implements  Courier{
	public DTDC() {
		System.out.println("DTDC: 0-param constructor");
	}
	
	@Override
	public void delever(int order_id) {
		System.out.println(order_id+" is ready to delever with DTDC");
	}
}
