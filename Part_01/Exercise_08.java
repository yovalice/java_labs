package Part_01;

/*
 * Part 1 Exercise 8:
 *
 *      Write the necessary code that prints out the area
 *      and perimeter of a circle with a radius of 3.14
 *
 *
 */
public class Exercise_08 {

    private static final double radius = 3.14;

    public static void main(String[] args) {

        double pi;
        double r;
        double area;
        double perimeter;
        r = radius;
        pi = 3.14159265359;

        area = pi*r*r;
        perimeter = 2*pi*r;

        System.out.println("The area of a circle that has a radius of 3.14 is " + area +
                " and the perimeter is " + perimeter);
    }
}
