package Lecture_8_Homework;
/**
 * Java Program to Find the Occurrence of Words in a String using HashMap.
 * The String is provided by a file in the resource folder
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

/**
 * Articles that I read to perform this task:
 * https://www.geeksforgeeks.org/java-util-hashmap-in-java-with-examples/
 * https://www.geeksforgeeks.org/java-program-to-find-the-occurrence-of-words-in-a-string-using-hashmap/
 * https://www.codegrepper.com/code-examples/java/how+to+make+a+string+into+an+array
 * https://www.geeksforgeeks.org/java-program-to-read-a-file-to-string/?ref=gcse
 */

public class TextProcessor {

    public static void main(String[] args) {

        String txt = cloningText();
        Map<String, Integer> cloningHashMap = new HashMap<>();
        String[] cloningArticle = txt.split(" ");
        for (String word : cloningArticle) {

            if (cloningHashMap.containsKey(word))
                cloningHashMap.put(word, cloningHashMap.get(word) + 1);
            else {
                // Incrementing the value if the word
                // is already present in the HashMap.
                cloningHashMap.put(word, +1);
            }
        }
        // Iterate the map to print with the specified format
        // for-each loop
        for (Map.Entry<String, Integer> e : cloningHashMap.entrySet())
            System.out.println(e.getKey()
                    + " = " + e.getValue());
    }

    public static String cloningText() {
        String cloningText = "";
        Path cloningTxt = Path.of("D:\\GERMAN\\PROGRAMACION\\Solvd\\src\\main\\resources\\cloning.txt");
        try {
            String cloning = Files.readString(cloningTxt);
            cloningText = cloning;
        } catch (IOException e) {
            throw new ArrayStoreException("The array could not be performed");
        }
        return cloningText;
    }
}
