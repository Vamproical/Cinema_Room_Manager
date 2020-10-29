package cinema;

public class Price {
    public static int priceSeat(int rows, int seatsRow, int row) {
        int income;
        if (rows * seatsRow < 60) {
            income = 10;
        } else {
            int firstHalf = rows / 2;
            int secondHalf = rows - firstHalf;
            if (row <= firstHalf) {
                income = 10;
            } else {
                income = 8;
            }
        }
        return income;
    }
}
