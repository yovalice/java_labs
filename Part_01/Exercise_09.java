package Part_01;

/*
 * Part 1 Exercise 9:
 *
 *      Write the necessary code to display the area of a rectangle, as well as the perimeter of
 *      a rectangle that has a width of 2.4 and a height of 6.4
 *
 */
public class Exercise_09 {

    public static void main(String[] strings) {

        double width;
        double length;
        double area;
        double perimeter;
        double sumlw;
        width = 2.4;
        length = 6.4;

        area = width * length;
        sumlw = length + width;
        perimeter = 2 * sumlw;


        System.out.println("The area of a rectangle that has a width of 2.4 and a height of 6.4 is " + area +
                " and the perimeter is " + perimeter);
    }
}
