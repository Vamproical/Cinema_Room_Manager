package cinema;

import java.util.Scanner;

public class Cinema {
    private final Scanner scanner = new Scanner(System.in);
    private String[][] theater;

    private void fillCinema(int rows, int column) {
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

    private void menu() {
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seatsRow = scanner.nextInt();
        fillCinema(seatsRow,rows);
        boolean flag = false;
        while (!flag) {
            System.out.println();
            System.out.println("1. Show the seats\n" +
                    "2. Buy a ticket\n" +
                    "0. Exit");
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    System.out.println("Cinema:");
                    printCinema();
                    break;
                case 2:
                    System.out.println("Enter a row number:");
                    int row = scanner.nextInt();
                    System.out.println("Enter a seat number in that row:");
                    int seatRow = scanner.nextInt();
                    System.out.println();
                    System.out.println("Ticket price: $" + Price.priceSeat(rows,seatsRow,row));
                    setSeat(row,seatRow);
                    break;
                case 0:
                    flag = true;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Cinema cinema = new Cinema();
        cinema.menu();
    }
}