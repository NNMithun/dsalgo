package documentExample;

public abstract class DocumentCreator {
    // Factory Method
    public abstract Document createDocument();

    public Document newDocument() {
        Document doc = createDocument();
        // Additional initialization or operations can be done here
        return doc;
    }
}
