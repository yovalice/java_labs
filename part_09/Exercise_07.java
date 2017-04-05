package part_09;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*Complete the coding challenges in questions 7 & 8 in the self test for chapter 10.
    7. Write a program that copies a text file. In the process, have it convert all spaces into hyphens.
       Use the byte stream file classes. Use the traditional approach to closing a file by explicitly calling close( )

*/

public class Exercise_07 {
    public static void main(String[] args) {
        int x;

        FileInputStream fin = null;
        FileOutputStream fout = null;

        //Confirm that both files have been specified.
        if (args.length !=2) {
            System.out.println("Usage: CopyFile Hyphen From To");
            return;
        }
        try {
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            do{
                x = fin.read();

                if ((char)x == ' ') x = '-';

                if (x != -1) fout.write(x);
            } while(x != -1);
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        } finally {
            System.out.println("Error closing input file");
        }

        try {
            if(fin != null) fout.close();
        } catch (IOException e) {
            System.out.println("Error closing output file.");
        }
    }
}
