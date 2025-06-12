package FactoryMethodPatternExample;

class FactoryMethodPatternExample {
    public static void main(String[] args) {
        DocumentFactory factory = new PdfFactory();
        Document doc = factory.createDocument();
        doc.open();

        factory = new WordFactory();
        doc = factory.createDocument();
        doc.open();
    }
}
