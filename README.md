# Array-Operations-in-Java

This repository contains Java programs that provide utility functions for working with arrays. It includes operations such as separating even and odd numbers, finding the closest pair of numbers, and converting between arrays and ArrayLists.

## Features
- **User Input Handling:** Reads integer inputs from the user.
- **Odd and Even Separation:** Splits an array into even and odd numbers.
- **Smallest Neighboring Difference:** Finds two adjacent numbers with the smallest difference.
- **Array to ArrayList Conversion:** Converts arrays to ArrayLists and vice versa.

## File Descriptions

### 1. `ArrayFunctions.java`
This file contains various utility functions for working with arrays.

#### Methods:
- **`display(ArrayList<Integer> array)`**  
  - Displays an ArrayList in the console.
  - **Parameters:** `ArrayList<Integer>` (list of integers)  
  - **Returns:** None  
  - **Example Usage:**  
    ```java
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
    display(list); // Output: [1, 2, 3]
    ```

- **`oddEven(int[] array)`**  
  - Separates even and odd numbers from an integer array and prints them.  
  - **Parameters:** `int[]` (array of integers)  
  - **Returns:** None  
  - **Example Output:**  
    ```
    Even numbers: [2, 4, 6]
    Odd numbers: [1, 3, 5]
    ```

- **`smallestVal(int[] array)`**  
  - Finds two adjacent numbers in an array that have the smallest absolute difference and prints the index of the first number.  
  - **Parameters:** `int[]` (array of integers)  
  - **Returns:** None  
  - **Example Output:**  
    ```
    Index of first number in the closest pair: 2
    ```

- **`arrayToArrayList(int[] array)`**  
  - Converts an integer array to an `ArrayList<Integer>`.  
  - **Parameters:** `int[]` (array of integers)  
  - **Returns:** `ArrayList<Integer>`  
  - **Example Usage:**  
    ```java
    int[] arr = {1, 2, 3};
    ArrayList<Integer> list = arrayToArrayList(arr);
    ```

- **`arrayListToArray(ArrayList<Integer> arrayList)`**  
  - Converts an `ArrayList<Integer>` back to an integer array.  
  - **Parameters:** `ArrayList<Integer>` (list of integers)  
  - **Returns:** `int[]` (array of integers)  
  - **Example Usage:**  
    ```java
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
    int[] arr = arrayListToArray(list);
    ```

### 2. `UserInput.java`
Handles user input for the program.

#### Methods:
- **`arrayInput()`**  
  - Reads 5 integers from the user and stores them in an array.  
  - **Returns:** `int[]` (array of 5 integers)  
  - **Example Input:**  
    ```
    Enter 5 numbers:
    10 23 8 15 42
    ```

### 3. `Main.java`
The main entry point for the program, integrating all functions.

#### Workflow:
1. **Takes user input** using `UserInput.arrayInput()`.
2. **Calls utility functions** from `ArrayFunctions`:
   - Separates odd and even numbers (`oddEven`).
   - Finds the closest neighboring values (`smallestVal`).
   - Converts between arrays and ArrayLists (`arrayToArrayList`, `arrayListToArray`).
3. **Displays results** in the console.
