import java.util.Scanner;
import java.text.SimpleDateFormat;

public class date{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String date=sc.nextLine();
        if (IsDate(date)){
            System.out.println("valid date");
        }
        else{
            System.out.println("not valid ");
        }

    }
}

public static boolean IsDate(String s){
    SimpleDateFormat sdf= new SimpleDateFormat(dd/MM/yyyy);
    sdf.setLenient(false);
    try{
        sdf.parse(date);
        return true;
    }catch(Exception e){
        return false;
    }
}