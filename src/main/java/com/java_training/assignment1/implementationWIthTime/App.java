package com.java_training.assignment1.implementationWIthTime;

import java.util.Scanner;
import com.java_training.assignment1.implementationWIthTime.TaskImplementation;

public class App {

	public static void performTask(TaskImplementation taskImpl, Scanner sc) {
		System.out.println("Please select the appropriate option.");
		System.out.println("1 - Insert the element.");
		System.out.println("2 - Retrive the element.");
		System.out.println("3 - Show record.");
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
			System.out.println("Value of key " + key + " is " + fetchedValue);
		} else if (selectedOption == 3) {
			taskImpl.showRecord();
		} else {
			System.err.println("Please select a correct option");
		}

		System.out.println("Want to continue or exit");
		System.out.println("1 - Continue");
		System.out.println("2 - Exit");
		int option = sc.nextInt();
		if (option == 1) {
			performTask(taskImpl, sc);
		}
	}

	public static void main(String[] args) {
		TaskImplementation taskImpl = new TaskImplementation();
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter 1 to start");
		int start = sc.nextInt();

//		if (start == 1) {
//			performTask(taskImpl, sc);
//		}

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
					System.out.println("Value of key " + key + " is " + fetchedValue);
				} else if (selectedOption == 3) {
					taskImpl.showRecord();
				} else {
					break;
				}
			}
		}
	}
}
