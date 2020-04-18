package adrianromanski;

import adrianromanski.model.Person;
import adrianromanski.orm.EntityManager;

import java.sql.SQLException;

public class WritingObjects {

    public static void main(String[] args) throws SQLException, IllegalAccessException {

        EntityManager<Person> entityManager = EntityManager.of(Person.class);

        Person linda = new Person("Linda", 31);
        Person james = new Person("James", 24);
        Person susan = new Person("Susan", 34);
        Person john = new Person("John", 33);

        System.out.println("Writing to DB");

        entityManager.persist(linda);
        entityManager.persist(james);
        entityManager.persist(susan);
        entityManager.persist(john);


    }
}
