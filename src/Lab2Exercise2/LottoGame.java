package Lab2Exercise2;

import javax.swing.*;

public class LottoGame {
    public static void main(String[] args) {
        Integer userInput = getUserInput();

        if (userInput == null) {
            JOptionPane.showMessageDialog(null, "Game cancelled. Goodbye!");
            System.exit(0);
        }

        boolean userWon = false;

        for (int i = 0; i < 5; i++) {
            Lotto lotto = new Lotto();
            int lottoSum = lotto.getSum();

            String message = "Roll " + (i + 1) + ":\n" +
                    "Lotto numbers: " + arrayToString(lotto.getNumbers()) + "\n" +
                    "Sum: " + lottoSum;

            JOptionPane.showMessageDialog(null, message); //Display the message in JOptionPane

            if (lottoSum == userInput) {
                userWon = true;
                break;
            }
        }

        String resultMessage = userWon ? "Congratulations! You won!" : "Sorry, you lost the Lotto.";
        JOptionPane.showMessageDialog(null, resultMessage);
    }

        private static Integer getUserInput() {
            while (true) {
                String input = JOptionPane.showInputDialog("Choose a number between 3 and 27 (or click Cancel to exit):");
                if (input == null) {
                    return null; // User clicked Cancel
                }
                try {   //treat the input as string first then parse into int, if fail to do so, prompt invalid input.
                        //if number range over 3 to 27, prompt another error message for updated input;
                    int choice = Integer.parseInt(input);
                    if (choice >= 3 && choice <= 27) {
                        return choice;
                    } else {
                        JOptionPane.showMessageDialog(null, "Please enter a number between 3 and 27.");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number.");
                }
            }
        }

    private static String arrayToString(int[] arr) {
        StringBuilder lottoResult = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            lottoResult.append(arr[i]);
            if (i < arr.length - 1) {
                lottoResult.append(", ");
            }
        }
        return lottoResult.toString();
    }
}