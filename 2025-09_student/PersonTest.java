import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Testklasse für Person.
 */
public class PersonTest {

    private Person mann;
    private Person frau;

    // Wird vor jedem Test neu ausgeführt
    @BeforeEach
    public void setUp() {
        mann = new Person("Tom", 80f, 180, 'm', 2000); // männlich
        frau = new Person("Lisa", 60f, 165, 'f', 2002); // weiblich
    }

    @Test
    public void testBmiBerechnung() {
        // Erwarteter BMI = 80 / (1.8 * 1.8) = 24.69
        assertEquals(24.69f, mann.bmi(), 0.1); // 0.1 = erlaubte Abweichung
    }

    @Test
    public void testGewichtsklasseMannNormal() {
        assertEquals("Normalgewicht", mann.gewichtsklasse());
    }

    @Test
    public void testGewichtsklasseFrauNormal() {
        assertEquals("Normalgewicht", frau.gewichtsklasse());
    }

    @Test
    public void testUngültigerNameMitTryCatch() {
        try {
            new Person("Al", 70f, 170, 'm', 2000); // zu kurzer Name
            fail("Fehler erwartet – Name zu kurz!");
        } catch (IllegalArgumentException e) {
            System.out.println("Fehler abgefangen: " + e.getMessage());
        }
    }
}
