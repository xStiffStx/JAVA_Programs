public class Main {
    public static void main(String[] args) {
        Smartphone miSmartphone = new Smartphone("Samsung", "S24+", 999.99);

        System.out.println("Información del Smartphone:");
        miSmartphone.mostrarInformacion();

        miSmartphone.setMarca("Apple");
        miSmartphone.setModelo("Iphone 13+");
        miSmartphone.setPrecio(1200);
        System.out.println("\nInformacion actualizada del Smartphone:");
        miSmartphone.mostrarInformacion();
    }
}
