package rooms;

import java.time.LocalDate;

public abstract class AbstractRoom {

    protected boolean isExtraBedNeeded;
    protected int extraBedPrice = 3000;
    private int seasonBasedPrice;

    public AbstractRoom(boolean isExtraBedNeeded) {
        this.isExtraBedNeeded = isExtraBedNeeded;

    }

    public int getSeasonBasedDefaultPrice() {
        LocalDate now = LocalDate.now();
        String month = String.valueOf(now.getMonth());

        switch (month) {
            case "DECEMBER", "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY" -> seasonBasedPrice = 11000;
            case "JUNE", "JULY", "AUGUST" -> seasonBasedPrice = 21000;
            case "SEPTEMBER", "OCTOBER", "NOVEMBER" -> seasonBasedPrice = 15000;
        }
        return seasonBasedPrice;
    }
    abstract int calculateRoomPrice();

}

