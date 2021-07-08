import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        String[] Persons = {"Karen", "Kyle", "Chad"};


           String Person = "Tabitha";
            System.out.println(Arrays.toString(addPerson(Person, Persons)));

    }

    public static String[] addPerson(String person, String[] persons){
        persons = Arrays.copyOf(persons, persons.length + 1);
        persons[persons.length -1] = person;
        return persons;
    }
}
