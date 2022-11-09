import java.util.Scanner;
public class Unit4Exercise7 {
    public static void main(String[] args) {
        final char[] LETTERS = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        Scanner sc =new Scanner(System.in);
        int dni;
        System.out.println("Enter a DNI:");
        dni =sc.nextInt();

        System.out.println("The letter is:" + LETTERS[dni % 23]);
    }
}
