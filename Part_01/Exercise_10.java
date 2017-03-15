package Part_01;

/*
 * Part 1 Exercise 10:
 *
 *      If a runner runs 12 kilometers in 30 minutes and 30 seconds. What is his/her average speed
 *      in miles per hour. (Tip: 1 mile = 1.6 km)
 *
 */
public class Exercise_10 {

    public static void main(String[] strings) {

        double totalDistmiles;
        double totalDiskm;
        double elapsedTime;
        double averageSpeed;
        totalDiskm = 12;
        elapsedTime = 30.30;

        totalDistmiles = totalDiskm/1.6;

        averageSpeed = totalDistmiles / elapsedTime;

        System.out.println("The average speed of a runner that runs 12 kilometers in 30 minutes and 30 seconds" +
                " in miles per hour is " + averageSpeed);

    }

}