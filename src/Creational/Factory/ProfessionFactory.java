package Creational.Factory;

public class ProfessionFactory {

	public Profession getProfession(String profession) {
		if (profession != null && !profession.isEmpty())
			if (profession.equalsIgnoreCase("doctor"))
				return new Doctor();
			else if (profession.equalsIgnoreCase("engineer"))
				return new Engineer();
			else if (profession.equalsIgnoreCase("teacher"))
				return new Teacher();
		return null;
	}
}
