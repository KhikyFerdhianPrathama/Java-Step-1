package lat;

/**
 *
 * @author Dhian
 */
import java.util.Scanner;
public class Lat {

    public static void main(String[] args) {

        int harga1,harga2=0;
        int jumlah1,jumlah2=0;
        boolean run = true;
        String pilih;
        
        while (run){
            System.out.println("##############PROGRAM KASIR TOKO BUNGA BU AYA##############");
            
            Scanner input1 = new Scanner (System.in);
            System.out.print("Masukkan harga bunga yang dibeli  : ");
            harga1 = input1.nextInt();
            
            Scanner input2 = new Scanner (System.in);
            System.out.print("Masukkan jumlah bunga yang dibeli : ");
            jumlah1 = input2.nextInt();
            
            Scanner input3 = new Scanner (System.in);
            System.out.print("Apakah ada bunga yang dibeli lagi? [y/n] : ");
            pilih = input3.next();
            if (pilih.equalsIgnoreCase("y")){
                run = true;
                Scanner input4 = new Scanner (System.in);
                System.out.print("Masukkan harga bunga yang dibeli  : ");
                harga2 = input4.nextInt();

                Scanner input5 = new Scanner (System.in);
                System.out.print("Masukkan jumlah bunga yang dibeli : ");
                jumlah2 = input5.nextInt();
                
                int hargaTotal = harga1+harga2;
                int jumlahTotal = jumlah1+jumlah2;
                int totalHarga = hargaTotal*jumlahTotal;
                int uangBayar = hargaTotal*40/100;
                
                if (totalHarga>=50000){
                    int diskon = totalHarga*40/100;
                    System.out.println("Selamat anda mendapat diskon 40% jadi anda "
                            + "membayar sebesar "+ totalHarga);
                    System.out.println("==========STRUK PEMBELIAN==========");
                    System.out.println("Harga Pembelian barang : "+hargaTotal);
                    System.out.println("Jumlah barang yang dibeli : "+jumlahTotal);
                    System.err.println("Total harga : "+totalHarga);
                    System.out.println("===================================");
                    System.out.println("Diskon (potongan harga) : 40%");
                    System.out.println("Uang yang harus dibayarkan : "+diskon);
                    Scanner input6 = new Scanner (System.in);
                    System.out.print("Uang yang diberikan : ");
                    int uang = input6.nextInt();
                    int kembali = uang-diskon;
                    System.out.println("Uang kembalian : "+kembali);
                    System.out.println("===================================");
                    System.out.println("Terimaksih telah berbelanja :)");
                    System.out.println("===================================");
                }
                if (totalHarga<50000){
                    int diskon = totalHarga*40/100;
                    System.out.println("Selamat anda mendapat diskon 40% jadi anda"
                            + "membayar sebesar "+ totalHarga);
                    System.out.println("==========STRUK PEMBELIAN==========");
                    System.out.println("Harga Pembelian barang : "+hargaTotal);
                    System.out.println("Jumlah barang yang dibeli : "+jumlahTotal);
                    System.err.println("Total harga : "+totalHarga);
                    System.out.println("===================================");
                    System.out.println("Diskon (potongan harga) : 40%");
                    System.out.println("Uang yang harus dibayarkan : "+diskon);
                    Scanner input6 = new Scanner (System.in);
                    System.out.print("Uang yang diberikan : ");
                    int uang = input6.nextInt();
                    int kembali = uang-diskon;
                    System.out.println("Uang kembalian : "+kembali);
                    System.out.println("===================================");
                    System.out.println("Terimaksih telah berbelanja :)");
                    System.out.println("===================================");
                }
                
                
                
            }
            if (pilih.equalsIgnoreCase("n")){
                run = false;
                int hargaTotal = harga1+harga2;
                int jumlahTotal = jumlah1+jumlah2;
                int totalHarga = hargaTotal*jumlahTotal;
                if (totalHarga>=50000){
                    int diskon = totalHarga*40/100;
                    System.out.println("Selamat anda mendapat diskon 40% jadi anda"
                            + "membayar sebesar "+ totalHarga);
                    System.out.println("==========STRUK PEMBELIAN==========");
                    System.out.println("Harga Pembelian barang : "+hargaTotal);
                    System.out.println("Jumlah barang yang dibeli : "+jumlahTotal);
                    System.err.println("Total harga : "+totalHarga);
                    System.out.println("===================================");
                    System.out.println("Diskon (potongan harga) : 40%");
                    System.out.println("Uang yang harus dibayarkan : "+diskon);
                    Scanner input6 = new Scanner (System.in);
                    System.out.print("Uang yang diberikan : ");
                    int uang = input6.nextInt();
                    int kembali = uang-diskon;
                    System.out.println("Uang kembalian : "+kembali);
                    System.out.println("===================================");
                    System.out.println("Terimaksih telah berbelanja :)");
                    System.out.println("===================================");
                }
                if (totalHarga<50000){
                    System.out.println("Anda tidak mendapatkan diskon");
                    System.out.println("==========STRUK PEMBELIAN==========");
                    System.out.println("Harga Pembelian barang : "+hargaTotal);
                    System.out.println("Jumlah barang yang dibeli : "+jumlahTotal);
                    System.err.println("Total harga : "+totalHarga);
                    System.out.println("===================================");
                    System.out.println("Diskon (potongan harga) : 0%");
                    System.out.println("Uang yang harus dibayarkan : "+totalHarga);
                    Scanner input6 = new Scanner (System.in);
                    System.out.print("Uang yang diberikan : ");
                    int uang = input6.nextInt();
                    int kembali = uang-totalHarga;
                    System.out.println("Uang kembalian : "+kembali);
                    System.out.println("===================================");
                    System.out.println("Terimaksih telah berbelanja :)");
                    System.out.println("===================================");
                }
                
                            }
            
            
            
        }
        
        
    }
    
}
