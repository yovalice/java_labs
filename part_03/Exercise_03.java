package part_03;
import java.util.Random;

/**
 Implement the following methods
 */

class Exercise_03 {

    public static void main(String[] strings) {

        // use a for loop to iterate 1000 times {
        // Generate a random int between >= 1 and <= 12
        // call getMonthName(int month) and pass your random int
        // print the name of the month and the random int generated to the console

        for (int x = 0; x < 1000; x++) {

            Random rand = new Random();
            int  randN = rand.nextInt(12) + 1;

            String month = getMonthName(randN);

            System.out.println("The name of the month is " + month + " and the number of the month is " + randN);

          }

    }

    // Get the name for the month using the random int you generated

    public static String getMonthName(int month) {

        String monthName = "";

        // use a switch statement to determine the name of the month
        // for instance if the random int is 1 the name of month is January

        // return the month name

        switch (month) {

            case 1:
                monthName = "January";
                break;

            case 2:
                monthName = "February";
                break;

            case 3:
                monthName = "March";
                break;

            case 4:
                monthName = "April";
                break;

            case 5:
                monthName = "May";
                break;

            case 6:
                monthName = "June";
                break;

            case 7:
                monthName = "July";
                break;

            case 8:
                monthName = "August";
                break;

            case 9:
                monthName = "September";
                break;

            case 10:
                monthName = "October";
                break;

            case 11:
                monthName = "November";
                break;

            case 12:
                monthName = "December";
                break;
        }

        return monthName;

    }
}