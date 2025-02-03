// Main.java

import java.util.*;

class Main {
    public static void main(String[] args) {
        UserInput input = new UserInput();
        ArrayFunctions functions = new ArrayFunctions();

        // Get user input once and store it
        int[] userArray = input.arrayInput();

        // 1. Separate odd and even numbers
        functions.oddEven(userArray);

        // 2. Find smallest neighboring difference
        functions.smallestVal(userArray);

        // 3. Convert Array to ArrayList and back
        ArrayList<Integer> arrayList = functions.arrayToArrayList(userArray);
        System.out.println("Converted Array to ArrayList: " + arrayList);

        int[] convertedArray = functions.arrayListToArray(arrayList);
        System.out.println("Converted ArrayList back to Array: " + Arrays.toString(convertedArray));
    }
}
