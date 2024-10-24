import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, XMLStreamException {
        String ruta = "prueba.xml";
        // Instanciamos XMLOutputFactory con newInstance porque es una clase abstracta
        // y no se puede instanciar directamente.
        XMLOutputFactory factory = XMLOutputFactory.newInstance();
        FileWriter fileWriter = new FileWriter(ruta);
        XMLStreamWriter writer = factory.createXMLStreamWriter(fileWriter);
        writer.writeStartDocument("1.0");
            writer.writeStartElement("autores");

                writer.writeStartElement("autor");
                    writer.writeAttribute("codigo", "a1");
                        writer.writeStartElement("nombre");
                            writer.writeCharacters("Alexandre Dumas");
                        writer.writeEndElement();
                        writer.writeStartElement("titulo");
                            writer.writeCharacters("El conde de montecristo");
                        writer.writeEndElement();
                        writer.writeStartElement("titulo");
                            writer.writeCharacters("miserables");
                        writer.writeEndElement();
                writer.writeEndElement();

                writer.writeStartElement("autor");
                    writer.writeAttribute("codigo", "a2");
                        writer.writeStartElement("nombre");
                            writer.writeCharacters("Fiodor Dostoyevski");
                        writer.writeEndElement();
                        writer.writeStartElement("titulo");
                            writer.writeCharacters("El idiota");
                        writer.writeEndElement();
                        writer.writeStartElement("titulo");
                            writer.writeCharacters("Noches blancas");
                        writer.writeEndElement();
                writer.writeEndElement();

            writer.writeEndElement();

            writer.close();

    }
}
