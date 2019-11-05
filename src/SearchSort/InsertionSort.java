package SearchSort;

public class InsertionSort {

    static void printArray(int[] number, String message){
        System.out.println(message);
        for (int pos = 0; pos < number.length; pos++)
            System.out.print(number[pos] + "\t");
        System.out.println();
    }

    public static void insertionSort(int[] a){
        int saved, mover;

        //loop through each item
        for (int pos = 1; pos < a.length; pos++) {

            // Save the value of a[pos] and save pos
            saved = a[pos];
            mover = pos;

            //if saved is less than the item to the right, put the item to the right  right
            while ((mover > 0) && (saved < a[mover -1])){
                // NB Move element FORWARD TO make a space
                a[mover] = a[mover -1];
                mover --;
            }
            a[mover] = saved;
            printArray(a, "PASS" + pos);
        }
    }

    public static void main(String[] args) {
        int[] number = new int[10];

        for (int pos = 0; pos < 10; pos++) {
            number[pos] = Math.round((float) Math.random() * 100);
        }

        printArray(number, "BEFORE");
        insertionSort(number);
        printArray(number, "AFTER");
    }
}
