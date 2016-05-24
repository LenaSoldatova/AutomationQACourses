package home.work.helloworld;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lena on 24.05.2016.
 */
public class Institute {
    public static Map<Integer, String> corpus = new HashMap<Integer, String>();
    //public static Student student = new Student();
    public static ArrayList<Student> students;
    public static Map<Integer, String> library = new HashMap<Integer, String>();

    public static void main(String args[]){
        //System.out.println("Key = ");
        //int i;
        for (int i=1; i<10; i++) {
            Student.studentAdd(i,"physics course="+(int) (Math.random()*5));
        }

        for (int j=1; j<10; j++) {
            corpusAdd(j,"Address "+j);
        }

        for (Map.Entry<Integer, String> entry : corpus.entrySet()){
            libraryAdd(entry.getKey(), "LibraryName on "+entry.getValue());
        }
        System.out.println("Print Corpuses");
        printAllMap(corpus);
        System.out.println("Print Library");
        printAllMap(library);
        System.out.println("Print Students");
        printAllMap(Student.students);

    }



    public static void corpusAdd(Integer id, String address){
        //System.out.println(id+"    "+address);
        corpus.put(id, address);
    }
    public static void libraryAdd(Integer corpusID, String name){
        //System.out.println(corpusID+"    "+name);
        library.put(corpusID, name);
    }
    public static void printAllMap(Map <Integer, String> map){
        for (Map.Entry<Integer, String> entry : map.entrySet()){
           System.out.println("Key = "+entry.getKey()+" Value = "+entry.getValue());
        }
    }


}
