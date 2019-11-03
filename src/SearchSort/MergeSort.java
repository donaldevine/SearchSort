package SearchSort;

public class MergeSort {
    // Declare the array to be sorted
    static int[] myArray = {62,32,19,44,11,77,53,25,19,99,41,45,43};

    static void printArray (int[] anyArray, String message) {

        System.out.println(message);

        //Method to print out the elements in an array
        for (int low = 0; low < anyArray.length; low++)
            System.out.println(anyArray[low] + "\t");
        System.out.println();
    }


    private static void mergeSort(int[] myArray, int[] support, int left, int right){

        System.out.println("Left: " + left + " Right: " + right );

        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(myArray, support, left, middle);
            mergeSort(myArray, support, middle + 1, right);
            merge(myArray, support, left, middle + 1, right);
        }
    }

    private static void merge(int[] myArray, int[] helper, int leftPos, int rightPos, int rightEnd) {
        int leftEnd = rightPos - 1;
        int tempPos = leftPos;
        int numElements = rightEnd - leftPos + 1;

        System.out.println("IN HERE MERGING ELEMENTS: " + leftPos);

        for (int loop = leftPos + 1; loop <= rightEnd; loop++)
            System.out.println("\t" + loop);

        System.out.println();

        while ((leftPos <= leftEnd) && (rightPos <= rightEnd))
            if (myArray[leftPos] < myArray[rightPos]){
                helper[tempPos] = myArray[leftPos];
                tempPos++;
                leftPos++;
            }else {
                helper[tempPos] = myArray[rightPos];
                tempPos++;
                rightPos++;
            }

        while (leftPos <= leftEnd) { //copy the rest of the fist half
            helper[tempPos] = myArray[leftPos];
            tempPos++;
            leftPos++;
        }

        while (rightPos <= rightEnd) { //copy the rest of the fist half
            helper[tempPos] = myArray[rightPos];
            tempPos++;
            rightPos++;
        }

        // copy helper back

        for (int i = 0; i < numElements; i++, rightEnd--)
            myArray[rightEnd] = helper[rightEnd];

    } //merge

    public static void main(String[] args) {
        int elements = myArray.length;
        int maxIndex = elements -1;
        int[] helperArray = new int[elements];
        printArray(myArray, "START");
        mergeSort(myArray, helperArray, 0 , maxIndex);
        printArray(myArray, "END");
    }
}
