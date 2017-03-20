package Part_02;

/**
*           Review and run this updated method to find PI
 *
 *          This method expands on yesterday's lab using the Leibniz series
 *
 *          4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
 *
 *
 * */

public class ComputePI {
    public static void main(String[] args) {
        double pi = 0;
        double y = 1;

        int loops = 90000000*2;
        int count = 0;

        for(int x=1; x < loops; x+=2) {
            pi = pi + (y/x);
            y = -y;    // alternate the sign each time

        }

        System.out.println("π = " + 4*pi + " after " + loops/2 + " loops"); //PI=3.141592642478473 after 90000000
    }
}