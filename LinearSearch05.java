import java.util.Scanner;

public class LinearSearch05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int key;
        int hasil = -1;
        int element;

        System.out.print("Masukan jumlah element Array : ");
        element = sc.nextInt();
        int[] arrayInt= new int[element];;


        for(int i = 0; i < arrayInt.length; i++){
            System.out.print("Masukan element Array : ");
            arrayInt[i] = sc.nextInt();
        }
        System.out.print("Masukan key yang ingin dicari : ");
        key = sc.nextInt();

        for(int i = 0; i < arrayInt.length; i++){
            if (arrayInt[i] == key) {
                hasil = i;
                System.out.println("key ada di posisi indeks ke- : " + hasil);
            }
        }
        if(hasil == -1) {
            System.out.println("Key tidak ditemukan");
        }
    
           

    }
 
}
