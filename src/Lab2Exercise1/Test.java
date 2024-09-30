package Lab2Exercise1;

import javax.swing.JOptionPane;
import java.util.Random;

public class Test {
    private String[] questions = {
            "Which of the following typically groups related classes so that they could be imported into programs and reused??",
            "Which of the following statements is false about Java method statements?",
            "Method arguments may be______________________________",
            "What does Math static method Math.ceil(x) do?",
            "There are variables for which each object of a class does not need its own separate copy. They are called_______________."
    };

    private String[][] options = {
            {"Method",
                    "Package",
                    "IDE",
                    "Function"},
            {"Statements in a method body determine the behavior of an object.",
                    "Statements in a method body is written only once",
                    "Statements in a method body are not hidden from other methods.",
                    "Statements in a method body use existing classes and methods as building blocks to create new programs."},

            {"constants, variables, or expressions.",
                    "only constants.",
                    "only strings.",
                    "only variables"},
            {"Rounds x to the largest integer not greater than x.",
                    "Rounds x to it is absolute value.",
                    "Round x to the smallest integer not less than x",
                    "Rounds x to the smallest integer smaller than x."},
            {"constants",
                    "local variables",
                    "instance variables",
                    "class variables"}
    };

    private int[] answers = {1, 2, 0, 2, 3};
    private int correctCount = 0;
    private int incorrectCount = 0;
    private Random random = new Random();

    public void inputAnswer() {
        for (int i = 0; i < questions.length; i++) {
            simulateQuestion(i);
        }
        displayResults();
    }

    private void simulateQuestion(int questionIndex) {
        String input = (String) JOptionPane.showInputDialog(
                null,
                questions[questionIndex],
                "JAVA Programming Test",
                JOptionPane.PLAIN_MESSAGE,
                null,
                options[questionIndex],
                options[questionIndex][0]
        );

        int selectedOption = -1;
        for (int i = 0; i < options[questionIndex].length; i++) {
            if (options[questionIndex][i].equals(input)) {
                selectedOption = i;
                break;
            }
        }

        checkAnswer(selectedOption, questionIndex);
    }

    private void checkAnswer(int selectedOption, int questionIndex) {
        if (selectedOption == answers[questionIndex]) {
            correctCount++;
            JOptionPane.showMessageDialog(null, generateMessage(true));
        } else {
            incorrectCount++;
            JOptionPane.showMessageDialog(null, generateMessage(false) + " The correct answer was " + options[questionIndex][answers[questionIndex]] + ".");
        }
    }

    private String generateMessage(boolean isCorrect) {
        String[] correctMessages = {"Excellent!", "Good!", "Keep up the good work!", "Nice work!"};
        String[] incorrectMessages = {"No. Please try again", "Wrong. Try once more", "Don't give up!", "No. Keep trying.."};

        int messageIndex = random.nextInt(4);
        return isCorrect ? correctMessages[messageIndex] : incorrectMessages[messageIndex];
    }

    private void displayResults() {
        int totalQuestions = questions.length;
        double percentage = ((double) correctCount / totalQuestions) * 100;
        JOptionPane.showMessageDialog(null,
                "Correct Answers: " + correctCount + "\n" +
                        "Incorrect Answers: " + incorrectCount + "\n" +
                        "Percentage Correct: " + String.format("%.2f", percentage) + "%");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.inputAnswer();
    }
}