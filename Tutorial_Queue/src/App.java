import java.util.Iterator;
import java.util.LinkedList;

public class App {

    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<String>();

        animals.add("fox");
        animals.add("cat");
        animals.add("rabbit");
        animals.add("dog");
        animals.add("tiger");

        Iterator<String> it = animals.iterator();
        System.out.println(it);
        System.out.println(it.next());
        System.out.println(it.hasNext());
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("*******************");
        for(String animal:animals)
            System.out.println(animal);


        UrlLibrary urlLibrary = new UrlLibrary();
        for(String url: urlLibrary.urls )
            System.out.println(url);
    }
}
