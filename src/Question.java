
public class Question {
	private String question;
	private String[] options;
	private String correctAnswer;
	private int correctAnswerIndex;

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String[] getOptions() {
		return options;
	}

	public void setOptions(String[] options) {
		this.options = options;
	}

	public String getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public int getCorrectAnswerIndex() {
		return correctAnswerIndex;
	}

	public void setCorrectAnswerIndex(int correctAnswerIndex) {
		this.correctAnswerIndex = correctAnswerIndex;
	}

	public Question() {

	}

	public Question(String question, String[] options, String correctAnswer, int correctAnswerIndex) {
		this.question = question;
		this.options = options;
		this.correctAnswer = correctAnswer;
		this.correctAnswerIndex = correctAnswerIndex;
	}

	public void printOptions() {
		System.out.println("A: " + options[0]);
		System.out.println("B: " + options[1]);
		System.out.println("C: " + options[2]);
		System.out.println("D: " + options[3]);
	}
	
	@Override
	public String toString() {
		return this.question;
	}
	
	public String convertCorrectAnswerIndex() {
		switch(this.correctAnswerIndex) {
		case 0:
			return "A";
		case 1:
			return "B";
		case 2:
			return "C";
		case 3:
			return "D";
		}
		return "Unknown";
	}	
}
