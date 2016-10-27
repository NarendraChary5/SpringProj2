package beans;

public class BlueDart implements  Courier{
	@Override
	public void delever(int order_id) {
		System.out.println(order_id+" is ready to delever with BlueDart");
	}
}
