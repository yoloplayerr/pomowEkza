package fileWorks;

import java.io.BufferedReader;
import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner; // Import the Scanner class to read text files

public class FileWorks {
	//В этом методе вытаскиваем данные с файла
	public static ArrayList<String> getDataFromFile(String fileName) {

		ArrayList<String> text = new ArrayList<>();
		try {
			String str = null;
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			// пока строки не кончились,записываем каждую строку в переменную str 
			while ((str = br.readLine()) != null) {
				//добавляем в список строку
				text.add(str);
			}
			br.close();

		} catch (IOException exc) {
			System.out.println("IO error!" + exc);

		}
		return text;
	}

	public static boolean writeToFile(String text,String filename) {
		try (FileWriter writer = new FileWriter(filename, false)) {
			// запись всей строки
			writer.write(text);
			writer.flush();
		} catch (IOException ex) {

			System.out.println(ex.getMessage());
		}
		return true;
	}
}