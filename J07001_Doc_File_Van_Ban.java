/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filePtit;

/**
 *
 * @author DuyChinhPro
 */
import java.util.*;
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;

public class J07001_Doc_File_Van_Ban {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\DuyChinhPro\\Documents\\NetBeansProjects\\File\\src\\main\\java\\filePtit\\DATA.in");
            Scanner readerFile = new Scanner(file);
            while(readerFile.hasNextLine()) {
                String data  = readerFile.nextLine();
                System.out.println(data);
            }
            readerFile.close();
        } catch(FileNotFoundException e) {
            System.out.println("Error");
        }
        
    }
}
