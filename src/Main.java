import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        // Задание 1
        System.out.println("Задание 1");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;

        double[] number1 = {1.57, 7.654, 9.986};

        char[] number2 = {'a', 'b', 'c', 'd', 'e', 'f'};

        // Задание 2
        System.out.println("Задание 2");
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        double[] arr1 = {1.57, 7.654, 9.986};
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
            if (i != arr1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        char[] arr2 = {'a', 'b', 'c', 'd', 'e', 'f'};
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
            if (i != arr2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Задание 3
        System.out.println("Задание 3");
        int[] arr3 = new int[3];
        arr3[0] = 1;
        arr3[1] = 2;
        arr3[2] = 3;
        for (int i = arr3.length - 1; i >= 0; i--) {
            System.out.print(arr3[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        double[] arr4 = {1.57, 7.654, 9.986};
        for (int i = arr4.length - 1; i >= 0; i--) {
            System.out.print(arr4[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        char[] arr5 = {'a', 'b', 'c', 'd', 'e', 'f'};
        for (int i = arr5.length - 1; i >= 0; i--) {
            System.out.print(arr5[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Задание 4
        System.out.println("Задание 4");
        int[] arr6 = {1, 2, 3};

        for (int i = 0; i < arr6.length; i++) {
            if (arr6[i] % 2 != 0) {
                arr6[i] += 1;
            }
        }

        System.out.println(Arrays.toString(arr6));
    }
}