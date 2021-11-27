package Soal3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Filefile {

	public static void main(String[] args) {
	    try {
	    // membaca file
	       File fileName = new File("nameFile.txt");
	       Scanner myReader = new Scanner(fileName);
	       myReader.close();
	    } catch (FileNotFoundException e) {
	       System.out.println("Error: " + e.getMessage());
	       e.printStackTrace();
	    }
	}
}
