package arraylist;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        System.out.println("Bharat mata ki jay");

        ArrayList a = new ArrayList();
        a.add(10);
        a.add("ram kumar");
        a.add("Maniyari");
        a.add(true);

        System.out.println(a);

        System.out.println(a.size());

        ArrayList arrayList = new ArrayList(22);
        System.out.println(arrayList.size());
        System.out.println(arrayList);

    }

}
