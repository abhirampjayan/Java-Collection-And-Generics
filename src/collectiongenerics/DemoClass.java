package collectiongenerics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DemoClass {
    public static void main(String[] args) {
        Collection<Integer> values=new ArrayList<>();
        values.add(30);
        values.add(31);
        values.add(32);


        Iterator i = values.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
values.remove(31);
        for (int j:values) {
            System.out.println(j);
        }
    }
}
