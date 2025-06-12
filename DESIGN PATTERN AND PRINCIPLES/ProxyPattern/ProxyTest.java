package  ProxyPattern;

class ProxyTest {
    public static void main(String[] args) {
        Image img = new ProxyImage("photo1.jpg");
        img.display();
        System.out.println("Enjoy your image...adios");
        
    }
}
