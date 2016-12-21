package abstractfactory;

/**
 * Created by guof on 21/12/16.
 */
public interface RoomFactory {
    Door createDoor();

    Bed createBed();
}
