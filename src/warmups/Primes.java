package warmups;

public class Primes {

//    Write a method named getTwentyPrimes() that returns a string containing the first 20 prime numbers, each separated
//    by a comma. Output: "1, 2, 3, 5, 7, 11, 13, 17, 19"... until we have a total count of 20 primes in the string.


    public static void main(String[] args) {
        getTwentyPrimes();
    }


    public static void getTwentyPrimes() {
        int i = 0;
        int num = 0;
        String primeNumbers = "";

        for (i = 1; i <= 71; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter += 1;
                }
            }
            if (counter == 2) {
                primeNumbers = primeNumbers + i + ", ";
            }
        }
        System.out.println("The first twenty prime numbers are :");
        System.out.println(primeNumbers);
    }
}
