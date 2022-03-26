package Creational.Abstract_Factory;

// Double layer abstraction, factories of factories
// main class(Client) -> factory producer(EPAM) -> Abstract Factory -> trainee/professional factory -> profession -> teacher/engineer
public class MainClass {

	// client or customer, we go to the factory.
	public static void main(String[] args) {
		AbstractFactoryProducer abstractFactoryProducer = new AbstractFactoryProducer();
		// if true, we need trainee  else we need professionals
		AbstractFactory abstractFactory = abstractFactoryProducer.getProfession(true);
		// if true, now we need a trainee teacher
		Profession profession = abstractFactory.getProfession("Teacher");
		profession.print();
	}

}
