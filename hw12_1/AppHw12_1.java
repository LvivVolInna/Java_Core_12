package hw12_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AppHw12_1 {

	static void menu() {
		System.out.println();
		System.out.println("Введіть 1, щоб заповнити масив об`єктами авто, всі значення конструктора якого заповнюються рандомно");
		System.out.println("Введіть 2, щоб створити масив однакових об'єктів із випадково обраними характеристиками");
	}

	public static void main(String[] args) {
		
		System.out.println("Завдання 2.");

		Scanner scanner = new Scanner(System.in);
		List <MaterialOfHelm> materialOfHelmAL = new ArrayList <MaterialOfHelm>();
		for (MaterialOfHelm materialOfHelmValue : MaterialOfHelm.values()) {
			materialOfHelmAL.add(materialOfHelmValue);
		}
		
		while (true) {
			menu();

			switch (scanner.nextInt()) {

			case 1: {

				List <Car> carAL = new ArrayList <Car> ();
				
				for (int i = 0; i < getRandomValuesFromRange(1, 10); i++) {
					List <Car> carAL1 = new ArrayList <Car> ();
				
					for (int j = 0; j < getRandomValuesFromRange(1, 10); j++) {
						carAL1.add(new Car(getRandomValuesFromRange(80, 400),
								getRandomValuesFromRange(2000, 2021),
								new Helm(getRandomValuesFromRange(35, 50),
										materialOfHelmAL.get(getRandomValuesFromRange(0, materialOfHelmAL.size() - 1)).toString()),
								new Engine(getRandomValuesFromRange(3, 8))));
					}
					carAL.addAll(carAL1);
				}

				System.out.println(carAL);
				
				break;
			}

			case 2: {

				Car car = new Car(getRandomValuesFromRange(80, 400), getRandomValuesFromRange(2000, 2021),
						new Helm(getRandomValuesFromRange(35, 50),
								materialOfHelmAL.get(getRandomValuesFromRange(0, materialOfHelmAL.size() - 1)).toString()),
						new Engine(getRandomValuesFromRange(3, 8)));

				List <Car> carAL = new ArrayList <Car> ();

				for (int j = 0; j < getRandomValuesFromRange(1, 10); j++) {
					carAL.add(car);
				}

				System.out.println(carAL);
				
				break;
			}

			default: {
				System.out.println("Будьте уважні! Введіть цифру 1 або 2!");

				break;
			}

			}
		}
	}

	public static int getRandomValuesFromRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("Min value must be less than max value!");
		}

		Random randomValue = new Random();
		return randomValue.nextInt(max - min + 1) + min;
	}
}