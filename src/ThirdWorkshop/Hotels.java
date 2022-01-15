package ThirdWorkshop;
import java.util.ArrayList;

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

class HotelReservation {
    public ArrayList<Hotels> hotelDetails;

    public HotelReservation() {
        hotelDetails = new ArrayList<>();
    }

    public void addHotel(String hotelName, Integer hotelPrice) {
        Hotels adder = new Hotels(hotelName, hotelPrice);
        hotelDetails.add(adder);
    }

    public void getHotelDetails() {
        String hotelName1 = "LakeWood";
        String hotelName2 = "BridgeWood";
        String hotelName3 = "RidgeWood";
        int lackWoodPrice1 = 90;
        int bridgeWoodPrice1 = 160;
        int ridgeWoodPrice1 = 220;

        addHotel(hotelName1, lackWoodPrice1);
        addHotel(hotelName2, bridgeWoodPrice1);
        addHotel(hotelName3, ridgeWoodPrice1);
    }

    public void viewHotels() {
        getHotelDetails();
        System.out.println(hotelDetails);
    }

}
