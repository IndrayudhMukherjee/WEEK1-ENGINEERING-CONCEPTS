//File: FactoryTest.java
package FactoryMethodPatternExample;

class FactoryTest {
    public static void main(String[] args) {
        DocumentFactory factory;
        Document doc;

        factory = new PdfFactory();
        doc = factory.createDocument();
        doc.open();

        factory = new WordFactory();
        doc = factory.createDocument();
        doc.open();

        factory = new ExcelFactory();
        doc = factory.createDocument();
        doc.open();
    }
}
