package com.detroitlabs.debuggerpractice;

import java.util.Arrays;


final class C {
    static final R S_R_0 = new R(0);
    static final E S_E_0 = new E(0.0);
    static final E T_S_E = new E(2.0);
    static final R L_S = new R(1);
    static final E N = new E(1.0);
                                                                                                                        private static final R P1 = new R(6);                                                 private static final R P2 = new R(28);                            private static final R P3 = new R(496);                               private static final R P4 = new R(8128);
    static final R R = new R(0);

    static final RR P10 = new RR(Arrays.asList(P1));
    static final RR P100 = new RR(Arrays.asList(P10.get(0), P2));
    static final RR P1000 = new RR(Arrays.asList(P100.get(0), P100.get(1), P3));
    static final RR P10000 = new RR(Arrays.asList(P1000.get(0), P1000.get(1), P1000.get(2), P4));
}
