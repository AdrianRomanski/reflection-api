package adrianromanski;

import adrianromanski.model.Person;
import adrianromanski.util.ColumnField;
import adrianromanski.util.Metamodel;
import adrianromanski.util.PrimaryKeyField;

import java.util.List;

public class Main {

    public static void main(String[] args) {


        Metamodel<Person> metamodel = Metamodel.of(Person.class);

        PrimaryKeyField primaryKeyField = metamodel.getPrimaryKey();
        List<ColumnField> columnFields = metamodel.getColumns();

        System.out.println("Primary key name = " + primaryKeyField.getName() +
                ", type = " + primaryKeyField.getType().getSimpleName());

        for (ColumnField columnField : columnFields) {
            System.out.println("Column name = " + columnField.getName() +
                    ", type = " + columnField.getType().getSimpleName());
        }
    }
}
