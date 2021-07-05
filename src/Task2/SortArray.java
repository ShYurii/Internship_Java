package Task2;

import java.util.Arrays;
import java.util.Random;

public class SortArray {

    public static void main(String[] args) {

        // Об'явлення одномірного массива розміром 10 елементів

        int[] array = new int[10];

        // Для генерації випадкових чисел використовуємо клас Random

        Random random = new Random();

        // Заповнення масива елементами

        for (int i = 0; i < array.length; i++) {

            array[i] = random.nextInt();

        }

        // Виконуємо сортування

        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int indexMin = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    indexMin = j;
                }
            }

            int temp = array[i];
            array[i] = min;
            array[indexMin] = temp;
        }

        //  Зручніше сортування елементів массиву можливо за допомогою метода класа Arrays

        //  Arrays.sort(array);

        //  Перевірка сортування
        //  якщо перший елемент більше наступного то буде виводитися "помилка"
        //  якщо меньше то "правильно"
        //  тобто елементи массива розміщено в зростаючому порядку

        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                System.out.println("Елемент массива більше наступного : "+false);

            }
            System.out.println("Елемент массива меньше наступного : "+true);
    }


        System.out.println(" ");
        System.out.println("Відсортирований список елементів :");
        System.out.println(" ");
        System.out.println((Arrays.toString(array)));

    }
}
