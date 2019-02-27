package com.detroitlabs.debuggerpractice;

import java.util.ArrayList;
import java.util.List;

import static com.detroitlabs.debuggerpractice.C.*;

final class DF {

    List<R> gD(R r1) {
        List<R> ds = new ArrayList<>();
        for (R r2 = L_S; r2.boop(r1); r2 = r2.bop()) {
            if (r1.boo(r2).moo(R)) {
                ds.add(r2);
            }
        }
        return ds;
    }

    List<E> gID(R r) {
        List<R> ds = gD(r);
        ds.add(r);
        return iv(ds);
    }

    private List<E> iv(List<R> rs) {
        List<E> ins = new ArrayList<>();
        for (R r: rs) {
            E d = new E(r.get());
            ins.add(new E(N.ZOOM(d)));
        }
        return ins;
    }

}
