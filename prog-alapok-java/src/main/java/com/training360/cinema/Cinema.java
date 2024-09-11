package com.training360.cinema;

public class Cinema {

    private Guest[][] seats;

    public Cinema() {
        seats = new Guest[8][8];
    }

    public Cinema(int size) {
        this.seats = new Guest[size][size];
    }

    public int getSize(){
        return seats.length;
    }

    public boolean placeSeat(int row, int col, Guest guest) {

        seats[row][col] = guest;
        return true;
    }

    /*
    0 0 0
    0 1 0
    1 1 1
     */
    public void printSeats() {
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {

//                String sign = seats[i][j] != null ? "1": "0";
//                System.out.print(sign);

                System.out.print(seats[i][j] != null ? "1": "0");

//                if (seats[i][j] != null) {
//                    System.out.print("1");
//                }else {
//                    System.out.print("0");
//                }
            }
            System.out.println();
        }
    }


    public Guest getGuestBySeat(int i, int j) {
        return seats[i][j];
    }
}
