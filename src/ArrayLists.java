import java.util.ArrayList;
import java.util.HashMap;

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

        /** HASHMAPS */

        HashMap<Integer, String > myHashMap = new HashMap<>();

        for (Integer i = 0; i < 11; i++) {

            myHashMap.put(i, "This is a value ");
        }
        System.out.println(myHashMap.get(5));
    }
}
