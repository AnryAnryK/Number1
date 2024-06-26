public class FlightBookingService  extends AbstractBookingService  {
    //private int bookingsCount;
    public void book (int id, Customer customer){
        System.out.println("Билеты. Бронь №№№ "+id+" :" + customer.getFullName());
        bookingsCount++; //сервис бронирует билеты и прибавляет количество броней
    }
    public void cancel (int id){
        if (bookingsCount==0){
            System.out.println("Билеты. Нет броней, отменять нечего");
        } else {
            System.out.println("Билеты. Отменяем бронь № " + id);
            bookingsCount--; //сервис отменяет забронированные билеты и удаляет количество броней
        }
    }
    public int getBookingsCount(){
        return bookingsCount; //сервис считает общее количество броней
    }
}
