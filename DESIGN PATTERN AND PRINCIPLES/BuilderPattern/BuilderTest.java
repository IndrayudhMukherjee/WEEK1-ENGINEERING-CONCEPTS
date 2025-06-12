package BuilderPattern;


    class BuilderTest {
    public static void main(String[] args) {
        Computer gamingPC = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .build();
        gamingPC.specs();

        Computer officePC = new Computer.Builder()
                .setCPU("i5")
                .setRAM("8GB")
                .setStorage("512GB SSD")
                .build();
        officePC.specs();
    }
}
    

