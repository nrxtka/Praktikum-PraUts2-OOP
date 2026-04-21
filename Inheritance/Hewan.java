package Inheritance;

class Hewan {
    void suara() {
        System.out.println("Suara hewan");
    }
}

class Herbivora extends Hewan {
    void suara() {
        System.out.println("Suara herbivora");
    }
}

class Karnivora extends Hewan {
    void suara() {
        System.out.println("Suara karnivora");
    }
}

class Kelinci extends Herbivora {
    void suara() {
        System.out.println("Suara kelinci");
    }
}