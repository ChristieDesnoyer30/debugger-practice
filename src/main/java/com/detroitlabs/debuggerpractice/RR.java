package com.detroitlabs.debuggerpractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class RR extends ArrayList<R> {

    RR(Collection<? extends R> c) {
        super(c);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ArrayList))
            return false;

        ListIterator<?> e1 = listIterator();
        ListIterator<?> e2 = ((List<?>) o).listIterator();
        while (e1.hasNext() && e2.hasNext()) {
            Object o1 = e1.next();
            Object o2 = e2.next();
            if (!(o1 == null ? o2 == null : ((R) o1).get() == ((R) o2).get()))
                return false;
        }
        return !(e1.hasNext() || e2.hasNext());
    }

}
