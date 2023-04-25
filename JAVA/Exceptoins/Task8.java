import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;



public class Task8{
    public static void main(String[] args){
        try {
            doSomething();
        }
        catch (IOException e){
            System.out.println(e.getClass().getSimpleName());

        };

// Создайте метод doSomething(), который может
// быть источником одного из типов checked 
// exceptions (тело самого метода прописывать
// не обязательно). Вызовите этот метод из 
// main и обработайте в нем исключение, 
// которое вызвал метод doSomething().

    public void rwLine(Path pathRead, Path pathWrite) throws IOException {

        try {
                BufferedReader in = Files.newBufferedReader(pathRead);
                BufferedWriter out = Files.newBufferedWriter(pathWrite);
        } {
            while (in.ready()) out.write(in.readLine());
        }
        }
        public static void doSomething() throws IOException {

            throw new IOException("Наша ошибка");
        }
    }
    }

    //Создайте класс Счетчик, у которого есть метод add(),
    // увеличивающий значение внутренней int переменной на 1. 
    //Сделайте так, чтобы с объектом такого типа можно было 
    //работать в блоке try-with-resources. Подумайте, что
    // должно происходить при закрытии этого ресурса?
    // Напишите метод для проверки, закрыт ли ресурс.
    // При попытке вызвать add() у закрытого ресурса,
    // должен выброситься IOException
