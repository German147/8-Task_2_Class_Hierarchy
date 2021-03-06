package org.universityHierarchy.Homework_Parser_with_DOM_STAX_SAX;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class GermanBarreraDOMParser {

    private static final Logger LOGGER = LogManager.getLogger(GermanBarreraDOMParser.class);

    public static void main(String[] args) {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newDefaultInstance();
/**
 * In the following implementation I parse an xml file to be shown and
 * display into the console
 */
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(System.getenv("FILE"));
            NodeList bookList = doc.getElementsByTagName("book");
            for (int i = 0; i < bookList.getLength(); i++) {
                Node b = bookList.item(i);
                //Here this ELEMENT_NODE represent a tag
                if (b.getNodeType() == Node.ELEMENT_NODE) {
                    //we cast b to Element type, then we grab the id attribute
                    Element book = (Element) b;
                    String id = book.getAttribute("id");
                    //Now I start looking for the child classes names and content then I print it
                    NodeList authorList = book.getChildNodes();
                    for (int j = 0; j < authorList.getLength(); j++) {
                        Node authorName = authorList.item(j);
                        if (authorName.getNodeType() == Node.ELEMENT_NODE) {
                            Element author = (Element) authorName;
                            LOGGER.info("From Book id " + id + " : " + author.getTagName() +
                                    " = " + author.getTextContent());

                        }
                    }
                }
            }
        } catch (ParserConfigurationException | IOException | SAXException pce) {
            LOGGER.debug(pce);
        }
    }
}
