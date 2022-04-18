package cinema;

import java.util.Arrays;
import java.util.Scanner;

public class Cinema {
    private static String[][] cinema;
    public static int rows;
    public static int seatsInRow;
    public static int income;
    public static int occupiedSeats;
    public static int totalIncome;
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int income = 0;
//        double occupiedSeats = 0;
//
//        // Write your code here
//      /* System.out.println("Cinema:\n  1 2 3 4 5 6 7 8\n" +
//                "1 S S S S S S S S\n" +
//                "2 S S S S S S S S\n" +
//                "3 S S S S S S S S\n" +
//                "4 S S S S S S S S\n" +
//                "5 S S S S S S S S\n" +
//                "6 S S S S S S S S\n" +
//                "7 S S S S S S S S"); */
//
//        System.out.println("Enter the number of rows:");
//        final int rows = scanner.nextInt();
//
//        System.out.println("Enter the number of seats in each row:");
//        final int seatsInRow = scanner.nextInt();
//
//        String[][] cinemaSeats = new String[rows][seatsInRow];
//
//        for (String[] seat : cinemaSeats) {
//            Arrays.fill(seat, "S");
//        }
//        System.out.println();
//
//
//
//        //System.out.println("> " + seatsInRow);
////        System.out.println("Total income: ");
////        int income;
////        if (rows * seatsInRow <= 60) {
////            income = rows * seatsInRow *10;
////        } else  {
////            income = rows / 2 * seatsInRow * 10 + rows / 2 * 8 * seatsInRow + rows % 2 * seatsInRow * 8;
////        }
////        System.out.println("$" + income);
//
//
//
//        //menu();
////        for (;;) {
////            System.out.println("1. Show the seats" + "\n" + "2. Buy a ticket" + "\n" + "0. Exit");
////
////            int task = scanner.nextInt();
////
////            switch (task) {
////                case 1:
////                    showTheSeats(cinemaSeats);
////                    // break;
////
////                case 2:
////                    buyATicket(rows, seatsInRow, cinemaSeats);
////                    // break;
////                case 0:
////
////                default:
////                    break;
////            }
////
////        }
////        System.out.println("Cinema:");
////        for (String[] cinemaSeat : cinemaSeats) {
////            for (String s : cinemaSeat) {
////                System.out.print(s + " ");
////            }
////            System.out.println();
////        }
//            boolean controlFlag = true;
//            do {
//                System.out.println("1. Show the seats" + "\n" + "2. Buy a ticket" + "\n" + "3. Statistics" + "\n"
//                        + "0. Exit");
//                int task = scanner.nextInt();
//
//
//                switch (task) {
//                    case 1:
//                        showTheSeats(cinemaSeats);
//                        break;
//                    case 2:
//                        buyATicket(rows, seatsInRow, cinemaSeats, income, occupiedSeats);
//                        break;
//                    case 3:
//                        Statistics(occupiedSeats, rows, seatsInRow, income);
//                    case 0:
//                        controlFlag = false;
//                        scanner.close();
//                        break;
//                    default:
//                        break;
//                }
//
//            } while(controlFlag);
//
//    }
//
//    public static void showTheSeats (String[][] cinemaSeats) {
//
//        System.out.print("\n" + "Cinema:\n  ");
//            for (int i = 0; i < cinemaSeats[0].length; i++) { //szerokosc = 8
//                System.out.print(i + 1 + " ");
//            }
//        System.out.println();
//
//            for (int i = 0; i < cinemaSeats.length; i++) {
//                for (int j = 0; j <= cinemaSeats[i].length; j++) {
//                    if (j == 0) {
//                        System.out.print(i + 1 + " ");
//                    } else {
//                        System.out.print(cinemaSeats[i][j - 1] + " ");
//                    }
//                }
//                System.out.println();
//            }
//        System.out.println();
//    }
//
//    public static void buyATicket(int rows, int seatsInRow, String[][] cinemaSeats, int income, double occupiedSeats) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("\n" + "Enter a row number:");
//        int rowNumber = scanner.nextInt();
//
//        System.out.println("Enter a seat number in that row:");
//        int seatNumber = scanner.nextInt();
//
//        int ticketPrice;
//
//        if (rows * seatsInRow <= 60) {
//            ticketPrice = 10;
//        } else  {
//            if (rowNumber < rows / 2 + rows % 2) {
//                ticketPrice = 10;
//            } else {
//                ticketPrice = 8;
//            }
//
//        }
//
//        if (cinemaSeats[rowNumber - 1][seatNumber - 1] == "B") {
//            System.out.println("That ticket has already been purchased!");
//        } else {
//            System.out.println("Ticket price: $" + ticketPrice + "\n");
//            income += ticketPrice;
//            occupiedSeats++;
//            cinemaSeats[rowNumber - 1][seatNumber - 1] = "B";
//        }
//
//        do {
//
//        }
//
//
//
//        //return income;
//    }
//    public static void Statistics(double occupiedSeats, int rows, int seatsInRow, int income) {
//        int totalIncome = 0;
//
//        int size = rows * seatsInRow;
//
//        double percentage = occupiedSeats / size;
//
//        if (rows * seatsInRow <= 60) {
//            totalIncome = rows * seatsInRow *10;
//        } else  {
//            totalIncome = rows / 2 * seatsInRow * 10 + rows / 2 * 8 * seatsInRow + rows % 2 * seatsInRow * 8;
//        }
//
//        System.out.println("Number of purchased tickets: " + occupiedSeats + "\n" +
//                "Percentage:" + percentage + "\n" +
//                "Current income: " + income + "\n" +
//                "Total income: " + totalIncome);
//
//
//    }
//
//    public static void menu() {
//        System.out.println("1. Show the seats" + "\n" + "2. Buy a ticket" + "\n" + "0. Exit");
//
//    }

