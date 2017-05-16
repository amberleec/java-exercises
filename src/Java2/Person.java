package Java2;

/**
 * Created by Amberlee on 5/16/17.
 */
public class Person {

    public String getName();
    public void setName(String name);


    Person person1 = new Person("Ethan");{
        System.out.println(person1.getName().equals(person2.getName()));
    }


    Person person2 = new Person("Cheyenne");{
        System.out.println(person1 == person2);
    }


}
