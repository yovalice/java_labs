package part_06;


public class Subclass_02 extends Subclass_01 {
    private boolean roomAvailability;

    Subclass_02(boolean roomAvailability){
        super(1, 2, 4);
        this.roomAvailability = roomAvailability;

    }

    public boolean isRoomAvailability() {
        return roomAvailability;
    }

    public void setRoomAvailability(boolean roomAvailability) {
        this.roomAvailability = roomAvailability;
    }

    public String methods () {
        return method1FromSuperclass() + " " + method_02();
    }
}
