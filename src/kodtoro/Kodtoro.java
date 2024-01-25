
package kodtoro;


public class Kodtoro {

    int veletlenszam;
    public static void main(String[] args) {
        Kodtoro kodtoro = new Kodtoro();
        kodtoro.heble();
    }
    private void heble() {
        for (int i = 0; i < 4; i++) {
            veletlenszam = (int) (Math.random() * 6) + 1;
            System.out.println("Véletlenszám: " + veletlenszam);
        }
    }
}
