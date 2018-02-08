package br.eng.rafaelpsouza;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Rafael Souza on 07/02/18.
 */
public class NullPointer {

    private Map<Integer, Person> repository = new HashMap<>();

    public Integer howOldAreYou(Integer id){
        Person person = repository.get(id);
        if(person != null){
            person.setName("NoName");
        }
        return person.getAge();
    }

    static class Person {
        Integer id;
        String name;
        Integer age;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }
}
