import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter number: ");
        n = sc.nextInt();
        if (n % 2 == 0){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
            sc.close();
        }

    }
}
