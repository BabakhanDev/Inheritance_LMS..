public class Programmer extends Person{
    private String companyName;


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;

    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + getName() + '\'' +
                ", designation='" + getDesignation() + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
