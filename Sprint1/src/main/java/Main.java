public class Main {
    public static void main(String[] args) {
        Customer specialAgent= new Customer("James","Bond");
FlightBookingService flightBookingService = new FlightBookingService();
flightBookingService.bookFlight(1, specialAgent);
        System.out.println("Общее количество броней: "+ flightBookingService.getCurrentBookingCount());
    }
}
