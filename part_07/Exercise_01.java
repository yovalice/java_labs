package part_07;


/*Create the following:
1) Write one super class with at least 3 private instance variables and at least 3 public methods - Done
2) Write three subclasses (with at least 3 methods each that not getters and setters) that extend the super
class. Make sure each subclass can manipulate the private variables in the super class. One subclass should
extend another subclass which extends the super class. Each subclass should only have variables and methods
that apply to that subclass, ie Animal -> Mammal -> Whale. - Done
3) Make use of the keyword "super" in at least two constructors.
4) Write an interface with at least 3 methods. Have the superclass implement this interface.
Hotel -> rooms -> amenities
*/
class Main {
    public static void main(String[] args) {
        Amenities amenities = new Amenities("Wifi", "Marriott", "7878888888",
                "Texas", 5, 3);

        System.out.println("Superclass guesthouse name is " + amenities.getName() + " phone " + amenities.getPhone() +
                " location " + amenities.getLocation() + ", SubClass1 number of beds " +
                amenities.getNumberOfBeds() + " number of bathrooms " +  amenities.getNumberOfBathrooms() +
                ", SubClass2 amenities name " + amenities.getAmenitiesName() + ".");
    }
}

interface Building {
    void method1();

    void method2();

    void method3();
}

class Hotel implements Building {
    private String name;
    private String phone;
    private String location;

    Hotel(String name, String phone, String location) {
        this.name = name;
        this.phone = phone;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLocation() {
        return location;
    }

    public String getLocation(Hotel hotel) {
        return hotel.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void method1() {
        System.out.println("Empty Method");
    }

    public void method2() {
        System.out.println("Empty Method");
    }

    public void method3() {
        System.out.println("Empty Method");
    }

    public void method4() {
        System.out.println("Empty Method");
    }

    public void method5() {
        System.out.println("Empty Method");
    }

    public void method6() {
        System.out.println("Empty Method");
    }
}

class Rooms extends Hotel {
    private int numberOfBeds;
    private int numberOfBathrooms;

    Rooms(String name, String phone, String location, int numberOfBeds, int numberOfBathrooms) {
        super(name, phone, location);
        this.numberOfBeds = numberOfBeds;
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public void start() {
        Hotel hotel = createHotel();
        String location = hotel.getLocation(hotel);
        hotel = updateHotel(hotel);
        location = hotel.getLocation(hotel);

    }

    public Hotel createHotel(){
        Hotel newHotel = new Hotel("Bali Hotel", "555-555-5555", "Ubud");
        return newHotel;
    }

    public Hotel updateHotel(Hotel hotel){

        hotel.setLocation("Canguu");
        return hotel;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public void method1Sub1() {
        System.out.println("Empty Method");
    }

    public void method2Sub1() {
        System.out.println("Empty Method");
    }

    public void method3Sub1() {
        System.out.println("Empty Method");
    }

}

class Amenities extends Rooms {
    private String amenitiesName;

    Amenities(String amenitiesName, String name, String phone, String location, int numberOfBeds, int numberOfBathrooms) {
        super(name, phone, location, numberOfBeds, numberOfBathrooms);
        this.amenitiesName = amenitiesName;
    }

    public String getAmenitiesName() {
        return amenitiesName;
    }

    public void setAmenitiesName(String amenitiesName) {
        this.amenitiesName = amenitiesName;
    }

    public void method1Sub2() {
        System.out.println("Empty Method");
    }

    public void method2Sub2() {
        System.out.println("Empty Method");
    }

    public void method3Sub2() {
        System.out.println("Empty Method");
    }

}

class Photos extends Hotel {
    private String photoUrl;

    Photos(String photoUrl, String name, String phone, String location, int numberOfBeds, int numberOfBathrooms) {
        super(name, phone, location);
        this.photoUrl = photoUrl;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public void method1Sub3() {
        System.out.println("Empty Method");
    }

    public void method2Sub3() {
        System.out.println("Empty Method");
    }

    public void method3Sub3() {
        System.out.println("Empty Method");
    }

}
