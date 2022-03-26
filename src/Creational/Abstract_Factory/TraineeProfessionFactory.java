package Creational.Abstract_Factory;

public class TraineeProfessionFactory extends AbstractFactory {

	public Profession getProfession(String profession) {
		if (profession != null && !profession.isEmpty())
			if (profession.equalsIgnoreCase("engineer"))
				return new TraineeEngineer();
			else if (profession.equalsIgnoreCase("teacher"))
				return new TraineeTeacher();
		return null;
	}
}