    public static void main(String[] args) {
        createCinema();
        menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        boolean controlFlag = true;
        do {
            System.out.println("1. Show the seats" + "\n" + "2. Buy a ticket" + "\n" + "3. Statistics" + "\n"
                        + "0. Exit");
            int task = scanner.nextInt();


            switch (task) {
                    case 1:
                        showTheSeats();
                        break;
                    case 2:
                        buyATicket();
                        break;
                    case 3:
                        Statistics();
                        break;
                    case 0:
                        controlFlag = false;
                        scanner.close();
                        break;
                    default:
                        break;
                }

        } while(controlFlag);
    }

    public static void createCinema() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        rows = scanner.nextInt();

        System.out.println("Enter the number of seats in each row:");
        seatsInRow = scanner.nextInt();

        String[][] cinemaSeats = new String[rows][seatsInRow];

        for (String[] seat : cinemaSeats) {
            Arrays.fill(seat, "S");
        }
        cinema = cinemaSeats;

//        for (int i = 0; i < cinema.length - 1; i++) {
//            for (String seat : cinema[i]) {
//                System.out.print(seat + " ");
//            }
//            System.out.println();
//        }

        if (rows * seatsInRow <= 60) {
            totalIncome = rows * seatsInRow * 10;
        } else  {
            totalIncome = rows / 2 * seatsInRow * 10 + rows / 2 * 8 * seatsInRow + rows % 2 * seatsInRow * 8;
        }

        System.out.println();


    }

    public static void showTheSeats() {
        System.out.print("\n" + "Cinema:\n  ");
            for (int i = 0; i < cinema[0].length; i++) { //szerokosc = 8
                System.out.print(i + 1 + " ");
            }
        System.out.println();

            for (int i = 0; i < cinema.length; i++) {
                for (int j = 0; j <= cinema[i].length; j++) {
                    if (j == 0) {
                        System.out.print(i + 1 + " ");
                    } else {
                        System.out.print(cinema[i][j - 1] + " "); // j - 1 poniewaz pierwsz j odnoszaszcy sie do seatow
                        // jest rowny 1, co oznacza ze bysmy pomineli jedną kolumne
                    }
                }
                System.out.println();
            }
        System.out.println();
    }

    public static void buyATicket() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n" + "Enter a row number:");
        int rowNumber = scanner.nextInt();

        System.out.println("Enter a seat number in that row:");
        int seatNumber = scanner.nextInt();

        int ticketPrice;

        // petla dopki zle


        while (rowNumber > cinema.length || rowNumber < 0 || seatNumber > cinema[rowNumber - 1].length ||
                seatNumber < 0 ) {
            System.out.println("Wrong input!");
            System.out.println("\n" + "Enter a row number1:");
            rowNumber = scanner.nextInt();

            System.out.println("Enter a seat number in that row1:");
            seatNumber = scanner.nextInt();
        }

        while (cinema[rowNumber - 1][seatNumber - 1].equals("B")) {
            System.out.println("That ticket has already been purchased");
            System.out.println("\n" + "Enter a row number:");
            rowNumber = scanner.nextInt();

            System.out.println("Enter a seat number in that row:");
            seatNumber = scanner.nextInt();
        }

        // printy itd

        if (rows * seatsInRow <= 60 || rowNumber < rows / 2 + rows % 2) {
                ticketPrice = 10;
            } else {
                ticketPrice = 8;
            }

        System.out.println("Ticket price: $" + ticketPrice + "\n");
        income += ticketPrice;
        occupiedSeats++;
        cinema[rowNumber - 1][seatNumber - 1] = "B";

    }

    public static void Statistics() {
        double size = rows * seatsInRow;

        double percentage = occupiedSeats / size * 100;

        System.out.printf("Number of purchased tickets: %d \nPercentage: %.2f%% \nCurrent income: $%d \n" +
                "Total income: $%d \n",
                occupiedSeats, percentage, income, totalIncome);
    }

}