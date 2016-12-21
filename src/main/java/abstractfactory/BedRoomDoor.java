package abstractfactory;

/**
 * Created by guof on 21/12/16.
 */
public class BedRoomDoor implements Door {

    private static final String DESCRIPTION="This is a bed room door!";

    public String getDescription() {
        return DESCRIPTION;
    }
}
