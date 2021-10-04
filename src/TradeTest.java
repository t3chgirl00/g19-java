import static org.junit.jupiter.api.Assertions.*;

class TradeTest {
    Trade t;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        t = new Trade("1", "2", 67);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        t = null;
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        assertEquals("1, 2, 67, 0.0", t.toString());
    }

    @org.junit.jupiter.api.Test
    void setPriceNegative() {
        try {
            t.setPrice(-80);

        } catch (Exception e) {
            assertEquals("W'agyimi dodo, Default price set to 38.0", e.getMessage());
        }



    }
    @org.junit.jupiter.api.Test
    void setPricePositive() {
        t.setPrice(10);
        assertEquals(10,
                t.getPrice());
    }

}