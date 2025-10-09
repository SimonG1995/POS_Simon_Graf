import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Testklasse für Auto – überprüft einsteigen, aussteigen und Gewicht.
 */
public class AutoTest {

    private Auto auto;
    private Person p1, p2, p3, p4;

    // ===========================
    // Setup vor jedem Test
    // ===========================
    @BeforeEach
    public void setUp() {
        auto = new Auto("BMW", 1500);
        p1 = new Person("Tom", 80f, 180, 'm', 2000);
        p2 = new Person("Lisa", 60f, 170, 'f', 2002);
        p3 = new Person("Ben", 90f, 175, 'm', 1998);
        p4 = new Person("Anna", 70f, 165, 'f', 2001);
    }

    // ===========================
    // Test 1: Einsteigen funktioniert
    // ===========================
    @Test
    public void testEinsteigen() {
        auto.einsteigen(p1);
        auto.einsteigen(p2);
        assertEquals(p1, auto.getFahrer());
        assertEquals(p2, auto.getBeifahrer());
    }

    // ===========================
    // Test 2: Auto ist voll
    // ===========================
    @Test
    public void testAutoVoll() {
        auto.einsteigen(p1);
        auto.einsteigen(p2);
        auto.einsteigen(p3);
        auto.einsteigen(p4); // zu viel!
        assertEquals(3, countInsassen()); // es dürfen nur 3 drin sein
    }

    // ===========================
    // Test 3: Aussteigen funktioniert
    // ===========================
    @Test
    public void testAussteigen() {
        auto.einsteigen(p1);
        auto.einsteigen(p2);
        auto.aussteigen(p1);
        assertNull(auto.getFahrer()); // Fahrerplatz sollte leer sein
    }

    // ===========================
    // Test 4: Gesamtgewicht prüfen
    // ===========================
    @Test
    public void testGesamtGewicht() {
        auto.einsteigen(p1);
        auto.einsteigen(p2);
        assertEquals(1640f, auto.gesamtGewicht(), 0.1);
    }

    // ===========================
    // Hilfsmethode: Zählt besetzte Sitze
    // ===========================
    private int countInsassen() {
        int count = 0;
        if (auto.getFahrer() != null) count++;
        if (auto.getBeifahrer() != null) count++;
        if (auto.getRueckbank() != null) count++;
        return count;
    }
}
