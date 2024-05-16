package org.obscenejava.tidbits.parameters;

public class SomeParamApi {

    public static class Person {
        public String givenName;
        public String gender;
    }

    public static Person createPersonFromOtherPerson(final Person person, final String newGender) {
        person.gender = newGender;
        return person;
    }
}
