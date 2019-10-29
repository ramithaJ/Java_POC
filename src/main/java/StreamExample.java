import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author ramitha
 */
public class StreamExample {

    public static void main(String arg[]){

        StreamExample ex = new StreamExample();
        ex.getStream();

    }

    private void getStream(){
        List<String> list = Arrays.asList("A","B","C","D","E");
        String result =  list.stream().filter(x->"C".equals(x)).findAny().orElse(null);
         System.out.println("result " + result);


       list.forEach((x)->{System.out.print(x);});

    }


}
