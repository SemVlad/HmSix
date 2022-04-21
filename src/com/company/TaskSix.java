package com.company;

import java.util.Arrays;

public class TaskSix {
    public static void main(String[] args) {

        //Создаем и инициализируем массив
        String[] fruits = new String[6];
        fruits[0] = "Apple";
        fruits[1] = "Banana";
        fruits[2] = "Pear";
        fruits[3] = "Orange";
        fruits[4] = "Pineapple";
        fruits[5] = "Strawberry";

        // Копируем массив и выводим на экран
        String[] food = Arrays.copyOf(fruits, fruits.length);
        for (int i = 0; i < food.length; i++) {
            System.out.println("Fruit " + "- " + food[i]);
        }

        // Создаем и инициализируем двумерный массив
        int[][] score = {{10, 11, 12, 13}, {20, 21, 22, 23}, {30, 31, 32, 33}};

        // Создаем одномерный массив и инициализируем суммами с двумерного
        int[] result = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < 4; j++) {
                result[i] = result[i] + score[i][j];
            }
            System.out.println(i + "-й элемент = " + result[i]);
        }
    }
}
