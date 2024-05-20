package U8_xml_json.XML.ejercicios.ejemploSax;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class saxSimple {

  public static void main(String[] args) {

    try {

      // Obtención del Parser Sax
      SAXParserFactory spf = SAXParserFactory.newInstance();
      SAXParser saxParser = spf.newSAXParser();

      // Obtenemos la clase que hemos creado para manejar los eventos en los que estamos interesados
      // Debe implementar lo métodos de los interfaces que estime
      DefaultHandler personaSax = new personaSax();

      // Lanzo el parseado del fichero con nuestro manejador como un argumento
      saxParser.parse(
          new File("src/main/java/U8_xml_json/XML/ejercicios/ejemploSax/personasXML.xml"),
          personaSax);

    } catch (ParserConfigurationException | IOException | SAXException e) {
      System.out.println(Arrays.toString(e.getStackTrace()));
    }
  }
}
