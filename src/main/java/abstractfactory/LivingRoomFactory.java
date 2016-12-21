package abstractfactory;

/**
 * Created by guof on 21/12/16.
 */
public class LivingRoomFactory implements RoomFactory {

    public Door createDoor(){
        return new LivingRoomDoor();
    }

    public Bed createBed(){
        return new LivingRoomBed();
    }
}
