package abstractfactory;

/**
 * Created by guof on 21/12/16.
 */
public class LivingRoomDoor implements Door {

    private static final String DESCRIPTION="This is a living room door!";

    public String getDescription() {
        return DESCRIPTION;
    }
}
