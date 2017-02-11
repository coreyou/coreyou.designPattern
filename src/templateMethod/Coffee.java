package templateMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends CaffeineBeverage {

	@Override
	void brew() {
		// TODO Auto-generated method stub
		System.out.println("Dripping Coffee through filter");
	}

	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("Add Sugar and Milk");
	}
	
	@Override
	boolean customerWantsCondiments() {
		// TODO Auto-generated method stub
		String answer = getUserInput();
		
		if (answer.toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}

	private String getUserInput() {
		// TODO Auto-generated method stub
		String answer = null;
		System.out.println("Would you like milk and sugar whith your coffee (y/n)? ");
		BufferedReader in  = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (IOException exception) {
			System.err.println("IO error trying to read your answer");
		}
		if (answer == null) {
			return "no";
		}		
		
		return answer;
	}
	
	

}
