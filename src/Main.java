//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Programmer programmer = new Programmer("Akyl","Coding().","Google");
        Dancer dancer = new Dancer("Sophia","Dancing().","KG312");
        Singer singer = new Singer("OMA","Singing().","Muras");

        System.out.println(programmer+"\n"+programmer.method()+"\n"+programmer.getDesignation());
        System.out.println(" ");
        System.out.println(dancer+"\n"+dancer.method()+"\n"+dancer.getDesignation());
        System.out.println(" ");
        System.out.println(singer+"\n"+singer.method()+"\n"+singer.getDesignation());

    }
}