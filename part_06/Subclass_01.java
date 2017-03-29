package part_06;


public class Subclass_01 extends Superclass{
    private int roomNum;
    private int numBedsInRoom;
    private int maxAllowInRoom;

    Subclass_01( int roomNum, int numBedsInRoom,  int maxAllowInRoom){
        super("Playa Azul", 50);
        this.roomNum = roomNum;
        this.numBedsInRoom = numBedsInRoom;
        this.maxAllowInRoom = maxAllowInRoom;

    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public int getNumBedsInRoom() {
        return numBedsInRoom;
    }

    public void setNumBedsInRoom(int numBedsInRoom) {
        this.numBedsInRoom = numBedsInRoom;
    }

    public int getMaxAllowInRoom() {
        return maxAllowInRoom;
    }

    public void setMaxAllowInRoom(int maxAllowInRoom) {
        this.maxAllowInRoom = maxAllowInRoom;
    }

    public String method1FromSuperclass () {
        return method_01() + method_01(" I am method overload from superclass.");
    }

}
