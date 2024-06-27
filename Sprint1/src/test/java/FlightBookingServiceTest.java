import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightBookingServiceTest {
   @Test
    public  void getBookingsCountIsIncreasedWhen1Booking()
   {
      BookingService flightBookingService = new FlightBookingService();
      Customer customer = new Customer("James", "Bond");
      flightBookingService.book(1,customer);
      int actualBookingsCount = flightBookingService.getBookingsCount();
      int expectedBookingsCount = 1;
      assertEquals(expectedBookingsCount, actualBookingsCount);
   }
}
