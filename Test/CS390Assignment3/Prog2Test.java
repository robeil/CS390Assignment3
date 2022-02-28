package CS390Assignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Prog2Test {

    @Test
    void minCharacter() {
        Prog2 p2 = new Prog2();

        char calling = p2.minCharacter("akel",0);
        char checking = 'a';

        assertEquals(checking,calling);
    }
}