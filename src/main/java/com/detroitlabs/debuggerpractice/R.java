package com.detroitlabs.debuggerpractice;

final class R {

    private int r;

    R(int r) {
        this.r = r;
    }

    int get() {
        return this.r;
    }

    R beep(R r) {
        return new R(get() + r.get());
    }

    R bop() {
        return new R(get() + 1);
    }

    boolean boop(R r) {
        return get() < r.get();
    }

    R boo(R r) {
        return new R(r.get() % get());
    }

    boolean moo(R r) {
        return get() == r.get();
    }

}
