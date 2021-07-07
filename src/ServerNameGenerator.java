import java.util.Random;

public class ServerNameGenerator {


    public static String NamePicker(String[] randomStr){
        Random random = new Random();
        int index = random.nextInt(randomStr.length);
        return randomStr[index];
    }

    public static void main(String[] args) {
        String[] adjectives = {"Pretty", "Ugly", "Beautiful", "Hideous", "Lovely", "Exotic", "Evil", "Pure", "Cruel", "Rough"};
        String[] nouns = {"Man", "Woman", "Girl", "Boy", "Home", "Student", "Lion", "Tiger", "Wolf", "Dog"};
        String nameOne = NamePicker(adjectives);
        String nameTwo = NamePicker(nouns);

        System.out.println("Here is your server name: ");
        System.out.printf("%s-%s",nameOne,nameTwo);
    }
}
