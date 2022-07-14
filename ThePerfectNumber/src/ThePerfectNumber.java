import java.util.Scanner ;

public class ThePerfectNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number, total = 0 ;
        System.out.print("Enter the number : ");
        number = input.nextInt();

        for (int i = 1 ; i < number ; i++){
            if (number % i == 0){
                System.out.println("Divisors of the " + number + "(except the " + number + ")" + " = " + i);
                total += i ;
            }
        }
        System.out.println("The sum of the divisors of the " + number + " = " + total);
        if (total == number){
            System.out.println(number + " is a perfect number !");
        } else {
            System.out.println(number + " is not a perfect number !");
        }
    }
}
