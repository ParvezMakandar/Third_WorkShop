package ThirdWorkshop;

public class Hotels
{
    public String hotelName;

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getHotelPrice() {
        return hotelPrice;
    }

    public void setHotelPrice(int hotelPrice) {
        this.hotelPrice = hotelPrice;
    }

    public  int hotelPrice;

    public Hotels(String hotelName, int hotelPrice) {
        this.hotelName = hotelName;
        this.hotelPrice = hotelPrice;
    }

    public String toString(){
        return "Hotel Name: "+hotelName +"Hotel Price: "+hotelPrice;
    }
}

