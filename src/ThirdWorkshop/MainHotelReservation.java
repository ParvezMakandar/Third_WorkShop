package ThirdWorkshop;

public class MainHotelReservation
{
    public static void main(String[] args) {
        System.out.println("Welcome to hotel reservation system");
        HotelReservation HotelReservation = new HotelReservation();
        HotelReservation.addHotel();
        HotelReservation.cheapHotelForInputDates();
    }
}