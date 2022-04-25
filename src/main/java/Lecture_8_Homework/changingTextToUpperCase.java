package Lecture_8_Homework;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class changingTextToUpperCase {
    public static void main(String[] args) {
        String txt = putIntoUpperCase();
        String upperCasetext = txt.toUpperCase();
        System.out.println(upperCasetext);

    }

    public static String putIntoUpperCase() {
        String ratonTex = "";
        Path mouseTxt = Path.of("D:\\GERMAN\\PROGRAMACION\\Solvd\\src\\main\\resources\\ratonDeCampoRatonDeCiudad.txt");
        try {
            String textoRaton = Files.readString(mouseTxt);
            ratonTex = textoRaton;
        } catch (IOException e) {
            throw new ArrayStoreException("The array could not be performed");
        }
        return ratonTex;
    }

}
