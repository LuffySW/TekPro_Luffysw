package Kasus3;

public class Sorting {
    /**
     * Sorts the specified array of objects using the selection sort algorithm.
     *
     * @param list the array to be sorted
     */
    public static void selectionSort (Comparable[] list)
    {
        int min;
        Comparable<?> temp;
        for (int index = 0; index < list.length-1; index++)
        {
            min = index;
            for (int scan = index+1; scan < list.length; scan++)
                if (list[scan].compareTo(list[min]) < 0)
                    min = scan;
            
            // Swap the values
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
    }

    /**
     * Sorts the specified array of objects using the insertion sort algorithm.
     *
     * @param list the array to be sorted
     */
    public static void insertionSort(Comparable[] list) {
        for (int index = 1; index < list.length; index++) {
            Comparable key = list[index];
            int position = index;
            // Shift larger values to the left
            while (position > 0 && key.compareTo(list[position - 1]) > 0) { // Change to key.compareTo(list[position - 1]) > 0 for descending order
                list[position] = list[position - 1];
                position--;
            }
            list[position] = key;
        }
    }    
}
