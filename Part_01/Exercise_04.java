package Part_01;

 /**
 * Part 1 Exercise 4:
 *      Write the necessary code to print the following table to the console:
 *
 *      a   a*2 a*4
 *      1   1   1
 *      ....
 *      4   8   16
 *
 */
public class Exercise_04 {

     public static void main(String[] args) {

         System.out.printf("%3s  |%5s  |%5s\n", "a", "a*2", "a*3");
         for (int i = 1; i <= 4; i++) {
            System.out.printf("%3d  |%5d  |%5d\n", i, i*2, i*4);
         }
     }
}

