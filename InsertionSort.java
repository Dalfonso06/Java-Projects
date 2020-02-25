/*
 * Insertion Sort
 */
package insertionsort;
import java.util.Random;

/**
 * Class that creates an integer array, shuffles it, and sorts it using
 * insertion sort.
 * @author danielalfonso
 */
public class Sort {
    
    private int[] list;
    
    /**
     * Creates a new array with n amount of items.
     * @param n Determines the size of the array.
     */
    public Sort(int n) {
        
        // Declares new array with size of n.
        list = new int[n];
        
        for (int i = 0; i < n; i++) { // Adds the numbers to the list.
            
            list[i] = i + 1;
        }
        
    }
    
    /**
     * Shuffles the array by grabbing every item in the array and swapping
     * it with another item at a random index.
     */
    public void shuffle() {
        
        Random rand = new Random(); // Declares new random object.
        int LIST_LENGTH = list.length; // To use later for iteration.
        int temp; // To hold a temporary value.
        
        // To shuffle the array four times.
        for (int u = 0; u < 4; u++) {
            
            for (int i = 0; i < LIST_LENGTH; i++) { // Iterating through list.
            
                // Random number to use for index later.
                int random = rand.nextInt(LIST_LENGTH); 
            
                temp = list[i]; // Grabs item at i.
                list[i] = list[random]; // The item at i will equal item at r.
                list[random] = temp; // Item at r will equal temporary value.
            
            } 
        }
    }
    
    /**
     * Sorts the array using insertion sort. For every number in list, check
     * check the numbers before and until one is less than that number, then
     * place that number at that index.
     */
    public void sort() {
        
        int LIST_LENGTH = list.length;
        
        // For every item on the array.
        for (int i = 1; i < LIST_LENGTH; i++) {
            
            int counter = 0;
            
            // Check every item before item[i].
            for (int u = (i - 1); u >= 0; u--) {
                
                // Check if that item is greater than item at index i.
                if (list[u] > list[i]) {
                    
                    // If so add to the counter.
                    counter++;
                    
                } else {
                    
                    break;
                    
                }
            }
            
            int temp = list[i]; // Hold the item at index i.
            
            // Shifts all items up until where list[i] belongs.
            for (int u = i; u > (i - counter); u--) {
                
                list[u] = list[u - 1];
            }
            
            list[i - counter] = temp; // Adds that item to its proper location.
            
        }
        
    }
    
    /**
     * Creates a string representation of the Sort object.
     * @return All items of the list added to a string. (finalString)
     */
    public String toString() {
        
        int n = list.length;
        String finalString = ""; // To use later for return value.
        
        for (int i = 0; i < n; i++) {
            
            finalString = finalString + list[i] + " ";
        }
        
        return finalString;
    }
}
