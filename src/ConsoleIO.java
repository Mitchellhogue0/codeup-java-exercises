public class ConsoleIO {

    public static void main(String[] args) {
//       "sout" = System.out.println();
        String name = "Mitchell";
        String role = "student";
        String hobby = "play Video Games";
        int age = 21;
        System.out.printf("Hello, My name is %s. I am a %s and I love to %S! I am %d years old\n", name, role, hobby, age);

        float currencyInPennies = 1000.0000f;

       String mySentence = String.format("I will sell this swamp for $%.2f per acre", currencyInPennies);

        System.out.println(mySentence);
    }
}
