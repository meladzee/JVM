import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileNumbers {
    private ReadFileNumbers() {}

    public static int[] readIntegersFromFile(String filename) throws IOException, InvalidNumberException {
        int[] result = new int[10];
        BufferedReader reader = new BufferedReader(new FileReader(C:\Users\PC\IdeaProjects\untitled\src));
        int i = 0;
        String line;
        while ((line = reader.readLine()) != null && i < result.length) {
            int number = convertToPositiveInteger(line);
            result[i] = number;
            i++;
        }
        reader.close();
        return result;
    }

    public static int sumArray(int[] arr) throws ArithmeticException {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum < 0) {
            throw new ArithmeticException("The sum of the integers in the array is negative");
        }
        return sum;
    }

    private static int convertToPositiveInteger(String line) throws InvalidNumberException {
        try {
            int number = Integer.parseInt(line);
            if (number < 0) {
                throw new InvalidNumberException("Number cannot be negative");
            }
            return number;
        } catch (NumberFormatException e) {
            throw new InvalidNumberException("The input is not an integer");
        }
    }
}
