public class EnumInit {

    enum Planet {
        MERCURY(3.30e23, 2.44e6),
        VENUS(4.87e24, 6.05e6),
        EARTH(5.97e24, 6.37e6),
        MARS(6.42e23, 3.40e6);

        private final double mass;
        private final double radius;

        // Конструктор перечисления
        Planet(double mass, double radius) {
            this.mass = mass;
            this.radius = radius;
        }

        public double getMass() { return mass; }
        public double getRadius() { return radius; }
    }

    public static void main(String[] args) {
        for (Planet p : Planet.values()) {
            System.out.printf("%s: масса = %.2e кг, радиус = %.2e м%n",
                    p, p.getMass(), p.getRadius());
        }
    }
}
