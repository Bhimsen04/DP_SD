package SOLID_Principles.InterfaceSeggregation.BadSolution;

/* But swiggy not accepting telephonicorder and cash payment
 so unwanted methods here , it is not a good solution*/
public class SwiggyClient implements PizzaApp {

	@Override
	public void acceptOrderOnline() {
		// TODO Auto-generated method stub

	}

	@Override
	public void acceptWalkinOrders() {
		// TODO Auto-generated method stub

	}

	@Override
	public void acceptTelephonicOrders() {
		// TODO Auto-generated method stub

	}

	@Override
	public void acceptPaymentsOnline() {
		// TODO Auto-generated method stub

	}

	@Override
	public void acceptOnlyCash() {
		// TODO Auto-generated method stub

	}

}
