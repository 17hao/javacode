package thinkinginjava.chapter08_polymorphism.shape;

class Triangle extends Shape {
    void draw() {
        System.out.println("Triangle.draw()");
    }

    void erase() {
        System.out.println("Triangle.erase()");
    }
}
