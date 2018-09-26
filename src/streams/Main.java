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
//        personList.stream()
//                .mapToInt(s -> s.getAge())
//                .average()
//                .ifPresent(s -> System.out.println(s));
//
        //Zadanie3
        personList.stream()
                //brak nazwiska więc samo imie
                .map(s -> new Animal(s.getName(), s.getAge() / 10))
                .forEach(s -> System.out.println(s));


        //-1 - jestli cos ma isc do gory w zbiorze
        //1 - jesli cos ma isc na doll
        //0 - jesli cos jest takie samo
        //personList.sort((s, s1) -> Integer.compare(s.getAge(), s1.getAge()));

    }
}
