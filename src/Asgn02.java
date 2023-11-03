import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;

public class Asgn02 {
	public final static String filename = "AstrologyQuiz.txt";
	public final static int MAX_OPTIONS_LIMIT = 4;

	public static void main(String[] args) {
		int numOfQuestions;
		String question;
		Question[] questions = null;

		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));

			numOfQuestions = Integer.parseInt(br.readLine()); // Scan first line for integer number and assign the value
																// to variable
			questions = new Question[numOfQuestions]; // Using the value stored, we have size of our array of objects.

			// Read file and assign question, options, and correct answer
			for (int i = 0; i < numOfQuestions; i++) {
				String correctAnswer = "";
				int correctAnswerIndex = -1; // Index range from 0 to 3, so we start from -1
				question = br.readLine(); // Store next line string value as our question
				String[] options = new String[MAX_OPTIONS_LIMIT]; // Size for options are fixed to 4

				// Since the text file shows 4 options after a question, use for loop to store options
				for (int j = 0; j < MAX_OPTIONS_LIMIT; j++) {
					String option = br.readLine(); // Initialize and store value to option
					
					//Condition checking for the correct answer
					if (option.startsWith("*")) {
						correctAnswer = option.substring(1); // store correct answer but take out the * symbol
						correctAnswerIndex = j; // also assign the value if the condition is valid
						option = correctAnswer; // update option value by removing * symbol
					}
					options[j] = option; 
				}
				questions[i] = new Question(question, options, correctAnswer, correctAnswerIndex); // Declare object with constructor from valued generated above.
			}
			br.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
		InitiateQuiz(questions); // Using method to initiate quiz

	}

	
	// Method for initiating Quiz
	public static void InitiateQuiz(Question[] questions) {
		Scanner scanner = new Scanner(System.in);
		int score = 0;
		System.out.println("Welcome to Astrology Test");

		// Using for loop to print questions
		for (int i = 0; i < questions.length; i++) {
			System.out.println("Question " + (i + 1) + ": " + questions[i]);
			questions[i].printOptions(); // print options
			String userAnswer = AskUserInput(scanner); // Using method to ask user input

			// Use method to validate answer, also check condition if it's correct, score increases by 1
			if (ValidateAnswer(userAnswer, questions[i].convertCorrectAnswerIndex(), questions)) {
				score++;
			}
		}
		System.out.println("Total score: " + score + " out of " + questions.length);
		scanner.close();
	}

	// Method to ask user input
	public static String AskUserInput(Scanner scanner) {
		System.out.print("Enter your answer (A, B, C, or D): ");
		return scanner.nextLine();
	}
	
	// Method to validate answer and return boolean value
	public static Boolean ValidateAnswer(String userAns, String correctAns, Question[] questions) {
		Boolean isCorrectAnswer = false;
		if (userAns.equals(correctAns)) {
			System.out.println("Correct.");
			isCorrectAnswer = true;
		} else {
			System.out.println("Incorrect. The correct answer is " + correctAns);
			isCorrectAnswer = false;
		}
		return isCorrectAnswer;
	}
}
