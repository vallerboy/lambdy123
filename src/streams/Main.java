package streams;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(new Person("Oskar", 15),
                                                new Person("Tomek", 20),
                                                new Person("Aga", 35),
                                                new Person("Janek", 50));

        //Zadanie1
//        personList.stream()
//                .map(s -> new Person(s.getName(), s.getAge() * 6 - 2))
//                .filter(s -> s.getAge() > 50)
//                .forEach(s -> System.out.println(s));
//
//        personList.stream()
//                .peek(s -> s.setAge(s.getAge() * 6 - 2))
//                .filter(s -> s.getAge() > 50)
//                .forEach(s -> System.out.println(s));
        //Zadanie2

    }
}
