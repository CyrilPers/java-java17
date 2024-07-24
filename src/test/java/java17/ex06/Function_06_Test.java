package java17.ex06;


import java.util.function.Supplier;

import org.junit.Test;

import java17.data.Person;

/**
 * Exercice 06 - java.util.function.Supplier
 */
public class Function_06_Test {


    // tag::formatAge[]
    // TODO compléter la méthode
    // TODO la méthode retourne une chaîne de caractères de la forme [age=<AGE>] (exemple : [age=12])
    String formatAge(Supplier<Person> supplier) {
        return "[age=" + supplier.get().getAge() + "]";

    }
    // end::formatAge[]


    @Test
    public void test_supplier_formatAge() throws Exception {
        Person person = new Person("firstname", "lastname", 35, null);
        // TODO compléter le test unitaire pour qu'il soit passant
        Supplier supplier = new Supplier() {
            @Override
            public Object get() {
                return person;
            }
        };
        String result = formatAge(supplier);
        assert result.equals("[age=35]");
    }

}
