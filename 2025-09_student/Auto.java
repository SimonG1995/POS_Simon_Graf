/**
 * Die Klasse Auto enthält bis zu 3 Personen und kann das Gesamtgewicht berechnen.
 */
public class Auto {
    private String name;          // Name des Autos (z. B. "VW")
    private int eigengewicht;     // Gewicht des Autos selbst
    private Person fahrer;        // Fahrer
    private Person beifahrer;     // Beifahrer
    private Person rueckbank;     // Person hinten

    // ===========================
    // Konstruktor
    // ===========================
    public Auto(String name, int eigengewicht) {
        this.name = name;
        this.eigengewicht = eigengewicht;
    }

    // ===========================
    // Person einsteigen lassen
    // ===========================
    public void einsteigen(Person person) {
        if (person == null) {
            System.out.println("Fehler: Person ist null!");
            return;
        }

        if (fahrer == null) {
            fahrer = person;
        } else if (beifahrer == null) {
            beifahrer = person;
        } else if (rueckbank == null) {
            rueckbank = person;
        } else {
            System.out.println("Auto ist voll!");
        }
    }

    // ===========================
    // Personen aussteigen lassen
    // ===========================
    public void aussteigen(Person person) {
        if (person == null) {
            System.out.println("Fehler: Person ist null!");
            return;
        }

        if (fahrer == person) fahrer = null;
        else if (beifahrer == person) beifahrer = null;
        else if (rueckbank == person) rueckbank = null;
        else System.out.println("Fehler: Person war nicht im Auto!");
    }

    // ===========================
    // Gesamtgewicht berechnen
    // ===========================
    public float gesamtGewicht() {
        float gesamt = eigengewicht;
        if (fahrer != null) gesamt += fahrer.getKg();
        if (beifahrer != null) gesamt += beifahrer.getKg();
        if (rueckbank != null) gesamt += rueckbank.getKg();
        return gesamt;
    }

    // ===========================
    // Alle Informationen ausgeben
    // ===========================
    public void printAuto() {
        System.out.println("Auto: " + name + " (" + eigengewicht + " kg)");
        System.out.println("Fahrer: " + (fahrer != null ? fahrer.printPerson() : "frei"));
        System.out.println("Beifahrer: " + (beifahrer != null ? beifahrer.printPerson() : "frei"));
        System.out.println("Rueckbank: " + (rueckbank != null ? rueckbank.printPerson() : "frei"));
        System.out.println("Gesamtgewicht: " + gesamtGewicht() + " kg");
        System.out.println("---------------------------------------");
    }

    // Getter (werden für Tests verwendet)
    public Person getFahrer() { return fahrer; }
    public Person getBeifahrer() { return beifahrer; }
    public Person getRueckbank() { return rueckbank; }
}
