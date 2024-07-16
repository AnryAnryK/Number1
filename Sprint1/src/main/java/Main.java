public class Main {
    public static void main(String[] args) {
        int [] mas = {1,2,5,-8,0,-6};
        //вывести массив в прямом порядке
        for (int i=0; i < mas.length; i++){
        System.out.print("вывести массив в прямом порядке "+ mas[i]);
            System.out.println();}
        System.out.println();


//вывести массив в побратном порядке
for (int i= mas.length-1; i>=0; i--){
    System.out.print("вывести массив в побратном порядке "+ mas[i]);
    System.out.println();
            }
        System.out.println();


//вывести произведение всех чисел массива
        int multiplication = 1;
for (int i=0; i < mas.length; i++){
    multiplication = multiplication * mas[i];
    System.out.print("вывести произведение всех чисел массива "+ multiplication);
    System.out.println();
        }
        System.out.println();

//каждый элемент массива увеличить на 3
        for (int i=0; i < mas.length; i++){
            mas[i]= mas[i]+3;
            System.out.print("каждый элемент массива увеличить на (3) = " + mas[i]);
            System.out.println();
        }
        System.out.println();

//вывести только чётные элементы
        for (int i=0; i < mas.length; i++){
            if (mas [i]%2 ==0){
                System.out.println("Чётное число = " + mas[i]);
            } else System.out.println("Не чётное");
        }

        //Customer specialAgent= new Customer("James","Bond");
//FlightBookingService flightBookingService = new FlightBookingService();
//flightBookingService.book(1, specialAgent);
//       System.out.println("Общее количество: "+ flightBookingService.getBookingsCount());

//        HotelBookingService hotelBookingService = new HotelBookingService();
//        hotelBookingService.bookHotel(1, specialAgent);
//        hotelBookingService.cancel(1);

//        BookingService bookingService = new HotelBookingService();
//        bookingService.book(1, specialAgent);
//        bookingService.cancel(1);
//        System.out.println(bookingService.getBookingsCount());
    }
}
