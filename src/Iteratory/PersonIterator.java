package Iteratory;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

class PersonIterator {
    public static void main(String[] args) {
        Map<String, Person> people = new TreeMap<>();

        people.put("Kowalski", new Person("Jan", "Kowalski", 34));
        people.put("Kowalska", new Person("Anna", "Kowalska", 34));
        people.put("Nowak", new Person("Edyta", "Nowak", 24));
        people.put("Wiejski", new Person("Przemysław", "Wiejski", 34));
        people.put("Kowalska", new Person("Kamila", "Kowalska", 34));
        people.put("Borkowski", new Person("Arkadiusz", "Borkowski", 34));

        Collection<Person> values = people.values();
        Iterator<Person> iterator = values.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
