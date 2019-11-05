package SearchSort;

public class SelectionSort {

    static void printArray(int[] number, String message){
        System.out.println(message);
        for (int pos = 0; pos < number.length; pos++)
            System.out.print(number[pos] + "\t");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] number = {35,10,30,20,15,5,25,50,40,45};

        printArray(number, "START");

        int minPos, minValue;

        int size = number.length -1;

        //do a pass of each item in the array
        for (int pass = 0; pass < size; pass++) {
            //assume first item is min
            minValue = number[pass];
            //keep the position
            minPos = pass;

            //loop through the remaining items
            for (int location = pass + 1; location <= size ; location++) {
                //if this one is less than the min value
                if (number[location] < minValue) {
                    //this is the new min value
                    minValue = number[location];
                    //keep the location of this min value
                    minPos = location;
                } // if
            } // for location

            number[minPos] = number[pass];
            number[pass] = minValue;
        } // for pass
    }
}
