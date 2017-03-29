package part_06;

/**
 * Demonstrate inheritance using 1 super class and 2 subclasses. Each class must be in it's own file.
 */


public class Superclass {
    private int numRooms;
    private String nameGuestHouse;

    Superclass(String nameGuestHouse, int numRooms){
        this.numRooms = numRooms;
        this.nameGuestHouse = nameGuestHouse;
    }

    Superclass(){
        this.nameGuestHouse = "Casa Verde";
        this.numRooms = 20;
    }

    public int getNumRooms() {
        return numRooms;
    }

    public void setNumRooms(int numRooms) {
        this.numRooms = numRooms;
    }

    public String getNameGuestHouse() {
        return nameGuestHouse;
    }

    public void setNameGuestHouse(String nameGuestHouse) {
        this.nameGuestHouse = nameGuestHouse;
    }

    public String method_01() {
        return "I am method 1 from superclass";
    }

    public String method_01(String a) {
        return a;
    }

    public String method_02() {
        return "I am method 2 from superclass";
    }
}
