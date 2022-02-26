package CS390Asssignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Prog3Test {

    @Test
    void binarySearch() {
        Prog3 p3 = new Prog3();
        int[]array = {2,6,8,9,5,4,1,3,11};

        boolean calling = p3.binarySearch(array, 0, array.length -1, 9);
        boolean checking = true;

        assertEquals(checking,calling);
    }
}