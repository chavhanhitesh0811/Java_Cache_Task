package com.java_training.assignment1.LinkedListImplementation;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
	
	private static final String VALID_KEY_REGEX = "[a-zA-Z]{1,10}";
	
	private static Logger logger = LogManager.getLogger(App.class);

	public static void main(String[] args) {
		
		TaskImplementation taskImpl = new TaskImplementation();
		Scanner sc = new Scanner(System.in);

		int start = InputFunction.startInput(sc);

		if (start == 1) {
			while (true) {
				int selectedOption = InputFunction.menuInput(sc);

				if (selectedOption == 1) {
					
//					taking input of key
					String key = InputFunction.keyInput(sc);

					while (!key.matches(VALID_KEY_REGEX)) {
						logger.info("Please enter a key in valid format.");
						key = InputFunction.keyInput(sc);
					}
					
//					taking input of value
					String value = InputFunction.valueInput(sc);
					taskImpl.put(key, value);
					
				} else if (selectedOption == 2) {
					
//					taking input of key
					String key = InputFunction.keyInput(sc);

					while (!key.matches(VALID_KEY_REGEX)) {
						logger.error("Please enter a valid key.");
						key = InputFunction.keyInput(sc);
					}
					
//					called get method to fetch the record from cache
					String fetchedValue = taskImpl.get(key);

					if (fetchedValue.equals("Invalid key.")) {
						logger.error(fetchedValue);
					} else {
						logger.info("Value of key " + key + " is " + fetchedValue);
					}
				} else if (selectedOption == 3) {
					taskImpl.showRecord();
				} else if (selectedOption == 4) {
					break;
				} else {
					logger.error("Please select a correct option");
				}
			}
		}
		sc.close();
	}

}
