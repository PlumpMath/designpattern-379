package abstractfactory;

/**
 * Created by guof on 21/12/16.
 */
public class BedRoomFactory implements RoomFactory {

    public Door createDoor() {
        return new BedRoomDoor();
    }

    public Bed createBed() {
        return new BedRoomBed();
    }
}
