import java.util.Scanner;
public class Taking_inpur_from_user {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Ener number 1:- ");
        int a = sc .nextInt();
        System.out.println("Enter number 2:- ");
        int b = sc.nextInt();

        int sum= a+b;
        System.out.println("The sum of the Entered NUmbers is:- "+sum);
    }


}
