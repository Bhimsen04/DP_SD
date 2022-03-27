package Structural.Flyweight;

public class Cat implements Animal {

	// Extrinsic attribute
	private String name = null;

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void printAnimalAttributes() {
		System.out.println("Name of animal is: " + this.name);
		System.out.println("Name of eyes of animal is: " + CommonShareable.eyes);
		System.out.println("Name of legs of animal is: " + CommonShareable.legs);
		System.out.println("Name of nose of animal is: " + CommonShareable.nose);
		System.out.println("Name of tail of animal is: " + CommonShareable.tail);
	}

}
