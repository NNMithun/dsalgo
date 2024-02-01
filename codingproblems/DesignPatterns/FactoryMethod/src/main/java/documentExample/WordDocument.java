package documentExample;

public class WordDocument implements Document {
    public void open() {
        System.out.println("Word document opened.");
    }
    public void close() {
        System.out.println("Word document closed.");
    }
    public void save() {
        System.out.println("Word document saved.");
    }
    public void revert() {
        System.out.println("Word document reverted to last save.");
    }
}


