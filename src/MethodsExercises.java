public class MethodsExercises {
    public static void main(String[] args) {

        System.out.println(addition(2,2));
        System.out.println(subtraction(2,2));
        System.out.println(multiplication(2,2));
        System.out.println(division(2,2));
        System.out.println(modulus(2,2));

    }

    public static int addition(int num1, int num2){
      return   num1 + num2;
    }

    public static int subtraction(int num1, int num2){
        return   num2 - num1;
    }

    public static int multiplication(int num1, int num2){
        return   num1 * num2;
    }

    public static int division(int num1, int num2){
        return   num2 / num1;
    }

    public static int modulus(int num1, int num2){
        return   num1 % num2;
    }


}
