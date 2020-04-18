package adrianromanski;

import adrianromanski.model.Person;
import adrianromanski.orm.EntityManager;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

public class ReadingObjects {

    public static void main(String[] args)  throws SQLException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException{

        EntityManager<Person> entityManager = EntityManager.of(Person.class);

        Person linda = entityManager.find(Person.class, 1L);
        Person james = entityManager.find(Person.class, 2L);
        Person susan = entityManager.find(Person.class, 3L);
        Person john = entityManager.find(Person.class, 4L);

        System.out.println(linda.toString());
        System.out.println(james.toString());
        System.out.println(susan.toString());
        System.out.println(john.toString());
    }
}
