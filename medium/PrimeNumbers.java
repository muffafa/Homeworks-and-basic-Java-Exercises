import java.util.Scanner;
class PrimeNumbers {
  public static void main(String[] args) {

    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number: The program will calculate start  2 to that number increasing one by one and each number if it is prime or not: ");
    int NUMBER = input.nextInt(); 
    

    System.out.println("Enter number of primes per line: ");
    int NUMBER_OF_PRIMES_PER_LINE = input.nextInt();;

    int count = 0;
    int number = 2;

    while (number <= NUMBER){
      boolean isPrime = true;

      for(int divisor = 2; divisor <= number/2; divisor++){
        if(number % divisor == 0){
          isPrime = false;
          break;
        }
      }
      if (isPrime){
        count++;
        if(count % NUMBER_OF_PRIMES_PER_LINE ==0){
          System.out.println(number);
        }else System.out.print(number+" ");
      }
      number++;
    }

    System.out.printf("%nThere is %d number is prime 2 to %d", count, NUMBER);

  }
}
