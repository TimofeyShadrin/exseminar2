package ru.gb.exseminars;

public class Task2 {

    public void result(int[] intArray, int index, int digit) {
        try {
            double catchRes1 = (double) intArray[index] / digit;
            System.out.println("catchRes1 = " + catchRes1);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
