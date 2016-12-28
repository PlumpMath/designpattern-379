package simplefactory;

import java.util.logging.Logger;

/**
 * Created by guof on 12/28/16.
 */
public class App {
    private static Logger logger = Logger.getLogger(App.class.getName());
    public static void main(String[] args){
        RoomFactory roomFactory = new RoomFactory();
        Room bedroom = roomFactory.createRoom("Bedroom");
        logger.info(bedroom.getDescription());
        Room livingroom = roomFactory.createRoom("Livingroom");
        logger.info(livingroom.getDescription());

    }
}
