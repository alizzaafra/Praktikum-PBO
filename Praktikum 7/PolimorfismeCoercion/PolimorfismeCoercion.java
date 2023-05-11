public class PolimorfismeCoercion {
    public static int kuadrat(int bilangan) {
        return bilangan * bilangan;
    }

    public static void main(String[] args) {
        // mendeklarasikan integer
        int bilangan = 10;

        // memaksa objek integer untuk diubah menjadi primitif
        int hasilKuadrat = kuadrat(bilangan);

        // objek bisa null
        System.out.printf("Hasil kuadrat %d adalah %d", bilangan, hasilKuadrat);
    }
}
