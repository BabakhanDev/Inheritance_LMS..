public class Person {
    protected String name;
   protected String designation;


    public Person() {
    }

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }
    public void  method (){
        System.out.println(name+" - Окуп жатат \n" +
                name+" - басып жатат\n" +
                name+" - тамактанып жатат");
    }

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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
