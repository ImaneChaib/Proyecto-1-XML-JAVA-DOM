
import java.io.File;




/**
 *
 * @author IMANE
 */
public class Proyecto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        AccesoDOM accesoLibro = new AccesoDOM();
        File fichero = new File("./src/books.xml");

        accesoLibro.abrirXMLaDOM(fichero);
        accesoLibro.recorrerDOM();
        
        accesoLibro.insertarLibroEnDOM("Kiril", "His First Book", "Comedy", 12.42, "2023-11-08", "The description is not present.");
        
        accesoLibro.recorrerDOM();

        accesoLibro.deleteNode("Midnight Rain");
        accesoLibro.recorrerDOM();
        accesoLibro.guardarDOMcomoArchivo("./src/newBooks.xml");
    }

}
