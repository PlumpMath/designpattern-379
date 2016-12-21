package abstractfactory;

/**
 * Created by guof on 21/12/16.
 */
public class BedRoomBed implements Bed {

    private static final String DESCRIPTION="This is a bed room bed!";

    public String getDescription() {
        return DESCRIPTION;
    }
}
