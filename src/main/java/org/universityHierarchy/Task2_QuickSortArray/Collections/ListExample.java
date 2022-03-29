package org.universityHierarchy.Task2_QuickSortArray.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {

    public static class CommonAnimals {

        public List<String> CommonAnimals() {
            List<String> animals = new ArrayList<>();
            animals.add("Dog");
            animals.add("cat");
            animals.add("donkey");
            animals.add("rat");
            animals.add("Elephant");
            animals.add("bear");
            animals.add("birth");
            animals.add("monkey");
            return animals;
        }
    }

    public static void main(String[] args) {

        CommonAnimals commonAnimals = new CommonAnimals();
        List<String> listaDeanimales = commonAnimals.CommonAnimals();
        System.out.println(listaDeanimales);
        int numeroDeLugares = listaDeanimales.size();
        System.out.println("El numero de lugares en el array es de " + numeroDeLugares);
        System.out.println("Ahora le agregamos un animal mas 'zorro' al lugar numero nueve \n");
        listaDeanimales.add("Zorro");
        System.out.println(listaDeanimales);
        int ultimoLugarZorro = listaDeanimales.size();
        System.out.println("Ahora el zorro ocupa el lugart nuemero " + ultimoLugarZorro);
        System.out.println("Ahora quitaremos a RAT\n");
        listaDeanimales.remove(3);
        System.out.println("Nos quedamos sin rat " + listaDeanimales);
        listaDeanimales.add(3,"NewRAT");
        System.out.println("Ahora agregamos de nuevo a rat " + listaDeanimales );
        System.out.println("Y finalmente los lugares totales que nos quedan son: " + listaDeanimales.size() + "\n");

        System.out.println("Ahora usamos un iterator \n");
        Iterator<String> it = listaDeanimales.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

   }
}
