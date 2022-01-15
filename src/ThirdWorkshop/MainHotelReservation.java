package ThirdWorkshop;
import java.util.*;


public class MainHotelReservation
{
    public static void main(String[] args) {
        System.out.println("Welcome to hotel reservation system");
        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.viewHotels();
        hotelReservation.getMinPriceHotel();
    }
}
