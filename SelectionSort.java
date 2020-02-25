/*
 * Selection Sort
 */
package selectionsort;
import java.util.Random;

/**
 * Class that creates an array with specified size, shuffles array and sorts
 * it using selection sort.
 * @author danielalfonso
 */
public class Sort {
    
    private int[] list;
    
    /**
     * Constructor for the Sort class declaring the size of the array.
     * @param n The size of the array.
     */
    public Sort(int n) {
        
        // Declares size of array
        list = new int[n];
        
        // Fills the array with numbers 1, ..., n.
        for (int i = 0; i < n; i++) {
            
            list[i] = (i + 1);
        }
    }
    
    /**
     * Shuffles list.
     */
    public void shuffle() {
        
        int temp;
        Random rand = new Random();
        int LIST_SIZE = list.length;
        
        // Iterates through array
        for (int i = 0; i < LIST_SIZE; i++) {
            
            // Random number between 0 - LIST_SIZE exclusive.
            int r = rand.nextInt(LIST_SIZE); 
            // Swaps item at i with item at r.
            temp = list[i];
            list[i] = list[r];
            list[r] = temp;
        }
    }
    
    /**
     * Sorts the array using selection sort. Looks for the item with the lowest
     * value and moves it to the front of the array, then looks for the second
     * smallest value and moves it to the next index in the array.
     */
    public void sort() {
        
        // Hold the lowest value to swap to right index.
        int LIST_SIZE = list.length;
        int index = 0; // Index for swapping list items.

        for (int u = 0; u < LIST_SIZE; u++) {
            
            int temp = list[u];
            index = u;
            
            for (int i = u; i < LIST_SIZE; i++) {
                
                if (list[i] < temp) {
                    
                    temp = list[i];
                    index = i; 
                }    
            }
            
            list[index] = list[u];
            list[u] = temp;
        }       
    }
    
    /**
     * toString method to have the object return a string.
     * @return all items in the list array.
     */
    public String toString() {
        
        String finalString = ""; // Value to return for toString.
        int LIST_SIZE = list.length; // Size of the array.
        
        for (int i = 0; i < LIST_SIZE; i++) {
            
            finalString = finalString + list[i] + " ";
        }
        
        return finalString;
    }
}
