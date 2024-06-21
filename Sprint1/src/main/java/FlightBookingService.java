public class FlightBookingService {
    private int bookingsCount;
    public void bookFlight (int id, Customer customer){
        System.out.println("Бронь № "+id+" :" + customer.getFullName());
        bookingsCount++; //сервис бронирует билеты и прибавляет количество броней
    }
    public void cancel (int id){
        if (bookingsCount==0){
            System.out.println("Нет броней, отменять нечего");
        } else {
            System.out.println("Отменяем бронь № " + id);
            bookingsCount--; //сервис отменяет забронированные билеты и удаляет количество броней
        }
    }
    public int getCurrentBookingCount(){
        return bookingsCount; //сервис считает общее количество броней
    }
}
