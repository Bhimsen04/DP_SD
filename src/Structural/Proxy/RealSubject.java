package Structural.Proxy;

public class RealSubject implements Subject {

	@Override
	public void method() {
		System.out.println("I am an actual impl of Subject, rest all are proxies  :D");
	}

}
