package Creational.Singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class WaysToBreakSingleton {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			FileNotFoundException, IOException, CloneNotSupportedException {

		SingletonClass originalSingeltonInstance = SingletonClass.getInstance();
		// originalSingeltonInstance.simpleMethod();
		System.out.println("Hashcode of originalSingeltonInstance: " + originalSingeltonInstance.hashCode());

		SingletonClass duplicateSingeltonInstance = SingletonClass.getInstance();
		// duplicateSingeltonInstance.simpleMethod();
		System.out.println("Hashcode of duplicateSingeltonInstance: " + duplicateSingeltonInstance.hashCode());

		// Ist way i.e Reflection
		System.out.println("----------------------------------------------------------");
		System.out.println("Breaking using Reflection");
		Class<?> singletonClass = Class.forName("Creational.Singleton.SingletonClass"); // catch hold
		Constructor<SingletonClass> constructor = (Constructor<SingletonClass>) singletonClass.getDeclaredConstructor();
		constructor.setAccessible(true); // here our singleton private constructor no more private
		SingletonClass brokenSingletonUsingReflection = constructor.newInstance();
		System.out.println("Hashcode of brokenSingletonUsingReflection: " + brokenSingletonUsingReflection.hashCode());

		// IInd way i.e Serialization
		System.out.println("----------------------------------------------------------");
		System.out.println("Breaking using Serialization");

		// Serialization process
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("E:\\serialization.ser"));
		objectOutputStream.writeObject(originalSingeltonInstance);
		objectOutputStream.close();

		// De-serialization process
		ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("E:\\serialization.ser"));
		SingletonClass brokenSingletonUsingSerialization = (SingletonClass) inputStream.readObject();
		System.out.println(
				"Hashcode of brokenSingletonUsingSerialization: " + brokenSingletonUsingSerialization.hashCode());

		// IIIrd way i.e Cloning
		System.out.println("----------------------------------------------------------");
		System.out.println("Breaking using Cloning");
		SingletonClass brokenSingletonUsingCloning = (SingletonClass) originalSingeltonInstance.clone();
		System.out.println("Hashcode of brokenSingletonUsingCloning: " + brokenSingletonUsingCloning.hashCode());
	}
}
