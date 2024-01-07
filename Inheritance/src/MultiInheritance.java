class BMW_Cars {
    void performance() {
        System.out.println("BMW is best performance car.");
    }
}

class RR_Cars extends BMW_Cars {
    void luxury() {
        System.out.println("RR is best luxury car.");
    }
}

class Mercedes_Benz_Cars extends RR_Cars {
    void toycar() {
        System.out.println("Mercedes-Benz is nothing compared to RR.");
    }
}

public class MultiInheritance {
    public static void main(String[] args) {
        Mercedes_Benz_Cars mercedes_benz_cars = new Mercedes_Benz_Cars();
        mercedes_benz_cars.performance();
        mercedes_benz_cars.luxury();
        mercedes_benz_cars.toycar();
    }
}
