package lr10.JSON.task;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Scanner;

public class JSON {
    public static void main(String[] args) {
        try{
            String path = "C:/Users/Evgeniy/IdeaProjects/Course1/src/lr10/JSON/task/books.json";
            JSONParser parser = new JSONParser();
            Object obj = parser
                    .parse(new FileReader(path));
            JSONObject library = (JSONObject) obj;

            removeBook(library, path);

        }catch (Exception e){
            e.printStackTrace();
        }}
    private static void searchAuthor(JSONObject library){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите автора ");
        String author = scanner.nextLine();

        JSONArray books = (JSONArray) library.get("books");
        for (Object o: books){
            JSONObject book = (JSONObject) o;
            if(book.get("author").equals(author)){
                System.out.print(book.get("title") + " ");
                System.out.println(book.get("year"));}
        }
    }
    private static void addBook(JSONObject library, String path){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название книги ");
        String title = scanner.nextLine();
        System.out.print("Введите автора книги ");
        String author = scanner.nextLine();
        System.out.print("Введите год издания ");
        int year = scanner.nextInt();

        JSONArray books = (JSONArray) library.get("books");


        JSONObject newBook = new JSONObject();
        newBook.put("title", title);
        newBook.put("author", author);
        newBook.put("year", year);

        books.add(newBook);
        library.put("books", books);

        try (FileWriter file = new FileWriter(path)){
            file.write(library.toJSONString());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    private static void removeBook(JSONObject library, String path){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название книги ");
        String title = scanner.nextLine();

        JSONArray books = (JSONArray) library.get("books");

        Iterator iterator = books.iterator();
        while(iterator.hasNext()){
            JSONObject book = (JSONObject) iterator.next();
            if(title.equals(book.get("title"))){
                iterator.remove();}
        }
        try (FileWriter file = new FileWriter(path)){
            file.write(library.toJSONString());}
        catch (Exception e){e.printStackTrace();}}}
