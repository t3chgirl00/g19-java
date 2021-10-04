import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TraderTest {
    Trader testTrader;
    Account testAccount;
    Trade testTrade;

    @BeforeEach
    void setUp() {
        testAccount = new Account(33);
        testTrader = new Trader("Romeo", testAccount);
        testTrade = new Trade("TCL4", "AAPL", 3);
    }

    @AfterEach
    void tearDown() {
        testAccount = null;
        testTrader = null;
    }

    @Test
    void testToString() {
        assertEquals("Romeo "+ testAccount.toString(), testTrader.toString());
    }

    @Test
    void addTrade() {
        testTrader.addTrade(testTrade);
        assertEquals("Romeo "+ "33.0", testTrader.toString());
    }
}