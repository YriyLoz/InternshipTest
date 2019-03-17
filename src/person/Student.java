package person;

import person.consciousness.Knowledge;

public class Student {
    private String name;
    private Knowledge knowledge;


    public Student(String name, int level) {
        this.name = name;
        knowledge = new Knowledge(level);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Knowledge getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(Knowledge knowledge) {
        this.knowledge = knowledge;
    }

    @Override
    public String toString() {

        return name+" "+knowledge.getLevel();
    }
}
