package part_04;

/**

 Implement, and populate a non-circular, consumptive queue (once a value has been retrieved
 it cannot be retrieved again) of integers 0 through 100. Then print out every other
 value in the queue.

 expected output: 0,2,4,6,8.....100

 */
class Example_06 {
    char q[];
    int putloc, getloc;

    Example_06(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    void put(char ch) {
        if (putloc == q.length) {
            System.out.println(" -- Queue is full.");
            return;
        }

        q[putloc++] = ch;

    }

    char get() {
        if (getloc == putloc) {
            System.out.println(" -- Queue is empty.");
            return (char) 0;
        }
        return q[getloc++];
    }
}


class Example_queue {

    public static void main(String[] args) {

    }
}




















