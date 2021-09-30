import java.util.Scanner;

public class Soal1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        
        // fungsi replaceAll
        /* mengganti beberapa karakter dengan menggunakan pola Regular Expression (regex)
         * karakter regex "\W" untuk simbol-simbol yang bukan merupakan karakter 
         * karakter regex "\s" untuk spasi
         * tanda kuantifier"+" menandakan terjadi lebih dari satu kali
        * */
        
        // fungsi split
        /* berfungsi untuk membuat Array of String dari sebuah string yang dipisahkan oleh
           tanda pemisah/panjang tertentu
         * menghasilkan Array of String
         * */
        
        String[] string = (s.replaceAll("^[\\W+\\s+]", "").split("[\\s!,?._'@]+"));;
        
        if(s.length() > 0){
        	System.out.println(string.length); // untuk menghitung banyaknya bagian string yang terbentuk ke dalam Array of String
        	for (String i:string){
        			System.out.println(i); // untuk mencetak karakter yang dihasilkan
        	}
        }
        else
        System.out.println(0);
        input.close();
	}
}

