class LuxuryCar {
    private String brand;
    private String model;
    private int year;

    public LuxuryCar() {
        brand = "Unknown";
        model = "Unknown";
        year = 0;
    }

    public LuxuryCar(String brand) {
        this.brand = brand;
        model = "Unknown";
        year = 0;
    }

    public LuxuryCar(String brand, String model) {
        this.brand = brand;
        this.model = model;
        year = 0;
    }

    public LuxuryCar(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public static void main(String[] args) {
        LuxuryCar car1 = new LuxuryCar();
        LuxuryCar car2 = new LuxuryCar("Mercedes");
        LuxuryCar car3 = new LuxuryCar("BMW", "7 Series");
        LuxuryCar car4 = new LuxuryCar("Lamborghini", "Aventador", 2023);

        System.out.println("Car 1: " + car1.getBrand() + ", " + car1.getModel() + ", " + car1.getYear());
        System.out.println("Car 2: " + car2.getBrand() + ", " + car2.getModel() + ", " + car2.getYear());
        System.out.println("Car 3: " + car3.getBrand() + ", " + car3.getModel() + ", " + car3.getYear());
        System.out.println("Car 4: " + car4.getBrand() + ", " + car4.getModel() + ", " + car4.getYear());
    }
}
