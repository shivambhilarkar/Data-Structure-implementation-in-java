package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Basics {

    public static List<Person> getFemales(List<Person> list){
        return list.stream()
                .filter( (person) -> person.getSex() == Person.SEX.FEMALE )
                .collect(Collectors.toList());
    }

    public static List<Person> getMales(List<Person> list){
        return list.stream()
                .filter((person) -> person.getSex() == Person.SEX.MALE)
                .collect(Collectors.toList());
    }

    public static List<Person> getSorted(List<Person> list){
        return list.stream().
                sorted((person1, person2) -> person1.getAge() - person2.getAge())
                .collect(Collectors.toList());
    }

    public static List<Person> startingWith(List<Person> list , char ch){
        return list.stream()
                .filter((person) -> person.getFirstName().charAt(0) == ch)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("shivam", "bhilarkar", 24 , Person.SEX.MALE));
        people.add(new Person("vaishnavi", "bhilarkar", 24 , Person.SEX.FEMALE));
        people.add(new Person("anas", "patni", 23 , Person.SEX.MALE));
        people.add(new Person("vaibhav", "malusare", 26 , Person.SEX.MALE));
        people.add(new Person("madhuri", "dikshit", 20 , Person.SEX.FEMALE));


        List<Person> femaleList = getFemales(people);
        System.out.println("[ Females ]");
        femaleList.stream().forEach(female -> System.out.println(female));

        System.out.println("[ Males ]");
        List<Person> maleList = getMales(people);
        maleList.stream().forEach((male) -> System.out.println(male));

        System.out.println("[ Sorted By Age ]");
        List<Person> ageSortedList = getSorted(people);
        ageSortedList.forEach((person) -> System.out.println(person));

        System.out.println("[ Start Letter V ]");
        List<Person> firstStarted = startingWith(people , 'v');
        firstStarted.forEach((person) -> System.out.println(person));



    }

}
