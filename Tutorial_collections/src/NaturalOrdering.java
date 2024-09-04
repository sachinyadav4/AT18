import java.util.*;

class Persons implements Comparable<Persons>{
    private String name;

    Persons(String name) {
        this.name=name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persons persons = (Persons) o;
        return Objects.equals(name, persons.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Persons persons) {
        //sorting in alphabetical order
        // return name.compareTo(persons.name);
        //sorting on length basis
        int len1 = name.length();
        int len2 = persons.name.length();
        if(len1 > len2)
            return 1;
        else if(len1 < len2)
            return -1;
        return name.compareTo(persons.name);
    }
}

public class NaturalOrdering {

    public static void main(String[] args){
        List<Persons> list = new ArrayList<Persons>();

        SortedSet<Persons> set = new TreeSet<Persons>();


        addElements(list);
        addElements(set);
        Collections.sort(list);
        System.out.println("******ARRAYLIST*****");
        showElements(list);

        System.out.println("******SET*****");
        showElements(set);
    }

    private static void addElements(Collection<Persons> col) {
        col.add(new Persons("Joe"));
        col.add(new Persons("Sue"));
        col.add(new Persons("Juliet"));
        col.add(new Persons("Clare"));
        col.add(new Persons("Bob"));

    }

    private static void showElements(Collection<Persons> col) {
        for(Persons s:col)
System.out.println(s);
    }
}
