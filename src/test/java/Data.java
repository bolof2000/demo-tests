import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Map;

public class Data {

    public static Map<String, String> users(){

        Faker faker = new Faker();
        Map<String,String> map = new HashMap<>();
        map.put("firstName",faker.name().firstName());
        map.put("lastName",faker.name().lastName());
        map.put("first",faker.name().firstName());
        map.put("last",faker.name().lastName());
        map.put("test",faker.name().firstName());
        map.put("test2",faker.name().lastName());

        return map;
    }

    public static void main(String[] args){

      Map<String, String> user =   users();
        System.out.println(user);
    }
}
