package lr10.HTML.task;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class NewsParser2 {
    public static void main(String[] args) {
        try{
            File file = new File("C:\\Users\\Evgeniy\\IdeaProjects\\Course1\\src\\lr10\\HTML\\task\\news.txt");
            FileWriter writer = new FileWriter(file, true);
            Document doc;
            try {
                doc = Jsoup.connect("http://fat.urfu.ru/index.html").get();
            }catch (IOException exception){
                System.out.println("Ошибка подключения к сайту "+exception.getMessage());
                System.out.println("Попытка переподключения к сайту");
                doc = Jsoup.connect("http://fat.urfu.ru/index.html").get();
            }
            Elements newsParent = doc
                    .select("body > table > tbody > tr > td > div > table > " +
                            "tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > " +
                            "tr > td:nth-child(1)");
            for (int i = 3; i < 20; i++) {
                if(!(i%2==0)){
                    List<Node> nodes = newsParent.get(0).childNodes();

                    writer.write("Тема: " +
                            ((Element) nodes.get(i))
                                    .getElementsByClass("blocktitle")
                                    .get(0).childNodes().get(0));
                    writer.write("\nДата: "+
                            ((Element) nodes.get(i))
                                    .getElementsByClass("blockdate")
                                    .get(0).childNodes().get(0)+"\n");}
            }
            writer.close();
        }catch (IOException e){
            e.printStackTrace();}}}
