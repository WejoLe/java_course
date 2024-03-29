package lr10.XML.task;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.List;
import java.util.Scanner;

public class XML {

    public static void main(String [] args) {
        try{
        File inputFile = new File ("C:\\Users\\Evgeniy\\IdeaProjects\\Course1\\src\\lr10\\XML\\task\\books.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(inputFile);
        doc.getDocumentElement().normalize();

        removeBook(doc,inputFile);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void addBook(Document doc, File inputFile) throws TransformerException
    {
        Scanner in = new Scanner(System.in);
        Node node = doc.getFirstChild();

        System.out.println("Введите название книги");
        String name = in.nextLine();
        System.out.println("Введите автора книги");
        String author = in.nextLine();
        System.out.println("Введите год издания книги");
        int year = in.nextInt();

        Element bookEl = doc.createElement("book");
        node.appendChild(bookEl);

        Element title = doc.createElement("title");
        title.appendChild(doc.createTextNode(name));
        bookEl.appendChild(title);

        Element authorEl = doc.createElement("author");
        authorEl.appendChild(doc.createTextNode(author));
        bookEl.appendChild(authorEl);

        Element yearEl = doc.createElement("year");
        yearEl.appendChild(doc.createTextNode(String.valueOf(year)));
        bookEl.appendChild(yearEl);

        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(inputFile);
        transformer.transform(source, result);
    }

    private static void searchBook(Document doc, File inputFile){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите автора книги");
        String author = in.nextLine();
        System.out.println("Введите год издания");
        int year = in.nextInt();

        NodeList nodeList = doc.getElementsByTagName("book");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if(node.getNodeType() == Node.ELEMENT_NODE){
                Element element = (Element) node;

                if(element.getElementsByTagName("author").item(0).getTextContent().equals(author)
                && element.getElementsByTagName("year").item(0).getTextContent().equals(String.valueOf(year))){
                    System.out.println(element.getElementsByTagName("title").item(0).getTextContent());
                }

            }
        }

    }
    private static void removeBook(Document doc, File inputFile)throws TransformerException{
        Scanner in = new Scanner(System.in);
        System.out.println("Введите автора книги");
        String author = in.nextLine();
        System.out.println("Введите название книги");
        String title = in.nextLine();

        NodeList nodeList = doc.getElementsByTagName("book");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if(node.getNodeType() == Node.ELEMENT_NODE){
                Element element = (Element) node;

                if(element.getElementsByTagName("author").item(0).getTextContent().equals(author)
                        && element.getElementsByTagName("title").item(0).getTextContent().equals(title)){
                    Node parentNode = element.getParentNode();
                    parentNode.removeChild(element);

                    Transformer transformer = TransformerFactory.newInstance().newTransformer();
                    DOMSource source = new DOMSource(doc);
                    StreamResult result = new StreamResult(inputFile);
                    transformer.transform(source, result);
                }
            }
        }

    }
}
