// // Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив. 
// // Необходимо посчитать и вернуть сумму элементов этого массива. 
// // При этом накладываем на метод 2 ограничения: метод может работать только 
// с квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке 
// может лежать только значение 0 или 1. Если нарушается одно из условий,
//  метод должен бросить RuntimeException с сообщением об ошибке.

public class Task2 {
    public static void main(String[] args) {
        System.out.println(check(new int[][]{{5,7,3}, {7,0,1}, {8,1,2}}));
    }
        public static int check(int[][] arr) {
            int summ = 0;
            int l = arr.length;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i].length != l) throw new RuntimeException(message:"opal");
                    for (int j = 0; j < arr.length; j++) {
                        if (arr[i][j] == 0 || arr [i][j] == 1) summ += arr[i][j];
                        else throw new RuntimeException();

                }
            }
            return summ;
        }




    }
}      