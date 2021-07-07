public class Warmups {

    public static void main(String[] args) {

        System.out.println(isCapital("The Very BiG Sentence"));
    }

    public static int isCapital(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++){
            if (Character.isUpperCase(string.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
