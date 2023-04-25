// 1. Создайте класс исключения, который будет выбрасываться
// при делении на 0. Исключение должно отображать понятное
// для пользователя сообщение об ошибке.

// 2. Создайте класс исключений, которое будет возникать
// при обращении к пустому элементу в массиве ссылочного типа. 
// Исключение должно отображать понятное для пользователя сообщение об ошибке.

// 3. Создайте класс исключения, которое будет возникать при попытке открыть 
// несуществующий файл. Исключение должно отображать понятное для 
// пользователя сообщение об ошибке.

import java.io.IOException;
import java.io.ArithmeticException;

public class NullException extends ArithmeticException{
    public static void main(String[] args) {
        float a = 0.0f/0;

       try{
        try {
            float s = 5/0;
        }
        catch (ArithmeticException e){
            throw new  NullException("Деление на ноль"+e);
        }
        }
        catch (NullException e){
            System.out.println(e.getInfo());
        }

        public NullException(String, message, Exception e){
          super(message);
          m = e.getMessage();  
        }
        private String m;
        public String getInfo(){
            return m;
        }


        


    }
}


// **Текст задачи:**
// Напишите метод, на вход которого подаётся двумерный строковый
//  массив размером 4х4. При подаче массива другого размера 
//  необходимо бросить исключение MyArraySizeException.

// 1. Далее метод должен пройтись по всем элементам массива, 
// преобразовать в int и просуммировать. Если в каком-то элементе 
// массива преобразование не удалось (например, в ячейке лежит 
// символ или текст вместо числа), должно быть брошено исключение
//  MyArrayDataException с детализацией, в какой именно ячейке лежат
//   неверные данные.
// 2. В методе main() вызвать полученный метод, обработать возможные 
// исключения MyArraySizeException и MyArrayDataException и вывести
//  результат расчета (сумму элементов, при условии что подали на 
//  вход корректный массив).

package com.company;

public class SquareArray {
    public static void main(String[] args) {
        // String[][] array = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        // String[][] array = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3"}};
        // String[][] array = {{"1", "2", "3", "4"}, {"1", "2", "3", "4m"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        String[][] array = null;
        try{
            checkArray(array);
            System.out.println(sumArray(convertArrayToInteger(array)));
        } catch (NullPointerException | MyArraySizeException | MyArrayDataException e){
            System.out.println(e.getMessage());
        }

    }

    public static void checkArray(String[][] array) throws MyArraySizeException{
        int arrayLen = array.length;
        if (arrayLen != 4){
            throw new MyArraySizeException();
        }
        for (String[] strings : array) {
            if (4 != strings.length) {
                throw new MyArraySizeException();
            }
        }
    }

    public static Integer[][] convertArrayToInteger(String[][] array) throws MyArrayDataException{
        Integer[][] result = new Integer[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    result[i][j] = Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException();
                }

            }
        }
        return result;
    }

    public static Integer sumArray(Integer[][] array){
        Integer result = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                result += array[i][j];
            }
        }
        return result;
    }
}
package com.company;

public class MyArrayDataException extends NumberFormatException{
    public MyArrayDataException(){
        super("Array data isn't valid");
    }
}