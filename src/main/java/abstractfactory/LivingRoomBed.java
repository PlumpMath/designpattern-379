package abstractfactory;

/**
 * Created by guof on 21/12/16.
 */
public class LivingRoomBed implements Bed {

    private static final String DESCRIPTION="This is a living room bed!";

    public String getDescription() {
        return DESCRIPTION;
    }
}
