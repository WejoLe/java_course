package lr10.Excel.task;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Excel {
    public static void main(String[] args) {
       try{
           Scanner inp = new Scanner(System.in);
           String filePath = "C:\\Users\\Evgeniy\\IdeaProjects\\Course1\\src\\lr10\\Excel\\task\\goods.xls"; //неправильный формат файла (должен быть xlsx)
            FileInputStream inputStream;
            while(true) {
                try {
                    inputStream = new FileInputStream(filePath);
                    break;
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Введите путь еще раз:");
                    filePath = inp.nextLine();}
            }
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            String name = "Товары";
            while (true){
                try{
                    XSSFSheet sheet = workbook.getSheet(name);

                    for (Row row: sheet) {
                        for (Cell cell : row) {
                            System.out.print(cell.toString() + "\t");
                        }
                        System.out.println();
                    }
                    workbook.close();
                    inputStream.close();
                    break;
                }catch (Exception ex){System.out.println("\'" + name+"\' не найден");
                    System.out.println("Введите название листа еще раз: ");
                    name = inp.nextLine();}}
       }catch (IOException ex){System.out.println(ex.getMessage());}}}
