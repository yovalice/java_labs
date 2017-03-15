package Part_01;

/*
 * Part 1 Exercise 11:
 *      In the U.S., if there is:
 *          - One person who is born every 6 seconds
 *          - One person who dies every 12 seconds
 *          - One person who immigrates every 40 seconds
 *
 *      Write the necessary code to display the total population for the next 3 years (without a leap year)
 *
 *      Let's say the current population is 380,123,456.
 *
 */
public class Exercise_11 {

    public static void main(String[] strings) {

        int population;
        int firstYearInSeconds;
        int secondYearInSeconds;
        int thirdYearInSeconds;
        int currentPopulation;
        firstYearInSeconds = 31536000;
        secondYearInSeconds = 31536000 * 2;
        thirdYearInSeconds = 31536000 * 3;
        currentPopulation = 380123456;


        population = (currentPopulation + ((firstYearInSeconds/6) - (firstYearInSeconds/12) + (firstYearInSeconds/40)));
        System.out.println("Total population in the first year: " + population);

        population = (currentPopulation + ((secondYearInSeconds/6) - (secondYearInSeconds/12) + (secondYearInSeconds/40)));
        System.out.println("Total population in the second year: " + population);

        population = (currentPopulation + ((thirdYearInSeconds/6) - (thirdYearInSeconds/12) + (thirdYearInSeconds/40)));
        System.out.println("Total population in the third year: " + population);
    }
}
