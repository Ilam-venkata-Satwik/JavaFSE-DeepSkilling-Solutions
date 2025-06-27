class Main {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .setCpu("Intel i7")
                .setRam("16GB")
                .setStorage("512GB SSD")
                .build();

        computer.displaySpecs();
    }
}
