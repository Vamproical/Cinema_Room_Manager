package cinema;

import java.util.Scanner;

public class Cinema {
    private final String[][] theater;

    public Cinema(int rows, int column) {
        theater = new String[column][rows];
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < rows; j++) {
                theater[i][j] = "S";
            }
        }
    }
    private void printCinema() {
        int k = 1;
        System.out.print("  ");
        for (int i = 1; i <= theater[0].length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (String[] strings : theater) {
            System.out.print(k + " ");
            for (int j = 0; j < theater[0].length; j++) {
                System.out.print(strings[j] + " ");
            }
            k++;
            System.out.println();
        }
    }

    private void setSeat(int i, int j) {
        theater[i - 1][j - 1] = "B";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seatsRow = scanner.nextInt();
        Cinema cinema = new Cinema(seatsRow,rows);
        System.out.println("Cinema:");
        cinema.printCinema();
        System.out.println("Enter a row number:");
        int row = scanner.nextInt();
        System.out.println("Enter a seat number in that row:");
        int seatRow = scanner.nextInt();
        System.out.println();
        System.out.println("Ticket price: $" + Price.priceSeat(rows,seatsRow,row));
        cinema.setSeat(row,seatRow);
        System.out.println();
        System.out.println("Cinema:");
        cinema.printCinema();
    }
}