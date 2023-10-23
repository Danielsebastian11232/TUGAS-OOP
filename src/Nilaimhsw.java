import java.util.Scanner;

public class Nilaimhsw {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Name: ");
        String name= input.nextLine();

        System.out.print("Masukkan NIM: ");
        Integer nim = input.nextInt();

        
        System.out.print("Masukkan Nilai Tubes dengan benar: ");
        double nialiTubes = input.nextDouble();

        System.out.print("Masukkan Nilai Quiz dengan benar: ");
        double nilaiQuiz  = input.nextDouble();

        System.out.print("Masukkan Nilai Tugas dengan benar: ");
        double nilaiTugas = input.nextDouble();

        System.out.print("Masukkan Nilai UTS dengan benar: ");
        double nilaiUTS = input.nextDouble();

        System.out.print("Masukkan Nilai UAS dengan benar: ");
        double nilaiUAS = input.nextDouble();


        Nilai Nilai = new Nilai();
        double nilaiAkhir = Nilai.nilaiAkhir(nialiTubes, nilaiQuiz, nilaiTugas, nilaiUTS, nilaiUAS);
        
        
        System.out.println("\nName : " + name);
        System.out.println("NIM : " + nim);
        System.out.println("Nilai  Matakuliah Pemograman Berorientasi Objek OOP:" + nilaiAkhir);

        
        input.close();
    }   
}
