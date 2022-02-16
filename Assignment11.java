import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Assignment11 {
    public static void main(String[] args) throws Exception
    {

        File file = new File("home://tarunp//IdeaProjects//Java_Assignments//src//Java_Assignments/Assignment2.java" );
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line;
        Set<Character> set = new HashSet<>();
        while ((line = bufferedReader.readLine()) != null) {
                if (line.equals("")) {
                    continue;
                } else {
                    String words[] = line.split(" ");
                    for (int i = 0; i < words.length; i++) {
                        String word = words[i];
                        for (int j = 0; i < word.length(); j++) {
                            set.add(word.charAt(j));
                        }
                    }
                }
            }
        System.out.println("Total character count = " + set.size());
    }
}
