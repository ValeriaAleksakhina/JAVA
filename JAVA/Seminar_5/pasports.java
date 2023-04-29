import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Passports {
    private Map<String, String> map = new HashMap<>();

    void add(String passportNum, String lastName){
        map.put(passportNum, lastName);
    }

    String get(String passportNum){
        return passportNum + ": " + map.get(passportNum);
    }

    String getByLastName(String lastName){
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, String> entry: map.entrySet()){
            if (entry.getValue().equalsIgnoreCase(lastName)){
            stringBuilder.append(entry.getKey());
            stringBuilder.append(": ");
            stringBuilder.append(entry.getValue());
            stringBuilder.append("\n");
            }
    }

    String getAll(){
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, String> entry: map.entrySet()){
            stringBuilder.append(entry.getKey());
            stringBuilder.append(": ");
            stringBuilder.append(entry.getValue());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
    String print(){
        return map.toString;
    }
}
}