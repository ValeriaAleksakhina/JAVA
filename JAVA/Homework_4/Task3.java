//Найдите сумму всех элементов LinkedList, 
//сохраняя все элементы в списке. Используйте итератор

import java.util.*;


public class Task3 {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(linkedList);
    
        Iterator<Integer> iterator = linkedList.iterator();
        int sum = 0;
        while (iterator.hasNext()) {
            sum += iterator.next();
            
}
System.out.println(sum);
}
}