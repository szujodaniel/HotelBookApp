package rooms;

public class KingRoom extends AbstractRoom {

    private int additionalRoomPrice;

    public KingRoom(boolean isExtraBedNeeded, int additionalRoomPrice) {
        super(isExtraBedNeeded);
        this.additionalRoomPrice = additionalRoomPrice;
    }


    @Override
    public int calculateRoomPrice() {
        return additionalRoomPrice + getSeasonBasedDefaultPrice();
    }
}

