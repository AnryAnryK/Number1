public class Customer {
    
    private final String firstName;
    private final String surname;

    public Customer (String firstName, String surname){
        this.firstName=firstName;
        this.surname=surname;
            }
            public String getFullName (){
return firstName + " " +  surname;
            }
}
