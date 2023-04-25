
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Sem_3 {
    public static void main(String[] args) {
      CounterNew counter = new CounterNew();


      try {
          System.out.println("Метод открыт");
          counter.add();
      }
      catch (IOException e){
          System.out.println(e.getMessage());
      }
        counter.closeCounrer();
        try {
            System.out.println("Метод закрыт");
            counter.add();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }




//      try {
//          doSomething();
//      }
//      catch (NullPointerException e){
//          System.out.println(e.getMessage() + "   ошибка 1");
//      }
//      catch (IOException e2){
//            System.out.println(e2.getMessage()+ "ошибка 2");
//        };

    }
    public void rwLine(Path pathRead, Path pathWrite) throws IOException {

        try (
                BufferedReader in = Files.newBufferedReader(pathRead);
                BufferedWriter out = Files.newBufferedWriter(pathWrite);
        ) {
            while (in.ready()) out.write(in.readLine());
        }
    }

    //Создайте метод doSomething(), который может быть источником одного из типов checked exceptions
    // (тело самого метода прописывать не обязательно). Вызовите этот метод из main и обработайте в
    // нем исключение, которое вызвал метод doSomething().

    public static void doSomething() throws NullPointerException, IOException {

        //  throw new IOException("Наша ошибка");
        System.out.println("sdsdsdsdfsdsd");
        BufferedReader in = Files.newBufferedReader(null);
    }

    //Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение внутренней int переменной на 1.
    // Сделайте так, чтобы с объектом такого типа можно было работать в блоке try-with-resources.
    // Подумайте, что должно происходить при закрытии этого ресурса? Напишите метод для проверки,
    // закрыт ли ресурс. При попытке вызвать add() у закрытого ресурса, должен выброситься IOException



    //1. Создайте класс исключения, который будет выбрасываться при делении на 0.
    // Исключение должно отображать понятное для пользователя сообщение об ошибке.
    //
    //2. Создайте класс исключений, которое будет возникать при обращении к пустому
    // элементу в массиве ссылочного типа. Исключение должно отображать понятное для пользователя сообщение об ошибке.
    //
    //3. Создайте класс исключения, которое будет возникать при попытке открыть
    // несуществующий файл. Исключение должно отображать понятное для пользователя сообщение об ошибке.

}
