public class HotelBookingService extends AbstractBookingService  {
    //private int bookingsCount;
    public void book (int id, Customer customer){
        System.out.println("Отели. Бронь № "+id+" :" + customer.getFullName());
        bookingsCount++; //?????? ????????? ?????? ? ?????????? ?????????? ??????
    }
    public void cancel (int id){
        if (bookingsCount==0){
            System.out.println("Отели. Броней не было");
        } else {
            System.out.println("Отели.  Отмена Брони " + id);
            bookingsCount--; //?????? ???????? ??????????????? ?????? ? ??????? ?????????? ??????
        }
    }
    public int getBookingsCount()
    {
        return bookingsCount; //?????? ??????? ????? ?????????? ??????
    }
}
