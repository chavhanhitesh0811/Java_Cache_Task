package com.java_training.assignment1.LinkedListImplementation;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class InputFunction {

	private static Logger logger = LogManager.getLogger(InputFunction.class);
	
//	function to take the input of key
	public static String keyInput(Scanner sc) {
		logger.info("Please enter a key");
		String key = sc.nextLine();
		return key;
	}
	
//	function to take the input of value
	public static String valueInput(Scanner sc) {
		logger.info("Please enter a value");
		String value = sc.nextLine();
		return value;
	}
	
//	function to take the input of task menu
	public static int menuInput(Scanner sc) {
		
		logger.info("Please select the appropriate option.");
		logger.info("1 - Insert the element.");
		logger.info("2 - Retrive the element.");
		logger.info("3 - Show record.");
		logger.info("4 - exit");
		
		int selectedOption = sc.nextInt();
		sc.nextLine();
		return selectedOption;
	}
	
//	function to take the input of operation start
	public static int startInput(Scanner sc) {
		logger.info("Please enter 1 to start");
		int start = sc.nextInt();
		return start;
	}
}
