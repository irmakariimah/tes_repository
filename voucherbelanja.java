import java.util.Scanner;

public class voucherbelanja {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    int belanja;
    System.out.print("Masukkan total belanjaan : Rp ");
    belanja = input.nextInt();
	 if ( belanja > 300000 ) {
            System.out.println("Selamat, anda mendapatkan voucher belanja Rp. 20.000");
        }
		   System.out.println("Terima kasih telah berbelanja");
	}

}