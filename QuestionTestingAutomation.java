package application;

/**
 * This class represents automated test cases for the {@code Question} class and
 * its methods. It validates the expected behavior of creating, updating,
 * answering, and removing answers to questions.
 * 
 * The test cases check whether users can correctly update their own questions,
 * prevent unauthorized modifications, and manage answers appropriately.
 * <p>
 * <b>Test Cases:</b>
 * </p>
 * <ul>
 * <li><b>Test Case 1:</b> Attempt to update Alice's question as Charlie (should
 * fail).</li>
 * <li><b>Test Case 2:</b> Attempt to update Alice's question as Alice (should
 * succeed).</li>
 * <li><b>Test Case 3:</b> Attempt to update Charlie's question as Alice (should
 * fail).</li>
 * <li><b>Test Case 4:</b> Attempt to update Charlie's question as Charlie
 * (should succeed).</li>
 * <li><b>Test Case 5:</b> Attempt to remove Charlie's answer as Alex (should
 * fail).</li>
 * </ul>
 *
 * <p>
 * <b>Example Usage:</b>
 * </p>
 * 
 * <pre>{@code
 * // Creating a question by Alice
 * Question question1 = new Question("What is Java?", "Alice");
 * 
 * // Attempting to update Alice's question with an incorrect author
 * System.out.println(question1.update("Is this an example question?", "Charlie")); // false
 * 
 * // Attempting to update Alice's question with the correct author
 * System.out.println(question1.update("Is this an example question?", "Alice")); // true
 * }</pre>
 *
 * @author Anthony Rivera
 * @version 1.0
 * @since 2025-03-22
 */
public class QuestionTestingAutomation {
	/**
	 * The main method that executes various test cases for the {@code Question} and
	 * {@code Answers} classes.
	 *
	 * <p>
	 * <b>Test Cases Execution:</b>
	 * </p>
	 * 
	 * <pre>{@code
	 * // Creating a question by Alice
	 * Question question1 = new Question("What is Java?", "Alice");
	 *
	 * // Creating a question by Charlie
	 * Question question2 = new Question("How does garbage collection work?", "Charlie");
	 *
	 * // Creating Answers for Alice's question
	 * Answers AliceAnswers = new Answers("Alice");
	 *
	 * // Test updates
	 * System.out.println("Test Case 1: " + question1.update("Is this an example question?", "Charlie")); // false
	 * System.out.println("Test Case 2: " + question1.update("Is this an example question?", "Alice")); // true
	 * System.out.println("Test Case 3: " + question2.update("This is not a question!", "Alice")); // false
	 * System.out.println("Test Case 4: " + question2.update("This is not a question!", "Charlie")); // true
	 * System.out.println("Test Case 5: " + AliceAnswers.addAnswer("Is this an example question?", "Java is a programming language!", "Charlie")); // true
	 * }</pre>
	 *
	 * @param args command-line arguments (not used)
	 */
	public static void main(String[] args) {
		// Creating question by Alice
		Question question1 = new Question("What is Java?", "Alice");
		// Creating question by Charlie
		Question question2 = new Question("How does garbage collection work?", "Charlie");
		// Creating Answers for Alice's question
		Answers AliceAnswers = new Answers("Alice");
		// Test Case 1: Attempting to update Alice's question as Charlie - should fail
		System.out.println("Test Case 1: " + question1.update("Is this an example question?", "Charlie"));
		// Test Case 2: Updating Alice's question as Alice - should succeed
		System.out.println("Test Case 2: " + question1.update("Is this an example question?", "Alice"));
		// Test Case 3: Attempting to update Charlie's question as Alice - should fail
		System.out.println("Test Case 3: " + question2.update("This is not a question!", "Alice"));
		// Test Case 4: Updating Charlie's question as Charlie - should succeed
		System.out.println("Test Case 4: " + question2.update("This is not a question!", "Charlie"));
		// Test Case 5: Adding an answer from Charlie to Alice's question
		Answer CharlieAnswer = AliceAnswers.addAnswer("Is this an example question?", "Java is a programming language!",
				"Charlie");
		// Test Case 6: Attempting to remove Charlie's answer as Alex - should fail
		System.out.println(
				"Test Case 5: " + AliceAnswers.removeAnswer("Is this an example question?", CharlieAnswer, "Alex"));
		// Test Case 7: Removing Charlie's answer as Charlie - should succeed
		System.out.println(
				"Test Case 6: " + AliceAnswers.removeAnswer("Is this an example question?", CharlieAnswer, "Charlie"));
	}
}
