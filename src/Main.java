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


    }
}