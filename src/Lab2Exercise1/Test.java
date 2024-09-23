package Lab2Exercise1;

import javax.swing.JOptionPane;
import java.util.Random;

public class Test {
    private String[] questions = {
            "What is 2 + 2?",
            "What is 5 x 3?",
            "What is 10 / 2?",
            "What is 7 - 3?",
            "What is 9 + 1?"
    };

    private String[][] options = {
            {"1", "2", "3", "4"},
            {"15", "10", "8", "5"},
            {"10", "5", "4", "6"},
            {"4", "5", "3", "2"},
            {"10", "11", "9", "8"}
    };

    private int[] answers = {3, 0, 1, 0, 0};
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
                "Math Test",
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