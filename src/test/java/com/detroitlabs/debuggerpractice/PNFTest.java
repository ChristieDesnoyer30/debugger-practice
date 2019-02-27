package com.detroitlabs.debuggerpractice;

import org.junit.Before;
import org.junit.Test;

import static com.detroitlabs.debuggerpractice.C.*;
import static org.junit.Assert.*;

public class PNFTest {

    private PNF subject;

    @Before
    public void setUp() {
        subject = new PNF();
    }

    @Test
    public void correctly_finds_everything_under_10() {
        assertEquals(P10, subject.gpnu(new R(10)));
    }

    @Test
    public void correctly_finds_everything_under_100() {
        assertEquals(P100, subject.gpnu(new R(100)));
    }

    @Test
    public void correctly_finds_everything_under_1000() {
        assertEquals(P1000, subject.gpnu(new R(1000)));
    }

    @Test
    public void correctly_finds_everything_under_10000() {
        assertEquals(P10000, subject.gpnu(new R(10000)));
    }

}
