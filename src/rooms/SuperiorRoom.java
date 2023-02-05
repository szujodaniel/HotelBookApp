package rooms;

public class SuperiorRoom extends AbstractRoom{

    private int additionalRoomPrice;

    public SuperiorRoom(boolean isExtraBedNeeded, int additionalRoomPrice) {
        super(isExtraBedNeeded);
        this.additionalRoomPrice = additionalRoomPrice;
    }

    @Override
     public int calculateRoomPrice() {
        return additionalRoomPrice + getSeasonBasedDefaultPrice();
    }
}
