    import java.util.Scanner;

abstract class Item {
    protected String nama;
    protected double harga;

    public Item(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public abstract void deskripsiItem();

    public double getHarga() {
        return harga;
    }
}

class Makanan extends Item {
    private boolean pedas;

    public Makanan(String nama, double harga, boolean pedas) {
        super(nama, harga);
        this.pedas = pedas;
    }

    @Override
    public void deskripsiItem() {
        System.out.println("Makanan: " + nama);
        System.out.println("Harga: Rp." + harga);
        System.out.println("Pedas: " + (pedas ? "Ya" : "Tidak"));
    }
}

class Minuman extends Item {
    private boolean dingin;

    public Minuman(String nama, double harga, boolean dingin) {
        super(nama, harga);
        this.dingin = dingin;
    }

    @Override
    public void deskripsiItem() {
        System.out.println("Minuman: " + nama);
        System.out.println("Harga: Rp." + harga);
        System.out.println("Dingin: " + (dingin ? "Ya" : "Tidak"));
    }
}

class Pesanan {
    private Item item;
    private int jumlah;

    public Pesanan(Item item, int jumlah) {
        this.item = item;
        this.jumlah = jumlah;
    }

    public void tampilkanDetailPesanan() {
        item.deskripsiItem();
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Total Harga: Rp." + (item.getHarga() * jumlah));
    }
}

public class RestoranMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama makanan: ");
        String namaMakanan = scanner.nextLine();
        System.out.print("Masukkan harga makanan: Rp.");
        double hargaMakanan = scanner.nextDouble();
        System.out.print("Makanan pedas? (true/false): ");
        boolean pedas = scanner.nextBoolean();

        Makanan makanan = new Makanan(namaMakanan, hargaMakanan, pedas);

        System.out.print("Masukkan nama minuman: ");
        scanner.nextLine();
        String namaMinuman = scanner.nextLine();
        System.out.print("Masukkan harga minuman: Rp.");
        double hargaMinuman = scanner.nextDouble();
        System.out.print("Minuman dingin? (true/false): ");
        boolean dingin = scanner.nextBoolean();

        Minuman minuman = new Minuman(namaMinuman, hargaMinuman, dingin);

        System.out.print("Masukkan jumlah pesanan makanan: ");
        int jumlahMakanan = scanner.nextInt();
        System.out.print("Masukkan jumlah pesanan minuman: ");
        int jumlahMinuman = scanner.nextInt();

        Pesanan pesananMakanan = new Pesanan(makanan, jumlahMakanan);
        Pesanan pesananMinuman = new Pesanan(minuman, jumlahMinuman);

        System.out.println("\nDetail Pesanan Makanan:");
        pesananMakanan.tampilkanDetailPesanan();
        System.out.println("\nDetail Pesanan Minuman:");
        pesananMinuman.tampilkanDetailPesanan();

        scanner.close();
    }
}
