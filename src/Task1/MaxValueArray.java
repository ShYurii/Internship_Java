package Task1;

import java.util.Arrays;
import java.lang.Math.*;

public class MaxValueArray {

    public static void main(String[] args) {

        //  вхідні параметри

        final double c= -1.49;
        final double d= 23.4;
        double y;

        //  об'явлення  двомірного масива розміром 5 x 5

        double[][] array = new double[5][5];

        //  обчислення sin^2(c)

        double sin2c = Math.pow(Math.sin(c),2.0);

        //  обчислення 4*ln^2(d)

        double ln2d_4= 4*(Math.pow(Math.log(d), 2.0));

        //  Виконання проходження по масиву та занесення результату обчислення
        //  згідно формулі в елемент масива

        for (int i = 0; i < array.length; i++)
        {

            for (int j = 0; j<array[i].length; j++) {

        //   Виконання зведення i в ступінь j


                double ij =Math.pow(i,j);

        /*  Виконуємо перевірку знаменника на 0,
            щоб уникнути арифметичної похібкі деління на 0
            якщо, проігнорувати деління на нуль то Java машина
            виконає обчислення і будемо матимо значення
            Infinity (нескінченість)

            В разі коли маємо 0 в знаменнику то заносимо значення в
            елемент массива відповідно 0
         */

        if (ij !=0) {

         //  обчіслення згідно формулі

            y = Math.sqrt(Math.abs(sin2c - (ln2d_4 / ij)));

        array[i][j] = y;
}
        else array[i][j]=0;

            }
        }

        // Визначення максимального значення масиву

        double max=0;



        for (double[] anArray : array) {

            for (double anAnArray : anArray) {

                if (anAnArray > max)

                    max = anAnArray;

            }
        }

        System.out.println(" ");
        System.out.println("Значення максимального елементу масива дорівнює: "+max);

        //  Визначаємо в якіх елементах массива присутне максимальне значення

        System.out.println(" ");
        System.out.println("Мексимальне значення  присутне в наступних елементах масиву :");

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j<array[i].length; j++) {

                if (array[i][j]==max)


                    System.out.println(" array " + i +" "+ j );

            }
        }


    }
}
