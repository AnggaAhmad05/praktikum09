import java.util.Scanner;
public class ArrayNilai05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];

        for(int i = 0; i < nilaiAkhir.length; i++){
            System.out.print("Masukan nilai akhir mahasiswa ke-" + (i+1) + ": ");
            nilaiAkhir[i] = sc.nextInt();
        }
        
        for(int i = 0; i < 10; i++){
            if(nilaiAkhir[i] > 70){
                System.out.println("Mahasiswa ke-" + (i+1) + " Lulus");
            }
            else if (nilaiAkhir[i] <= 70){
                System.out.println("Mahasiswa ke-" + (i+1) + " Tidak lulus");

            }
        }
        sc.close();
}
    
}
