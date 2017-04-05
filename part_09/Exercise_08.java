package part_09;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*Complete the coding challenges in questions 7 & 8 in the self test for chapter 10.

    8. Rewrite the program in question 7 so that it uses the character stream classes.
    This time, use the try-with-resources statement to automatically close the file.
*/

public class Exercise_08 {
    public static void main(String[] args)
            throws IOException
    {
        int x;

        if (args.length !=2) {
            System.out.println("Usage: Hyphen From To");
            return;
        }
        try (FileInputStream fin = new FileInputStream(args[0]);
             FileOutputStream fout = new FileOutputStream(args[1]))
        {
            do{
                x = fin.read();

                if ((char)x == ' ') x = '-';

                if (x != -1) fout.write(x);
            } while(x != -1);
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
