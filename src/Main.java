import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] dataPoints = new int[100];

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
        for (int x = 0; x < dataPoints.length; x++) {
            sum += dataPoints[x];
        }
        System.out.println("The sum of the dataPoints is: " + sum);
        double average = (double) sum / dataPoints.length;
        System.out.println("The average of the array of dataPoints is: " + average);

    }


}

