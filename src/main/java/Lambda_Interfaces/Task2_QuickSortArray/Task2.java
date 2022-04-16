package Lambda_Interfaces.Task2_QuickSortArray;

import java.util.Scanner;

public class Task2 {
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int arrayElements = getArrayElementsAmountFromUser();
        final int[] array = new int[arrayElements];
        getEachElementFromUSer(arrayElements, array);
        insertionSort(array);
        printArray(array);


    }

    /**
     * Get the elements amount to be set into an array
     *
     * @return the array length
     */
    private static int getArrayElementsAmountFromUser() {
        System.out.print("Enter the number of elements you want to store: ");
        //reading the number of elements from the user
        int arrayElements = scanner.nextInt();
        return arrayElements;
    }

    /**
     * Get each element to be store into the array
     *
     * @param arrayElements is the array lenght
     * @param array         is the array to be set with element
     */
    private static void getEachElementFromUSer(int arrayElements, int[] array) {
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arrayElements; i++) {
            //reading and storing the elements from the user into the array[i]
            array[i] = scanner.nextInt();
        }
    }

    /**
     * Here this method makes the insertion sort
     *
     * @param array is the array to be sorted
     */
    private static void insertionSort(int[] array) {

        for (int i = 1; i < array.length; ++i) {
            int actualVariableValue = array[i];
            //here I generate a variable to represent the previous spot
            //of "valorActualDeVariable" in this case it is j
            int j = i - 1;
            //in the next while loop it goes back to the very beginning of the array
            //and it stops only when reach the starts of the array or when the actual variable value
            //in iteration is less than variable j
            while (j >= 0 && array[j] > actualVariableValue) {
                array[j + 1] = array[j];
                j = j - 1;
                array[j + 1] = actualVariableValue;

            }
        }
    }

    /**
     * It prints the already sorted array
     */
    static void printArray(int[] array) {
        int numberElements = array.length;
        for (int i = 0; i < numberElements; ++i)
            System.out.print(array[i] + " | ");

    }

}
