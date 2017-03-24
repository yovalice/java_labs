package part_05;

/**
 * Write two classes. In Class_01 (which contains the main()) create an instance of Class_02 and pass that instance
 * to a method_01 within Class_01. Within method_01 you ust manipulate several private instance variables within
 * Class_02. Then, from within method_01, pass the instance of Class_02 to a new method, method_02. Within method_02
 * modify the instance variables of Class_02 once again. Use System.out.println at various points to demonstrate the
 * flow of execution and the varying state of each private variable. You can name these classes whatever you want.
 *
 */

class Class_001 {
    public static void main(String[] args) {
        //create an instance of Class_02 and pass that instance to a method_01 within Class_01

        Class_002 class2 = new Class_002();
        method_01(class2);

    }

    public static void method_01(Class_002 class2) {
        //manipulate several private instance variables within Class_02
        //pass the instance of Class_02 to a new method, method_02

        class2.type = "Car";
        System.out.println("Property type " + class2.getType());
        class2.setLocation("PR");
        System.out.println("Property location " + class2.getLocation());
        class2.setSize(4);
        System.out.println("Property size " + class2.getSize());

        method_02(class2);

    }

    public static void method_02(Class_002 class2) {
        //modify the instance variables of Class_02 once again

        class2.type = "Boat";
        System.out.println("Property type " + class2.getType());
        class2.setLocation("USA");
        System.out.println("Property location " + class2.getLocation());
        class2.setSize(8);
        System.out.println("Property size " + class2.getSize());
    }
}

class Class_002 {

    String type;
    private String location;
    private int size;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}