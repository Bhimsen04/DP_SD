package Creational.Abstract_Factory;

public class ProfessionFactory extends AbstractFactory {

	public Profession getProfession(String profession) {
		if (profession != null && !profession.isEmpty())
			if (profession.equalsIgnoreCase("engineer"))
				return new Engineer();
			else if (profession.equalsIgnoreCase("teacher"))
				return new Teacher();
		return null;
	}
}
