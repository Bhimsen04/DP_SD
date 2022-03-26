package Creational.Prototype;

public class Main_ClientClass {

	public static void main(String[] args) {
		ProfessionCache.loadProfessionCache();
		Profession docProfession = ProfessionCache.getCloneNewProfession(1);
		System.out.println(docProfession);
	
		Profession docProfession2 = ProfessionCache.getCloneNewProfession(1);
		System.out.println(docProfession2);
		

	}

}
