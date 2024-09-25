package Lab2Exercise2;

import javax.swing.*;

public class LottoGame {
    public static void main(String[] args) {
        Integer userChoice = getUserChoice();

        if (userChoice == null) {
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

            JOptionPane.showMessageDialog(null, message);

            if (lottoSum == userChoice) {
                userWon = true;
                break;
            }
        }

        String resultMessage = userWon ? "Congratulations! You won!" : "Sorry, you lost the Lotto.";
        JOptionPane.showMessageDialog(null, resultMessage);
    }

        private static Integer getUserChoice() {
            while (true) {
                String input = JOptionPane.showInputDialog("Choose a number between 3 and 27 (or click Cancel to exit):");
                if (input == null) {
                    return null; // User clicked Cancel
                }
                try {
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
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}