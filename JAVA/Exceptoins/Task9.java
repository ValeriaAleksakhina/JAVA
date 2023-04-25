 //Создайте класс Счетчик, у которого есть метод add(),
// увеличивающий значение внутренней int переменной на 1. 
//Сделайте так, чтобы с объектом такого типа можно было 
//работать в блоке try-with-resources. Подумайте, что
// должно происходить при закрытии этого ресурса?
// Напишите метод для проверки, закрыт ли ресурс.
// При попытке вызвать add() у закрытого ресурса,
// должен выброситься IOException

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Task9{
    public static void main(String[] args){
        CounterNew counter = new CounterNew();
        counter.openCounter();
        counter.add();

    }
    try {
        System.out.println(e.getMessage())
        counter.add();
    }
    catch (IOException e){
        System.out.println("Метод открыт")
        counter.add();
    }
    private Integer i;


public void add() throws IOException{
    if (this.open){
        this.i++; 
    }
    else (throw new IOException ("Наша ошибка"));
   
};
};
    public void openCounter(){
        this.open = true;
    }
    public void closeCounter(){
        this.open = false;

};
