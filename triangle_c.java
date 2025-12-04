import.java.util.Scanner;
public class triangle_c{
    public static void main(String[] args) {
        //triangle condition: a+b>c
        Scanner sc= new Scanner(System.out);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int two_side=a+b;
        if (two_side>c){
            System.out.println("Triangle is possible");
        }

    }
}