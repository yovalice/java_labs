package part_03;

/**

 Write a class that has at least 3 methods, one of which being a main() method. The two other methods need to use the
 "return" keyword. Use the values returned from these two methods to accomplish a task.

 */

class Tv{

    int inches;
    int price;
    int quantity;
    boolean smartTv;

    Tv( int inches, int price, int quantity, boolean smartTv){
        this.inches = inches;
        this.price = price;
        this.quantity = quantity;
        this.smartTv = smartTv;
    }

    public static void main(String[] args) {

        Tv TvSamsung = createTv(60, 1900, 10, true);
        Tv TvLg = createTv(50, 500, 2, true);
        Tv TvSony = createTv(46, 700, 20, false);

        System.out.println("It is " + comparision(TvSamsung, TvLg) + " that the price for the Samsung" +
                " Tv is more than the Lg Tv");

    }

    public static Tv createTv(int inches, int price, int quantity, boolean smartTv) {

        Tv tv = new Tv(inches, price, quantity, smartTv);
        return tv;

    }

    public static boolean comparision(Tv TvSamsung, Tv TvLg) {


        if (TvSamsung.price > TvLg.price)
            return true;
        return false;
    }
}