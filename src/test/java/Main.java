import com.github.javafaker.Faker;

public class Main {


    public static void  main(String[] args){

        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String phoneNumber = faker.phoneNumber().cellPhone();
        String any = faker.finance().creditCard();
        String financeee = faker.finance().iban();

       // System.out.println(firstName+" "+ lastName +" "+ phoneNumber+ "  "+ financeee);


    }
}
