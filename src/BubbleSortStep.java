import java.util.Scanner;

public class BubbleSortStep {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter list size:");
        int size = input.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        System.out.println("Input list:");
        for (int i : list) {
            System.out.println(i);
        }

        System.out.println("Sorting");
        bubbleSortByStep(list);
    }

    public static void bubbleSortByStep(int[] list) {
        boolean needNextPass;
        for (int k = 1; k < list.length; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    System.out.println("Swap " + list[i] + " with " + list[i + 1]);
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    needNextPass = true;
                }
            }
            if (!needNextPass){
                System.out.println("Array may be sorted and need next pass unneeded");
                break;
            }
            System.out.println("list after " + k + " sort:");
            for (int i : list){
                System.out.println(i);
            }
            System.out.println();
        }
    }
}
