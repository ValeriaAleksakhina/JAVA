public class Task6{
public static void main(String[] args) {

//    Задание 2
try {
    int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7};
    int[] intArray = null;
    int d = 0;
    double catchedRes1 = intArray[8] / d;
    System.out.println("catchedRes1 = " + catchedRes1);
    } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
    System.out.println("Catching exception: " + e.getMessage());
    }
}
}




//Задание 3

public static void main (String[]args) throws Exception {
    try {
        int a = 90;
        int b = 3;
        System.out.println(a / b);
        printSum(23, 234);
        int[] abc = {1, 2};
        abc[3] = 9;
    } catch (IndexOutOfBoundsException ex) {
        System.out.println("Массив выходит за пределы своего размера!");
    } catch (NullPointerException ex) {
        System.out.println("Указатель не может указывать на null!");
    } catch (Throwable ex) {
        System.out.println("Что-то пошло не так...");
    }
}

public static void printSum (Integer a, Integer b) throws FileNotFoundException {
    System.out.println(a + b);

}