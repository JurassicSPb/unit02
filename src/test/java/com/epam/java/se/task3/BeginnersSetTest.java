package com.epam.java.se.task3;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by Мария on 23.02.2017.
 */
public class BeginnersSetTest {
    @Test
    public void paperProductTest() throws Exception{
        Notebook n = new Notebook("Notebook", -20, 300, "black");
        System.out.println(n.toString());
        n.changeNumberOfPages(50);
        System.out.println(n.toString());

        OfficePaper o = new OfficePaper("Svetocopy", 400, 3, "A4");
        n.changeNumberOfPages(-500);
        System.out.println(o.toString());
    }
    @Test
    public void calculationToolTest() throws Exception{
        EngineerCalculator e = new EngineerCalculator("Casio", 1000, 7);
        e.setNumberOfExtendedFunctions(8);
        assertTrue(e.getNumberOfExtendedFunctions()==8);

    }
    @Test
    public void beginnersSetTest() throws Exception{
        BeginnersSet b = new BeginnersSet();

        System.out.println(b);


    }
}