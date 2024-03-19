Let's dive into examples for each of the commonly used intermediate operations in Java Streams: `filter`, `map`, `sorted`, `limit`, and `distinct`. For these examples, assume we have a list of `Person` objects to work with:

```java
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
```

And here's our sample list:

```java
List<Person> people = Arrays.asList(
    new Person("John", 20),
    new Person("Sara", 30),
    new Person("Jane", 40),
    new Person("Greg", 35),
    new Person("Greg", 22) // Note the duplicate name with a different age
);
```

### `filter` Example

Filters elements based on a condition. Here, we filter out all persons younger than 30.

```java
List<Person> olderThan30 = people.stream()
    .filter(person -> person.getAge() > 30)
    .collect(Collectors.toList());

System.out.println(olderThan30);
```

### `map` Example

Transforms the elements via the provided function. Here, we convert `Person` objects into their names (a `String`).

```java
List<String> names = people.stream()
    .map(Person::getName)
    .collect(Collectors.toList());

System.out.println(names);
```

### `sorted` Example

Sorts elements based on natural order or a provided `Comparator`. Here, we sort people by their age.

```java
List<Person> sortedByAge = people.stream()
    .sorted(Comparator.comparing(Person::getAge))
    .collect(Collectors.toList());

System.out.println(sortedByAge);
```

### `limit` Example

Limits the number of elements to the specified number. Here, we only want the first two people from our list.

```java
List<Person> firstTwo = people.stream()
    .limit(2)
    .collect(Collectors.toList());

System.out.println(firstTwo);
```

### `distinct` Example

Returns a stream with unique elements (according to `Object.equals(Object)`). To make this meaningful with our `Person` objects, let's assume `Person` class has properly overridden `equals` and `hashCode` methods based on the `name` property. For demonstration, we'll just focus on the effect of `distinct`:

```java
List<Person> uniqueNames = people.stream()
    .distinct() // This would require Person's equals and hashCode to be overridden to consider only names.
    .collect(Collectors.toList());

System.out.println(uniqueNames);
```

Note: For `distinct()` to work effectively on custom objects like `Person`, you need to override the `equals()` and `hashCode()` methods in the `Person` class. The example provided for `distinct()` is conceptual, focusing on showing how `distinct()` is used in a stream. In the given list of people, assuming `distinct()` operates on unique names, it would filter out the duplicate "Greg" if the `equals` and `hashCode` methods are defined based on the `name` attribute. However, with the basic implementation of `Person` provided and without custom `equals` and `hashCode` implementations, `distinct()` will consider all `Person` instances as distinct, since their memory addresses (default identity) are different.