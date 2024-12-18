package app;

import java.util.Arrays;

public class Main {
    //1.Створіть масив цілих чисел з 20 елементами.
    //2.Заповніть масив випадковими цілими числами в діапазоні від -100 до 100.
    //3. Знайдіть та виведіть суму всіх від'ємних чисел в масиві.
    //4. Знайдіть та виведіть кількість парних і непарних чисел в масиві.
    //5. Знайдіть найбільший та найменший елементи масиву та їхні індекси.
    //6.Знайдіть і виведіть середнє арифметичне чисел,
    // розташованих після першого від'ємного числа у масиві
    // (або повідомте, якщо від'ємних чисел немає).

    static int[] array = {50, 25, 40, 21, 23, -45, -20, 21, -18, 22, 25, -64, 68, 0, 10, 70, 7, 11, 12, 43};
    static int count;

    public static void main(String[] args) {

        //output of array values
        System.out.printf("Array elements: %s%n", Arrays.toString(array));

        //calculate the sum of all negative numbers in the array
        int sumNegativeNumbers = 0;
        for (int num : array) {
            if (num < 0) {
                sumNegativeNumbers += num;
            }
        }
        System.out.printf("Sum of negative numbers: %d%n", sumNegativeNumbers);

        //counts the number of even and odd numbers
        for (int num : array) {
            if (num % 2 == 0) {
                count++;
            }
        }
        System.out.printf("The number of even numbers:%d%nThe number of odd numbers: %d%n",
                count, array.length - count);

        //Find the largest and smallest elements of the array and their indices.
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        for (int num : array) {
            if (num < minNum) {
                minNum = num;
            }
            if (num > maxNum) {
                maxNum = num;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == minNum) {
                System.out.printf("The smallest element: %d (with index %d)%n", minNum, i);
            }
            if (array[i] == maxNum) {
                System.out.printf("The largest element: %d (with index %d)%n", maxNum, i);
            }
        }

        //Find and print the arithmetic mean of the numbers after the first negative number
        // in the array (or report if there are no negative numbers).
        int valueSum = 0;
        count = 0;
        while (array[count] > 0) {
            count++;
        }
        int countNum = 0;
        for (int i = count; i < array.length; i++) {
            valueSum += array[i];
            countNum++;
        }
        double averageValue = (double) valueSum / (double) countNum;
        System.out.printf("The arithmetic mean of the numbers after the first negative number: %.2f",
                averageValue);
    }
}
