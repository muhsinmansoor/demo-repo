//Author Muhsin Mansoor      Dated: 13/05/2021
//Motive: Array basic definition and declaration. --> One Dimensional Array

public class Arr_basic_1 {
    public static void printArray(int A[], int n) { // not *A like in C
        for (int i = 0; i < n; i++) {// The array Index starts at 0.
            // System.out.println("The month " + (i+1) + " has " + A[i] + " days.");
            System.out.printf("The month %02d has %d days.\n", i + 1, A[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Array is the group of like typed varaibles given a comman name.

        // int month_days[];
        // month_days = new int[12];
        // int month_days[] = new int[12]; // Array declartion --> combining declaration
        // and alocation.
        int month_days[] = { 30, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // Array declaration without new
                                                                               // operator.

        printArray(month_days, 12);
        // System.out.print(month_days[12]); --> Index out of bounds.
    }
}