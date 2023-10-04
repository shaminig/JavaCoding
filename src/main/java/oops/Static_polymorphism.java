package oops;

public class Static_polymorphism {
    public int add(int x, int y) {
        return x + y;
    }

    public float add(float x, float y, float z) {
        return x + y + z;
    }

    public float add(float x, int y, int z) {
        return x + y + z;
    }
}

class Polymorphism {
    Static_polymorphism sp = new Static_polymorphism();


    public static void main(String[] args) {
    }
}