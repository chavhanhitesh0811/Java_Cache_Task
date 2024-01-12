package com.java_training.assignment1.implementation;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		TaskImplementation taskImpl = new TaskImplementation();
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter 1 to start");
		int start = sc.nextInt();

		if (start == 1) {
			while (true) {
				System.out.println("Please select the appropriate option.");
				System.out.println("1 - Insert the element.");
				System.out.println("2 - Retrive the element.");
				System.out.println("3 - Show record.");
				System.out.println("4 - exit");
				int selectedOption = sc.nextInt();
				sc.nextLine();

				if (selectedOption == 1) {
					System.out.println("Please enter a key");
					String key = sc.nextLine();
					System.out.println("Please enter a value");
					String value = sc.nextLine();
					taskImpl.put(key, value);
				} else if (selectedOption == 2) {
					System.out.println("Please enter a key");
					String key = sc.nextLine();
					String fetchedValue = taskImpl.get(key);
					
					if (fetchedValue.equals("Please enter a valid key.")) {
						System.err.println(fetchedValue);
					}
					else {
						System.out.println("Value of key " + key + " is " + fetchedValue);
					}
				} else if (selectedOption == 3) {
					taskImpl.showRecord();
				} else if(selectedOption == 4){
					break;
				}
				else {
					System.err.println("Please select a correct option");
				}
			}
		}
	}

}
