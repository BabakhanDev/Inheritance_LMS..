public class Person {
    private String name;
    private String designation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }



    public void setDesignation(String designation) {
        this.designation = designation;

    }
    public Person() {
    }

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }
    public String method (){
        return ("Learn().\n" +
                "Walk().\n" +
                "Eat().");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
