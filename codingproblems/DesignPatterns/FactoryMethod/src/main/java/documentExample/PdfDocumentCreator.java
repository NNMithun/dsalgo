package documentExample;

public class PdfDocumentCreator extends DocumentCreator {
    public Document createDocument() {
        return new PdfDocument();
    }
}
