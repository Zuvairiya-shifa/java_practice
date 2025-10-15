import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter numbers");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        int result= a>b&&a>c? a:b>c?b:c;
        System.out.println(result);
        
    }
}