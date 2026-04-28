package pl.zajecia.dodawanie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DodawanieApplicationTest {

    @Test
    void added() {
        DodawanieApplication application = new DodawanieApplication();
        assertEquals(10, application.added(5, 5));
    }
}