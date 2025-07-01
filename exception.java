import java.util.Scanner;

class demo{
    public void fun(){
    Scanner sc =new Scanner(System.in);
    int a= sc.nextInt();
    int b= sc.nextInt();
    int c =a/b;
    System.out.println("this is output" + c);
    sc.close();
}
}

    public class exception {
    public static void main(String[] args) {
        demo d = new demo();
        d.fun();
    }
}
