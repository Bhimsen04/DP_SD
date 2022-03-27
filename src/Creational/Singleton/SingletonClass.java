package Creational.Singleton;

import java.io.Serializable;

public class SingletonClass implements Serializable, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// private : we can't access directly.
	// static : this will get memory as soon as our class will be loaded in the
	// memory the very first time and
	// n number of times we try to create a object though we can't. bcz this is
	// static , only single time it will be loaded.
	// this is "Eager" loading
	private static SingletonClass singletonInstance = new SingletonClass();

	// we can't instantiate this class object using new keyword.
	private SingletonClass() {
		System.out.println("Singleton constructor loaded");
	}

	// get the object already available, we only have getter
	public static SingletonClass getInstance() {
		return singletonInstance;
	}

	// lazy loading
//	public static SingletonClass getInstance() {
//		if (singletonInstance == null)
//			singletonInstance = new SingletonClass();
//		return singletonInstance;
//	}

	public void simpleMethod() {
		System.out.println("Hashcode: " + singletonInstance);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
