public class Singer extends Person {
    private String bandName;



    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public void singing(){
        System.out.println(name+" Ырдап жатат: ");
    }
    public void playGitar(){
        System.out.println(name+" - Гитара ойноп жатат: ");}


    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
    @Override
    public String toString() {
        return "Singer{" +
                super.toString()+
                ", bandName='" + bandName + '\'' +
                '}';
    }
}
