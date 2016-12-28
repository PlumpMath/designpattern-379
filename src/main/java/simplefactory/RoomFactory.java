package simplefactory;

/**
 * Created by guof on 12/28/16.
 */
public class RoomFactory {
    public Room createRoom(String roomName) {
        if (roomName.equals("Bedroom")) {
            return new Bedroom();
        } else if (roomName.equals("Livingroom")) {
            return new Livingroom();
        }
        return null;
    }
}
