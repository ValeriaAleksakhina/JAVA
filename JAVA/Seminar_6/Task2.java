
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
    }
/*
        1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
        2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент
        уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
        Для вычисления процента используйте формулу:
        процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
         */
        Integer[] arr = createArray(0, 24, 1000);
//        System.out.println(Arrays.toString(arr));
        double percent = unic(arr);
        System.out.println("Процент уникальных значений: " + percent);

11:30
static double unic(Integer[] arr){
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        double percent = set.size() * 100.0 / arr.length;
        return percent;
    }
    static Integer[] createArray(int min, int max, int capacity){
        Integer[] arr = new Integer[capacity];
        for (int i = 0; i < capacity; i++) {
            arr[i] = (int)(Math.random() * (max - min + 1) + min);
        }
        return arr;
    }
}