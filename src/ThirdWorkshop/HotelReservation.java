package ThirdWorkshop;
import java.util.ArrayList;
import java.util.Comparator;

public class HotelReservation {

    public ArrayList<Hotels> hotelDetails;

    public HotelReservation() {
        hotelDetails = new ArrayList<>();
    }

    public void addHotel(String hotelName, Integer hotelPrice) {
        Hotels adder = new Hotels(hotelName, hotelPrice);
        hotelDetails.add(adder);
    }

    public void getMinPriceHotel() {
        Hotels min = hotelDetails.stream().min(Comparator.comparing(Hotels::getHotelPrice)).orElseThrow();
        System.out.println(min);
    }

    public void getHotelDetails() {
        String hotelName1 = "LakeWood";
        String hotelName2 = "BridgeWood";
        String hotelName3 = "RidgeWood";
        int lackWoodPrice1 = 100;
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
