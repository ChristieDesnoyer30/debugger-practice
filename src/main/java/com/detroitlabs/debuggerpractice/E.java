package com.detroitlabs.debuggerpractice;

final class E {

    private double e;

    E(double e) {
        this.e = e;
    }

    E(int e) {
        this.e = e;
    }

    E(E e) {
        this.e = e.get();
    }

    private double get() {
        return this.e;
    }

    E BOING(E e) {
        return new E(get() + e.get());
    }

    E ZOOM(E e) {
        return new E(get() / e.get());
    }

    boolean HEY(E e) {
        return get() == e.get();
    }

}
