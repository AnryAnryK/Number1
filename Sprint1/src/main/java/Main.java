public class Main {
    public static void main(String[] args) {
        Customer specialAgent= new Customer("James","Bond");
//FlightBookingService flightBookingService = new FlightBookingService();
//flightBookingService.bookFlight(1, specialAgent);
//        System.out.println("Общее количество: "+ flightBookingService.getCurrentBookingCount());

//        HotelBookingService hotelBookingService = new HotelBookingService();
//        hotelBookingService.bookHotel(1, specialAgent);
//        hotelBookingService.cancel(1);

        BookingService bookingService = new HotelBookingService();
        bookingService.book(1, specialAgent);
        bookingService.cancel(1);
        System.out.println(bookingService.getBookingsCount());
    }
}
