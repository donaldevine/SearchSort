package SearchSort;

public class QuickSort {
    static void printArray(int[] number, String message){
        System.out.println(message);
        for (int pos = 0; pos < number.length; pos++)
            System.out.print(number[pos] + "\t");
        System.out.println();
    }

    static void quicksort(int[] number, int lower, int upper){

        // lower (and upper) are the lower (and upper) indexes
        // of the region of array a that is to be sorted

        int start = lower, finish = upper;
        int temp;

        // Get a pivot vlaue using the middle element
        int middle = (lower + upper)/2;

        System.out.println("Quick sorting elements " + lower + " to " + upper);

        // swap the pivot value into the last location
        int pivotValue = number[middle];
        number[middle] = number[upper];
        number[upper] = pivotValue;

        System.out.println("Pivot Location " + middle + " Value = " + pivotValue);

        printArray(number, "OK");

        do {
            System.out.println("IN LOOP");

            // Work forward through the array until we encounter a value
            // that is GREATER THAN or EQUAL to the pivot
            while (number[start] < pivotValue)
                start++;

            // Work backward through the array until we encounter a value
            // that is LESS THAN or EQUAL to the pivot
            while (number[finish] > pivotValue)
                finish--;

            System.out.println("Start = " + start + " finish = " + finish);

            //Now compare the 2 positions
            // If 'start' is to the left of finish we needs to swap

            if (start <= finish){
                // swap the 2 values
                // Puts smaller values toward the front of the array
                // Puts largeer values to ward the back of the array

                System.out.println("Swapping elements at [" + start + "] " + number[start] + " and at [" + finish + "] " + number[finish]);

                temp = number[start];
                number[start] = number[finish];
                number[finish] = temp;
                start++;
                finish--;
            }
        } while (start <= finish);

        printArray(number, " IN HERE");

        // Now the recursive bit
        if (lower < finish)
            quicksort(number, lower, finish);

        if (start < upper)
            quicksort(number, start, upper);

    }

    public static void main(String[] args) {
        int [] myArray = {12,31,18,34,36,11,27};
        printArray(myArray, "START - unordered");
        quicksort(myArray, 0, myArray.length - 1);
        printArray(myArray, "FINISH- ordered");
    }
}
