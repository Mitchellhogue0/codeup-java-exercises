import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {
        ArrayList<String> stringArr = new ArrayList<>(), stringArrCopy = new ArrayList<>();

        stringArr.add("Mitchell");
        stringArrCopy.add("Mitchell");

        System.out.printf("Currently ArrayList size: %s\n", stringArr.size());

       stringArr.add("Raul");
        stringArrCopy.add("Raul");
        System.out.printf("Currently ArrayList size: %s\n", stringArr.size());
        System.out.println(stringArr);
        System.out.println(stringArrCopy);

        stringArr.remove(1);
        System.out.println(stringArr);
    }
}
