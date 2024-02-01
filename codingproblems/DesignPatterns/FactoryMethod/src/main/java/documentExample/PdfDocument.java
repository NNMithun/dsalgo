package documentExample;

public class PdfDocument implements Document {
    public void open() {
        System.out.println("PDF document opened.");
    }
    public void close() {
        System.out.println("PDF document closed.");
    }
    public void save() {
        System.out.println("PDF document saved.");
    }
    public void revert() {
        System.out.println("PDF document reverted to last save.");
    }
}