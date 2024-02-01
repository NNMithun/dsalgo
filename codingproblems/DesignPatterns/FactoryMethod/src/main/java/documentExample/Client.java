package documentExample;

public class Client {
    public static void main(String[] args) {
        DocumentCreator creator = new WordDocumentCreator();
        Document doc = creator.newDocument();
        doc.open();
        // Perform operations on the document

        creator = new PdfDocumentCreator();
         doc = creator.newDocument();
        doc.open();
    }
}
