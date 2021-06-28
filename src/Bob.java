import java.util.Scanner;


public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bob: hey.");
//        String userInput = sc.next();
//        if (userInput.endsWith("?")){
//            System.out.println("sure.");
//        } else if (userInput.endsWith("!")){
//            System.out.println("Woah, CHILL OUT!");
//        } else if (userInput.equals("")){
//            System.out.println("fine be that way");
//        } else {
//            System.out.println("whatever");
//        }


        while (sc.hasNext()) {
            String userInput = sc.nextLine();
            if (userInput.equalsIgnoreCase("Bye")) {
                System.out.println("Bob: Good riddance.");
                break;
            } else if (userInput.endsWith("?")) {
                System.out.println("Bob: sure.");
            } else if (userInput.endsWith("!")) {
                System.out.println("Bob: Woah, CHILL OUT!");
            } else if (userInput.equals(" ")) {
                System.out.println("Bob: fine be that way.");
            } else {
                System.out.println("Bob: whatever.");
            }
        }
    }
}
