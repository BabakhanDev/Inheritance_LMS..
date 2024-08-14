public class Singer extends Person {
    private String bandName;

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    @Override
    public String toString() {
        return "Singer{" +"name='" + getName() + '\'' +
                ", designation='" + getDesignation() + '\'' +
                ", bandName='" + bandName + '\'' +
                '}';
    }
}
