package Structural.Flyweight;

import java.util.HashMap;

public class AnimalFactory {

	private static final HashMap<String, Animal> animalMap = new HashMap<String, Animal>();

	public static Animal getCat(String name) {
		String key = name.toUpperCase() + "-CAT";
		Animal animal = animalMap.get(key);

		if (animal != null) {
			return animal;
		} else {
			animal = new Cat();
			animal.setName(name);
			animalMap.put(key, animal);
		}
		return animal;
	}

	public static Animal getDog(String name) {
		String key = name.toUpperCase() + "-DOG";
		Animal animal = animalMap.get(key);

		if (animal != null) {
			return animal;
		} else {
			animal = new Dog();
			animal.setName(name);
			animalMap.put(key, animal);
		}
		return animal;
	}

	public static Animal getCow(String name) {
		String key = name.toUpperCase() + "-COW";
		Animal animal = animalMap.get(key);

		if (animal != null) {
			return animal;
		} else {
			animal = new Cow();
			animal.setName(name);
			animalMap.put(key, animal);
		}
		return animal;
	}

}
