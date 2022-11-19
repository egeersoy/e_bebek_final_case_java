package e_bebek_final;

public class Main {
    public static void main(String[] args) {
        PatikaStore patikaStore = new PatikaStore("Patika Store");
        Menu menu = new Menu(patikaStore);

        menu.mainMenu();
    }
}
