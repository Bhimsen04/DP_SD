package Structural.Proxy;

public class Client {

	public static void main(String[] args) {
		Subject proxy = new Proxy();
		proxy.method();

	}

}
