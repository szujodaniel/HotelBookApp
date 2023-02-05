package rooms;

public class StandardRoom extends AbstractRoom {


    public StandardRoom(boolean isExtraBedNeeded) {
        super(isExtraBedNeeded);
    }

    @Override
    public int calculateRoomPrice() {
        return getSeasonBasedDefaultPrice();
    }
}

