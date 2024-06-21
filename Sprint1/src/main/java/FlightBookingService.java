public class FlightBookingService {
    private int bookingsCount;
    public void bookFlight (int id, Customer customer){
        System.out.println("����� � "+id+" :" + customer.getFullName());
        bookingsCount++; //������ ��������� ������ � ���������� ���������� ������
    }
    public void cancel (int id){
        if (bookingsCount==0){
            System.out.println("��� ������, �������� ������");
        } else {
            System.out.println("�������� ����� � " + id);
            bookingsCount--; //������ �������� ��������������� ������ � ������� ���������� ������
        }
    }
    public int getCurrentBookingCount(){
        return bookingsCount; //������ ������� ����� ���������� ������
    }
}
