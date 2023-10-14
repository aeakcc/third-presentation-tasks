public class FirstTask {
    public static void main(String[] args) {
        int[] arr = {7, -3, 9, -11, 18, 99, 2, 11};
        for (int i = 0 ; i < 3; i++){ // 1
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length/2; i++){ // 2
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = arr.length/2 - 1; i < arr.length; i++){ // 3
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 1; i < arr.length - 1; i++){ // 4
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 5; i < arr.length; i++){ // 5
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 1; i < arr.length; i += 2){ // 6
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int positiveCount = 0; // 7
        int negativeCount = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 0) positiveCount++;
            if (arr[i] < 0) negativeCount++;
        }
        System.out.println("Кол-во положительных элементов: " + positiveCount);
        System.out.println("Кол-во отрицательных элементов: " + negativeCount);
        System.out.println();

        int maxValue = arr[0]; // 8
        int minValue = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (maxValue < arr[i]) maxValue = arr[i];
            if (minValue > arr[i]) minValue = arr[i];
        }
        System.out.println("Максимальный элемент: " + maxValue);
        System.out.println("Минимальный элемент: " + minValue);

    }
}
