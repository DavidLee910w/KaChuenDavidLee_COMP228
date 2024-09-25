package Lab2Exercise2;

import javax.swing.JOptionPane;
import java.util.Random;

class Lotto {
    private int[] numbers;
    private Random random;

    public Lotto() {
        numbers = new int[3];
        random = new Random();
        populateNumbers();
    }

    private void populateNumbers() {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(9) + 1; // Random number between 1 and 9
        }
    }

    public int[] getNumbers() {
        return numbers;
    }

    public int getSum() {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}


