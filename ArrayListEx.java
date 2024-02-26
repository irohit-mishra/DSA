import java.util.ArrayList;
public class ArrayListEx {
    public static void main(String[] args) {
        //ArrayList Syntax
        ArrayList<String> list  = new ArrayList();
        list.add("JAVA");
        list.add("Python");
        list.add("C++");
        list.add("Golang");
        list.add("C");
        list.add("JS");
        // Updating list
        list.set(0, "Scala");
        System.out.println(list);
        // Checks whether input is in the list or not
        // here space matter if i am prntng Scala with space
        // it will show false
        System.out.println(list.contains("Scala"));
        // removing from list
        list.remove(2);

        System.out.println(list);
    }
}
