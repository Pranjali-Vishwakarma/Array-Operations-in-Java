// ArrayFunctions.java

import java.util.ArrayList;
import java.util.Arrays;

class ArrayFunctions {

    // Method to display an ArrayList
    public void display(ArrayList<Integer> array) {
        System.out.println(array);
    }

    // Method to separate even and odd numbers
    public void oddEven(int[] array) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int num : array) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }

        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }

    // Method to find two neighboring numbers with the smallest distance
    public void smallestVal(int[] array) {
        if (array.length < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        int minIndex = 0;
        int minDiff = Math.abs(array[1] - array[0]);

        for (int i = 0; i < array.length - 1; i++) {
            int diff = Math.abs(array[i + 1] - array[i]);
            if (diff < minDiff) {
                minDiff = diff;
                minIndex = i;
            }
        }

        System.out.println("Index of first number in the closest pair: " + minIndex);
    }

    // Convert Array to ArrayList
    public ArrayList<Integer> arrayToArrayList(int[] array) {
        return new ArrayList<>(Arrays.asList(Arrays.stream(array).boxed().toArray(Integer[]::new)));
    }

    // Convert ArrayList to Array
    public int[] arrayListToArray(ArrayList<Integer> arrayList) {
        return arrayList.stream().mapToInt(i -> i).toArray();
    }
}
