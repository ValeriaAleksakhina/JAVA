//Пусть дан произвольный список целых чисел, 
//удалить из него четные числа

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Iterator;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(10));
        }
        System.out.println("Произвольный список чисел: " + list);
        
        for (int i = list.size()-1; i >= 0; i--) {
                if (list.get(i)%2 == 0) {
                list.remove(i);
            }
        }
        System.out.println("Cписок c удаленными четными числами: " + list);
    }
}