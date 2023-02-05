package bookingmanagment;

public class UserInput {

    public int numberPeople;
    public int days;
    public boolean breakfast;
    public String name;
    public String roomType;
    public boolean extraBed;


    public void setNumberPeople(int numberPeople)
    {
        this.numberPeople = numberPeople;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void setBreakfast(boolean breakfast) {
        this.breakfast = breakfast;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setExtraBed(boolean extraBed) {
        this.extraBed = extraBed;
    }

    @Override
    public String toString() {
        return "numberPeople=" + numberPeople + ", days=" + days + ", breakfast=" + breakfast + ", name=" + name  + ", roomType='" + roomType +  ", extraBed=" + extraBed;
    }
}

