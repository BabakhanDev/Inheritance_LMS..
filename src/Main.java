//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Programmer programmer = new Programmer("Akyl","Coding().","Google");
        Dancer dancer = new Dancer("Sophia","Dancing().","KG312");
        Singer singer = new Singer("OMA","Singing().","Muras");

        System.out.println(programmer);
        programmer.method();
        programmer.coding();
        System.out.println("..................................");
        System.out.println(dancer);
        dancer.method();
        dancer.dancing();
        System.out.println(" .................................");
        System.out.println(singer);
        singer.method();
        singer.singing();
        System.out.println(" .................................");

    }
}