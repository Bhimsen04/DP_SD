package Creational.Abstract_Factory;

public class AbstractFactoryProducer {

	public static AbstractFactory getProfession(boolean isTrainee) {
		if (isTrainee)
			return new TraineeProfessionFactory();
		else
			return new ProfessionFactory();
	}

}
