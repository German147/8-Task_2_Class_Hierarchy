package org.universityHierarchy.Homework_Parser_with_DOM_STAX_SAX;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class GermanBarreraReadXml_UsingSAX extends DefaultHandler {

    private static final Logger LOGGER = LogManager.getLogger(GermanBarreraReadXml_UsingSAX.class);

    public static void main(String[] args) {

        try {
            SAXParser p = SAXParserFactory.newInstance().newSAXParser();
            p.parse(new FileInputStream("D:\\GERMAN\\PROGRAMACION\\Solvd\\src\\main\\resources\\books.xml"), new GermanBarreraReadXml_UsingSAX());
        } catch (ParserConfigurationException e) {
            LOGGER.debug(e);
        } catch (SAXException e) {
            LOGGER.debug(e);
        } catch (FileNotFoundException e) {
            LOGGER.debug(e);
        } catch (IOException e) {
            LOGGER.debug(e);
        }
    }

    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
        LOGGER.info("Document Start here: ");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes);
        LOGGER.info("<" + qName + "> ");
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        super.characters(ch, start, length);
        LOGGER.info(new String(ch, start, length));
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName);
        LOGGER.info("</" + qName + ">");
    }

    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
        LOGGER.info("Document ends here");
    }
}
