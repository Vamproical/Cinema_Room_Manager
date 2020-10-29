package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seatsRow = scanner.nextInt();
        System.out.println("Total income:");
        int income;
        if (rows * seatsRow < 60) {
            income = rows * seatsRow * 10;
        } else {
            int firstHalf = rows / 2;
            int secondHalf = rows - firstHalf;
            income = firstHalf * seatsRow * 10 + secondHalf * seatsRow * 8;
        }
        System.out.println("$" + income);
    }
}