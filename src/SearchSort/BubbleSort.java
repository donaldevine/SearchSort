package SearchSort;

public class BubbleSort {
    static void printArray(int[] number, String message){
        System.out.println(message);
        for (int pos = 0; pos < number.length; pos++)
            System.out.print(number[pos] + "\t");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] number = {35,20,30,20,15,5,25,50,40,45};
        printArray(number, "START");

        boolean exchangeMade;
        int last = number.length - 1;
        int temp;
        int pass = 0;

        do {
            pass++;
            exchangeMade = false;
            //loop through each number
            for (int loop = 0; loop < last; loop++){
                // compare 2 numbers, if the number of the left is less - then swap
                if (number[loop] < number[loop + 1]){
                    temp = number[loop];
                    number[loop] = number[loop + 1];
                    number[loop + 1] = temp;
                    exchangeMade = true;
                }
            }
            //do another pass, but ignore the last as it has bubbled up.
            last = last - 1;
            printArray(number, "PASS: " + pass);
        } while ((exchangeMade) && (last >=1));

        printArray(number, "FINISH");
    }
}
