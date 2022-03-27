package Structural.Proxy;

public class Proxy extends RealSubject {

	@Override
	public void method() {
		System.out.println("I am proxy, will perform authentication and security checks");
		// logic to check if user is authenticate or not
		// if yes, call real obj method else don't call below method or throw exception
		System.out.println("Calling real method of real subject implementing class after the call is authenticated");
		super.method();
	}
}
