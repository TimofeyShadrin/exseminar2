package ru.gb.exseminars;

public class Task3 {
    private void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

    public void result() {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[1] = 9;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
}

