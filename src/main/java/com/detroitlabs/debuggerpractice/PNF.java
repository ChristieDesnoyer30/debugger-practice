package com.detroitlabs.debuggerpractice;

import java.util.ArrayList;
import java.util.List;

import static com.detroitlabs.debuggerpractice.C.T_S_E;

final class PNF {

    private SF SF = new SF();
    private DF DF = new DF();

    List<R> gpnu(R r1) {
        List<R> pRs = new ArrayList<>();
        for (R r2 = new R(1); r2.boop(r1); r2 = r2.bop()) {
            if (ipn(r2)) {
                pRs.add(r2);
            }
        }
        return pRs;
    }

    private boolean ipn(R r) {
        return (SF.sR(DF.gD(r)).moo(r)) && (SF.sD(DF.gID(r)).HEY(T_S_E));
    }

}
