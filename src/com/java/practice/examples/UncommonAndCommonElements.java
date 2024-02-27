package com.java.practice.examples;

public class UncommonAndCommonElements {
    public static void main(String[] args) {
        char[] array1 = { 'A', 'B', 'C', 'D','E', 'F','R' };
        char[] array2 = { 'A', 'B', 'C','D', 'E', 'F', 'G', 'H', 'I' };

        System.out.println("Uncommon elements in the two arrays are:");
        printUncommonElements(array1, array2);

        System.out.println("\nCommon elements in the two arrays are:");
        printCommonElements(array1, array2);
    }

    public static void printUncommonElements(char[] array1, char[] array2) {
        for (int i = 0; i < array1.length; i++) {
            boolean isCommon = false;
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    isCommon = true;
                    break;
                }
            }
            if (!isCommon) {
                System.out.print(array1[i] + " ");
            }
        }
        for (int i = 0; i < array2.length; i++) {
            boolean isCommon = false;
            for (int j = 0; j < array1.length; j++) {
                if (array2[i] == array1[j]) {
                    isCommon = true;
                    break;
                }
            }
            if (!isCommon) {
                System.out.print(array2[i] + " ");
            }
        }
    }

    public static void printCommonElements(char[] array1, char[] array2) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.print(array1[i] + " ");
                    break;
                }
            }
        }
    }
}
