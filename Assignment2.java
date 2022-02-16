import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Assignment2 {
    static boolean check(String input){
        Set<Character> set=new HashSet<>();
        input=input.toLowerCase();
        for(int index=0;index<input.length();index++){
            if((input.charAt(index)>='a' && input.charAt(index)<='z')||(input.charAt(index)>='A' && input.charAt(index)<='Z')){
                set.add(Character.toLowerCase(input.charAt(index)));
            }
        }
        if(set.size()!=26)
            return false;
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        System.out.println(check(input));
    }
}
