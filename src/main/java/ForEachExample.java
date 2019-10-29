import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachExample {

    public static void main(String arg[]){

        ForEachExample ex = new ForEachExample();
        ex.getMap();
        ex.getList();

    }


    private void getMap(){

        Map<Integer, String> testMap = new HashMap<Integer, String>();
        testMap.put(1,"A");
        testMap.put(2,"B");
        testMap.put(3,"C");

        testMap.forEach((k,v)->System.out.println("Integer = " + k + "String = " + v));
    }

    private void getList(){
        List<String> testList = new ArrayList<String>();
        testList.add("A");
        testList.add("B");
        testList.add("C");

        testList.forEach((val)->System.out.println("Value = " + val ));
    }
}


