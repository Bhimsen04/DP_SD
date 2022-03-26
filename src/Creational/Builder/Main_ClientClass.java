package Creational.Builder;

public class Main_ClientClass {
	public static void main(String[] args) {
		
		// create object of required homebuilder
		EarthQuakeResistantBuilder builder = new EarthQuakeResistantBuilder();
		//FloodResistantBuilder builder2 = new FloodResistantBuilder();
		
		// create object of director that will keep an eye on your builder
		Director director = new Director(builder);
		
		director.manageRequiredHomeConstruction();
		
		Home homeConstructedAtTheEnd = director.getComplexObjectOfHome();
		
		System.out.println(homeConstructedAtTheEnd);
		System.out.println(homeConstructedAtTheEnd.floor);
		
	}
}
