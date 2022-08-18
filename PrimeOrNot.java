public class PrimeOrNot {
    public static void main(String[] args) {
        primeOrNot(123);
    }
    public static void primeOrNot(int num) {
        boolean prime = true;
        int i = 2;
        while(i <= num/2) {
            System.out.println("**** Checking if " + i + " is a multiple ****");
            if(num % i == 0){
                System.out.println("**** Yes, we found a multiple ****");
                prime = false;
                break;
            }
            i++;
        }
        if(prime) {
            System.out.println(num + " is a prime number.");
        }
        else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
