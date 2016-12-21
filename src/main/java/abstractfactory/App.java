package abstractfactory;

/**
 * Created by guof on 21/12/16.
 */
public class App {

    private Door door;
    private Bed bed;
    public void createRoom(RoomFactory roomFactory) {
        setDoor(roomFactory.createDoor());
        setBed(roomFactory.createBed());
    }
    public Door getDoor() {
        return this.door;
    }
    public void setDoor(Door door) {
        this.door = door;
    }

    public Bed getBed() {
        return this.bed;
    }
    public void setBed(Bed bed){
        this.bed = bed;
    }

    public static void main(String[] args){
        App app = new App();
        app.createRoom(new BedRoomFactory());
        System.out.println(app.getDoor().getDescription());
        System.out.println(app.getBed().getDescription());
    }
}
