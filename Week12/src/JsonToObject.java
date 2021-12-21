import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.io.*;

public class JsonToObject {
	public static void main(String[] args) {
		Gson gson = new Gson();
		try {
			ArrayList<Barang> produk = gson.fromJson(
				new FileReader("D:\\Difah\\KULIAH\\SMT3\\PBO\\PRAKTIKUM\\Tugas 12\\barang.json"),
				new TypeToken<ArrayList<Barang>>() {}.getType()
			);
			for(int a = 0; a<produk.size(); a++) {
				System.out.println("Barang ke- " + (a+1) + " : " + produk.get(a).toString());
			}
		}catch(JsonIOException | JsonSyntaxException | FileNotFoundException e) {
			System.out.println(e.getMessage());
		}		
	}
}



