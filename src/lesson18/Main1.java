package lesson18;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;

public class Main1
{
    /**
     * Задача 1:
     * Написать программу для парсинга xml документа. Необходимо распарсить xml документ и
     * содержимое тегов line записать в другой документ. Название файла для записи должно
     * состоять из значений тегов и имеет вид: <firstName>_<lastName>_<title>.txt
     */

    public static void main(String[] args)
            throws ParserConfigurationException, IOException, SAXException
    {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(new File("/IT/c24-onl/untitled/src/lesson18/text.xml"));
        Element sonnet = document.getDocumentElement();
        Element author = (Element) sonnet.getElementsByTagName("author").item(0);
        String firstName = author.getElementsByTagName("firstName").item(0).getTextContent();
        String lastName = author.getElementsByTagName("lastName").item(0).getTextContent();
        String title = sonnet.getElementsByTagName("title").item(0).getTextContent();
        NodeList lines = sonnet.getElementsByTagName("lines");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < lines.getLength(); i++)
        {
            stringBuilder.append(lines.item(i).getTextContent());
        }
        File textFile = new File("/IT/c24-onl/untitled/src/lesson18/" + firstName + "_" + lastName + "_" + title + ".txt");
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(textFile)))
        {
            bufferedWriter.write(stringBuilder.toString());
        }
    }
}
