import java.time.Clock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
    private int id;
    private String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setID(int id){
        this.id = id;
    }

    public void setName(String name){

        this.name = name;
    }

    public int getID(){
       return id;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return name;
    }
}

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        if(len1 > len2)
            return 1;
        else if(len1 < len2)
            return -1;
        return 0;
    }
}

class AlphabeticalComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return -    s1.compareTo(s2);

    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     ////////////Soring Strings////////////
       List<String> animals = new ArrayList<String>();
       animals.add("cat12345");
       animals.add("horse");
       animals.add("tiger");
       animals.add("rabbit");
       animals.add("goat");

       // Collections.sort(animals, new StringLengthComparator());

        Collections.sort(animals, new AlphabeticalComparator());

        for(String s: animals)
            System.out.println(s);

        //////////Sorting Numbers //////////////
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(6);
        numbers.add(11);
        numbers.add(56);
        numbers.add(22);

        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                return -num1.compareTo(num2);
            }
        });

        for(Integer number: numbers)
            System.out.println(number);


        //Sorting arbitrary objects////

        List<Person> people = new ArrayList<Person>();
        people.add(new Person(1, "Joe"));
        people.add(new Person(3, "Bob"));
        people.add(new Person(2, "Sue"));
        people.add(new Person(4  , "Clare"));

        //sort in order of ID
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                if(p1.getID() > p2.getID())
                return 1;
                else if(p1.getID() < p2.getID())
                    return -1;
                return 0;
            }
        });

        for(Person person: people){
            System.out.println(person);
        }

        //sort in order of Name
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {

                return p1.getName().compareTo(p2.getName());
            }
        });

        for(Person person: people){
            System.out.println(person);
        }


    }
}