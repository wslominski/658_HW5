import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RootsTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void calculate_roots_Doesnt_Cross() {
        Roots.calculate_roots(1,2,3);
        double numRoots = Roots.num_roots();
        assertEquals(0,numRoots,0.0001);
    }

    @Test
    public void calculate_roots_Doesnt_Cross_1() {
        Roots.calculate_roots(-1,2,-3);
        double numRoots = Roots.num_roots();
        assertEquals(0,numRoots,0.0001);
    }

    @Test
    public void calculate_roots_Crosses_Once() {
        Roots.calculate_roots(3,-6,3);
        double numRoots = Roots.num_roots();
        assertEquals(1,numRoots,0.0001);
    }

    @Test
    public void calculate_roots_Crosses_Once_1() {
        Roots.calculate_roots(-1,0,0);
        double numRoots = Roots.num_roots();
        assertEquals(1,numRoots,0.0001);
    }

    @Test
    public void calculate_roots_Crosses_Twice() {
        Roots.calculate_roots(3,3,-36);
        double numRoots = Roots.num_roots();
        assertEquals(2,numRoots,0.0001);
    }

    @Test
    public void calculate_roots_Crosses_Twice_1() {
        Roots.calculate_roots(-3,3,3);
        double numRoots = Roots.num_roots();
        assertEquals(2,numRoots,0.0001);
    }
}