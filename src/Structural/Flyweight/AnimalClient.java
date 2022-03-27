package Structural.Flyweight;

public class AnimalClient {

	public static void main(String[] args) {
		Animal catAnimal = AnimalFactory.getCat("CAT");
		catAnimal.printAnimalAttributes();

		Animal catAnimal2 = AnimalFactory.getCat("CAT");
		catAnimal2.printAnimalAttributes();

		Animal cowAnimal = AnimalFactory.getCat("COW");
		cowAnimal.printAnimalAttributes();

		Animal dogAnimal = AnimalFactory.getCat("DOG");
		dogAnimal.printAnimalAttributes();
		
		System.out.println(catAnimal.hashCode());
		System.out.println(catAnimal2.hashCode());
		
		System.out.println(cowAnimal.hashCode());


	}

}
