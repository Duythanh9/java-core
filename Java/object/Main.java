package Java.object;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        person.setId(1);
        person.setName("sadich");
        person.setAddress("HN");

        List<Person.Address> list = new ArrayList<Person.Address>();
        Person.Address address = new Person.Address();
        address.setCity("HCM");
        address.setStreet("HCM");
        address.setState("fun");
        list.add(address);
        person.setList(list);

        System.out.println(person.toString());

        // System.out.println(person.getId() + " " + person.getName() + " " + person.getAddress());
        // for(Person.Address address2 : person.getList()){
        //     System.out.println(address2.toString());
        // }
    }
}
