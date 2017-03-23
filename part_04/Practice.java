package part_04;
import java.util.Scanner;

/**
 * Created by yovaliceroman on 3/22/17.
 */
public class Practice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int selection = 1;
        do {
            System.out.println("Enter 1 for while loop.\n" +
                    "Enter 2 for for loop.\n" +
                    "Enter 3 for enhance for loop.\n" +
                    "Enter 5 for AndOrXor.\n" +
                    "Enter 6 to exit.");

            selection = input.nextInt();

            if (selection == 1){
                whileLoop();
            } else if (selection == 2){
                forLoop();
            } else if (selection == 3){
                enhanceForLoop();
            } else if (selection == 5){
                andOrXOr();
            }
        }while (selection != 6 && selection < 7);

        input.close();


    }

    public static void whileLoop(){

        int x = 7;
        int counter = 0;

        while (x >= counter){
            System.out.println("This is a while loop");
            counter++;
        }

        x = 0;
        while (x < counter){
            System.out.println("X is less than the counter" + x);
            x++;
        }

        counter = 0;
        while (x > counter){
            System.out.println("Now the counter is more than X.");
            counter++;

            if (counter == 6){
                System.out.println("Counter is 6");

            } else if (counter == 5){
                System.out.println("Counter is 5");
            } else {
                System.out.println("Counter is between 1 and 4");
            }
        }

    }
    public static void forLoop(){
        int i, sum = 0;

        for (i = 0; i < 10; i++){
            System.out.println(i);
            sum += i;

            System.out.println(sum);
        }

        for (i = 100; i > 0; i--){
            System.out.println(i);

            if (i % 2 == 0){
                System.out.println(i + " is even.");
            }
        }

    }

    public static void enhanceForLoop(){
        int test[] = {1, 2, 3, 4, 5, 6};


        for (int x : test){
            System.out.println(x);
        }

        char test2[] = new char[5];

        test2[0] = 'a';
        test2[1] =  'b';
        test2[2] = 'c';
        test2[3] =  'd';
        test2[4] = 'e';

        for (char q : test2){
            System.out.println(q);
        }

    }

    public static void switchStatement(){
        int i = 10;

        switch (i){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 10:
                System.out.println("10");
        }

    }

    public static void andOrXOr(){
        int x = 2, y = 2, z = 4, a = 10;

        if (x == 2 && y == 2){
            System.out.println("X equals Y");
        }
        if (x == 2 || y == 3){
            System.out.println("X=2 or Y=3");
        }
        if (x == 2 ^ y == 2){
            System.out.println("X= 2 or y = 2 but not both!");
        }
        if (a == 10 ^ z == 10){
            System.out.println("One of these statement is true and just one");
        }

    }
}

