class A {
    int a, b, c, z;

    public A() {
        this(0, 0, 0);  // вызов конструктора с 3 параметрами
    }

    public A(int a) {
        this(a, 0, 0);
    }

    public A(int a, int b) {
        this(a, b, 0);
    }

    public A(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.z = 1;
    }
    
    void print() {
        System.out.printf("a=%d, b=%d, c=%d, z=%d%n", a, b, c, z);
    }

    public static void main(String[] args) {
        new A().print();
        new A(5).print();
        new A(5, 10).print();
        new A(5, 10, 15).print();
    }
}
