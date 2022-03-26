package Creational.Singleton;

public class Main_ClientClass {

	public static void main(String[] args) {
		SingletonClass obj = SingletonClass.getInstance();
		obj.simpleMethod();

		SingletonClass obj2 = SingletonClass.getInstance();
		obj2.simpleMethod();

		SingletonClass obj3 = SingletonClass.getInstance();
		obj3.simpleMethod();

		/*
		 * SingletonClass obj4 = new SingletonClass(); getting error bcz constructor is
		 * private
		 */

		/*
		 * SingletonClass obj5 = SingletonClass.singletonInstance; getting error bcz
		 * variable is private
		 */
		System.out.println("homeConstructedAtTheEnd");
	}
}
