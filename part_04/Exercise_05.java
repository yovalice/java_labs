package part_04;

/**

 Here's an easy one for you.

 Create and populate an array with a length no less than 5. Use the enhanced for
 loop to iterate through the array and print out each value.

 */
class Exercise_05 {
    public static void main(String args[]){
        int arrayNums [] = {1, 2, 3, 4, 5, 6};

        for (int i: arrayNums)
            System.out.println(arrayNums[i-1]);

    }
}