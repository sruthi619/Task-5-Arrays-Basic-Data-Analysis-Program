public class DataAnalysisApp {

    public static void main(String[] args) {
        int[] numbers = {45, 12, 89, 23, 67, 5};

        int sum = 0;
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        double average = (double) sum / numbers.length;
        System.out.println("----- Data Analysis Result -----");
        System.out.println("Sum     : " + sum);
        System.out.println("Average : " + average);
        System.out.println("Maximum : " + max);
        System.out.println("Minimum : " + min);
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println("\nSorted Array (Ascending):");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        int[][] matrix = {
                {10, 20, 30},
                {40, 50, 60}
        };

        System.out.println("\n\n2D Array Output:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        try {
            System.out.println(numbers[10]); // Invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nException Caught: Array index is out of bounds!");
        }
    }
}
