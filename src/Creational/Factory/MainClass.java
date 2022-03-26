package Creational.Factory;

public class MainClass {

	public static void main(String[] args) {
		ProfessionFactory factory = new ProfessionFactory();
		Profession profession = factory.getProfession("doctor");
		profession.print();

	}

}
