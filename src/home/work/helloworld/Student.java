package home.work.helloworld;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lena on 24.05.2016.
 */
public class Student extends Human{
    public static Map<Integer, String> students = new HashMap<Integer, String>();

    public static void studentAdd(Integer id, String faculty){
        System.out.println(id+"    "+faculty);
        students.put(id, faculty);
    }
    public static Map.Entry<Integer, String> studentGet(Integer course, String faculty){
        for (Map.Entry<Integer, String> entry : students.entrySet() ){
            if ((entry.getKey()== course)&&(entry.getValue()==faculty)){
                return entry;
            }
        }
        return null;
    }


}
