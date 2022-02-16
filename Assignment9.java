import java.util.Scanner;
import java.util.regex.Pattern;

public class Assignment9 {
    public static void main(String[] args) {
        String str;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the sentence:");
        str=input.nextLine();
        System.out.println(Pattern.matches("[A-Z].*\\.$",str));
    }
}