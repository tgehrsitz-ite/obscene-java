package org.obscenejava.tidbits.parameters;

import static org.obscenejava.tidbits.parameters.SomeParamApi.Person;
import static java.lang.System.out;

public class SomeParamApp {

    public static void main(String[] args) {

        final Person onePerson = new Person();
        onePerson.givenName = "Peter";
        onePerson.gender = "M";

        final Person anotherPerson = SomeParamApi.createPersonFromOtherPerson(onePerson, "W");

        out.println(onePerson.gender);
        out.println(anotherPerson.gender);
    }
}
