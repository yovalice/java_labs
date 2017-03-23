package part_04;

/**

 Create, populate, and print out a two-dimensional array that will show the following output:

 0 1 2 3 4 5 6 7 8 9
 10 11 12 13 14 15 16 17 18 19
 20 21 22 23 24 25 26 27 28 29
 30 31 32 33 34 35 36 37 38 39
 40 41 42 43 44 45 46 47 48 49

 */
class Exercise_03 {
    public static void main(String args[]) {
        int table[][] = new int[5][10];
        int t, i;

        for (t = 0; t < 5; t++) {
            for (i = 0; i < 10; i++) {
                table[t][i] = (t*10) + i;
                System.out.print(table[t][i] + " ");
            }
            System.out.println();
        }


    }
}