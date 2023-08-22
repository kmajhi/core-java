public class Main {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum = sum + arr1[i];
        }

        System.out.println("Sum of the elements: " + sum);
        System.out.println("Length of the array"+ arr1.length);
    }
}
