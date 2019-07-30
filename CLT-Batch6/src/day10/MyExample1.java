package day10;

import java.util.Scanner;

class Questions {
	
	int points = 0;
	
	Scanner sc = new Scanner(System.in);
	
	void firstQuestion() {
		System.out.println("What is the capital of England?");
		System.out.println("1. Manchester");
		System.out.println("2. Liverpool");
		System.out.println("3. London");
		System.out.println("4. Cambridge");
		int choice = sc.nextInt();
		int correctAnswer = 3;
		
		if (choice == correctAnswer) {
			System.out.println("You are correct!");
			points++;
		} else {
			System.out.println("You are wrong!");
		}
		
		System.out.println("Your current score is " + points);
	}
	
	void secondQuestion() {
		System.out.println("\nWhat is the capital of the United States?");
		System.out.println("1. New York");
		System.out.println("2. Washington DC");
		System.out.println("3. Los Angeles");
		System.out.println("4. Miami");
		int choice = sc.nextInt();
		int correctAnswer = 2;
		
		if (choice == correctAnswer) {
			System.out.println("You are correct!");
			points++;
		} else {
			System.out.println("You are wrong!");
		}
		
		System.out.println("Your current score is " + points);
	}
	
	void thirdQuestion() {
		System.out.println("\nWhat is the capital of Italy?");
		System.out.println("1. Rome");
		System.out.println("2. Milan");
		System.out.println("3. Naples");
		System.out.println("4. Florence");
		int choice = sc.nextInt();
		int correctAnswer = 1;
		
		if (choice == correctAnswer) {
			System.out.println("You are correct!");
			points++;
		} else {
			System.out.println("You are wrong!");
		}
		
		System.out.println("Your current score is " + points);
	}
	
	void fourthQuestion() {
		System.out.println("\nWhat is the capital of France?");
		System.out.println("1. Paris");
		System.out.println("2. Marseille");
		System.out.println("3. Bordeaux");
		System.out.println("4. Nice");
		int choice = sc.nextInt();
		int correctAnswer = 1;
		
		if (choice == correctAnswer) {
			System.out.println("You are correct!");
			points++;
		} else {
			System.out.println("You are wrong!");
		}
		
		System.out.println("Your current score is " + points);
	}
	
	void fifthQuestion() {
		System.out.println("\nWhat is the capital of Germany?");
		System.out.println("1. Munich");
		System.out.println("2. Hamburg");
		System.out.println("3. Stuttgart");
		System.out.println("4. Berlin");
		int choice = sc.nextInt();
		int correctAnswer = 4;
		
		if (choice == correctAnswer) {
			System.out.println("You are correct!");
			points++;
		} else {
			System.out.println("You are wrong!");
		}
		
		System.out.println("Your final score is " + points);
	}
	
}

public class MyExample1 {

	public static void main(String[] args) {
		
		Questions refQuestions = new Questions();
		
		refQuestions.firstQuestion();
		refQuestions.secondQuestion();
		refQuestions.thirdQuestion();
		refQuestions.fourthQuestion();
		refQuestions.fifthQuestion();

	}

}
