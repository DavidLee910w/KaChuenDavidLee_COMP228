package WeekThree;

public class LearningArrays {
    public static double addAllNums(double[] lst) {
        double sum = 0;
        //foreach loop type
        for (double val : lst)
        {
            sum += val;
            System.out.printf("The value of sum is: %f%n", sum);
        }
        System.out.printf("The final value of sum is: %f%n", sum);
        return sum;
    }
    public static void main(String[] args) {
        //integer array called arr
        //size of arr is 5
        int[] arr = {1,2,3,4,5};

        //we want to iterate through list
        // we will use a for loop

        for (int i = 0; i < arr.length; i++)
        {
            System.out.printf("The index is : %d... the values is :%d\n", i, arr[i]);


        }

        //foreach

        for (int val: arr)
        {
            System.out.printf("The value is : %d\n", val);
        }
        double[] array = {1,2,3,4,5};
        for (int i = 0; i < array.length; i++)
        {
            System.out.printf("The index is : %d... the values is :%.2f\n", i, array[i]);


        }
        addAllNums(array);
    }
}
