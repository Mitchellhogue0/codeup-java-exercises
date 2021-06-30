package oop;

public class ObjectOrientedProgramming {

    public static void main(String[] args) {
        // tell me about a person
        Person person = new Person();

        person.setName("Mitchell");
        System.out.println(person.getEntertainment("play video games"));

        Person Cyd = new Person();
        Cyd.setName("Cydnie");
        System.out.println(Cyd.getEntertainment("plant her new plants :)"));

//        System.out.println(person.getName());

    }
}
