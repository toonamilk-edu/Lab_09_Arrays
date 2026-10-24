import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] dataPoints = new int[100];
        Scanner input = new Scanner(System.in);

        Random rnd = new Random();
        for (int x = 0; x < dataPoints.length; x++) {
            dataPoints[x] = rnd.nextInt(100) + 1;

        }
        System.out.print("Data Points: ");
        for (int x = 0; x < dataPoints.length; x++) {
            System.out.print(dataPoints[x] + " | ");
        }
        System.out.println();
        int sum = 0;
        int counter = 0;
        for (int x = 0; x < dataPoints.length; x++) {
            sum += dataPoints[x];

        }
        System.out.println("The sum of the dataPoints is: " + sum);
        double average = (double) sum / dataPoints.length;
        System.out.println("The average of the array of dataPoints is: " + average);

        int search = SafeInput.getRangedInt(input, "Enter a number to search for", 1, 100);
        for (int x = 0; x < dataPoints.length; x++) {
            if (dataPoints[x] == search) {
                counter++;
            }
        }
        System.out.println("The number of times your number appears " + search + " is: " + counter);
        int search2 = SafeInput.getRangedInt(input, "Enter a number to find in the array", 1, 100);
        int foundIndex = -1;
        for (int x = 0; x < dataPoints.length; x++) {
            if (dataPoints[x] == search2) {
                foundIndex = x;
                break;
            }
        }
        if (foundIndex != -1) {
            System.out.println("The number " + search2 + " was found at index " + foundIndex);
        } else {
            System.out.println("The number " + search2 + " was not found in the array.");
        }

        int min = dataPoints[0];
        int max = dataPoints[0];
        for (int x = 0; x < dataPoints.length; x++) {
            if (dataPoints[x] < min) {
                min = dataPoints[x];
            }
            if (dataPoints[x] > max) {
                max = dataPoints[x];
            }
        }
        System.out.println("The minimum value in the array is: " + min);
        System.out.println("The maximum value in the array is: " + max);
    }
}