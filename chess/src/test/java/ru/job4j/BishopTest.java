package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.white.BishopWhite;

public class BishopTest {

    @Test
    public void bishopWay1() throws RuntimeException {
        BishopWhite bb = new BishopWhite(Cell.D4);
        Cell[] expect = {Cell.E5, Cell.F6, Cell.G7};
        Cell[] result = bb.way(Cell.D4, Cell.G7);
        Assert.assertArrayEquals(result, expect);
    }

    @Test
    public void bishopWay2() throws RuntimeException {
        BishopWhite bb = new BishopWhite(Cell.D4);
        Cell[] expect = {Cell.C3, Cell.B2, Cell.A1};
        Cell[] result = bb.way(Cell.D4, Cell.A1);
        Assert.assertArrayEquals(result, expect);
    }

    @Test
    public void bishopWay3() throws RuntimeException {
        BishopWhite bb = new BishopWhite(Cell.D4);
        Cell[] expect = {Cell.C5, Cell.B6, Cell.A7};
        Cell[] result = bb.way(Cell.D4, Cell.A7);
        Assert.assertArrayEquals(result, expect);
    }

    @Test
    public void bishopWay4() throws RuntimeException {
        BishopWhite bb = new BishopWhite(Cell.D4);
        Cell[] expect = {Cell.E3, Cell.F2, Cell.G1};
        Cell[] result = bb.way(Cell.D4, Cell.G1);
        Assert.assertArrayEquals(result, expect);
    }
}
