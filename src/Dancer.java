public class Dancer extends  Person{
    private String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    public void dancing(){
        System.out.println(name+ " - Бийлеп жатат: ");
    }
    @Override
    public String toString() {
        return "Dancer{"+
                super.toString()+
                ", groupName='" + groupName + '\'' +
                '}';
    }
}
