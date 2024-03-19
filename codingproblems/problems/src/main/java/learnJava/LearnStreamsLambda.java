package learnJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LearnStreamsLambda {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("apple", "banana", "cherry", "date");

// Use stream to filter, sort, and print
        myList.stream()
                .filter(s -> s.startsWith("a")) // Intermediate operation
                .sorted() // Intermediate operation
                .forEach(System.out::println); // Terminal operation
//===================================================================================
        List<Person> people = Arrays.asList(
                new Person("John", 20),
                new Person("Sara", 30),
                new Person("Jane", 40),
                new Person("Greg", 35),
                new Person("Greg", 22) // Note the duplicate name with a different age
        );
        //get all persons age greater than given age
        List<Person> personList= people.stream().filter(person -> person.getAge()>30).toList();
         personList= people.stream().filter(person -> person.getAge()>30).collect(Collectors.toList());

        //get all persons age greater than given age
        List<String> names = personList.stream().map(Person::getName).collect(Collectors.toList());
        System.out.println(names);


    }


}
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
