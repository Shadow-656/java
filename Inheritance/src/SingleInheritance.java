class BMW {
    void performance() {
        System.out.println("BMW is best performance car.");
    }
}

class RR extends BMW {
    void luxury() {
        System.out.println("RR is best luxury car.");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        RR rr = new RR();
        rr.performance();
        rr.luxury();
    }
}

