import java.util.*;

public class ComparatorExample {

    public static void main(String[] arg) {

        ComparatorExample ex = new ComparatorExample();
        ex.getDeveloperList();

    }

    private List<Developer> getDeveloperList(){
        Developer dev1 = new Developer("Beth");
        Developer dev2 = new Developer("Dellon");
        Developer dev3 = new Developer("Carry");
        Developer dev4 = new Developer("Adel");

        List<Developer> devList = new ArrayList<Developer>();
        devList.add(dev1);
        devList.add(dev2);
        devList.add(dev3);
        devList.add(dev4);


        //Using Collection Freamwork
        Collections.sort(devList, new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        //Using Lamda

        devList.sort((Developer o1, Developer o2)->o1.getName().compareTo(o2.getName()));
        devList.forEach((developer -> System.out.print(developer.getName())));

        return devList;
    }

 class Developer {

        Developer(String name){ this.name = name; }

        public String getName() { return name; }

        public void setName(String name) { this.name = name; }

        String name;

    }
}