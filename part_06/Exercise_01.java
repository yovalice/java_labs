package part_06;


public class Exercise_01 {
    public static void main(String[] args) {

        Superclass supClass = new Superclass();

        System.out.println("Superclass guesthouse name is " + supClass.getNameGuestHouse() + " and have "
                + supClass.getNumRooms() + " rooms.");


        Subclass_01 room1 = new Subclass_01(1, 2, 4);


        System.out.println("Subclass_01 room number: " + room1.getRoomNum() + " number of beds in room " +
                room1.getNumBedsInRoom() + " persons per room " + room1.getMaxAllowInRoom());


        Subclass_02 Info = new Subclass_02(true);

        System.out.println("Subclass_02 Guesthouse name is " + Info.getNameGuestHouse() + " and have "
                + Info.getNumRooms() + " rooms. " + "The room number is " + Info.getRoomNum() +
                ", the number of beds in the room is " +
                Info.getNumBedsInRoom() + ", \nthe persons limit per room is " + Info.getMaxAllowInRoom()
                + " and the room availability is " + Info.isRoomAvailability());

        Info.setNameGuestHouse("Casa Azul");
        Info.setNumRooms(30);

        System.out.println("Changes in the name and room number of the guesthouse. The name now is: " +
                Info.getNameGuestHouse() + " and the number of rooms is: " + Info.getNumRooms());

        System.out.println(Info.methods());
    }
}
