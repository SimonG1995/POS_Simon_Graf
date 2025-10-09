import java.util.Calendar; // Für das aktuelle Jahr, um das Alter zu berechnen

/**
 * Die Klasse Person speichert Daten über eine Person und kann deren BMI berechnen.
 */
public class Person {

    // ===========================
    // Attribute (Eigenschaften)
    // ===========================
    private String name;     // Name der Person
    private float kg;        // Gewicht in Kilogramm
    private int cm;          // Größe in Zentimetern
    private char gender;     // Geschlecht ('m' oder 'f')
    private int geburtsjahr; // Jahr der Geburt
    private int alter;       // Alter, berechnet aus Geburtsjahr

    // ===========================
    // Konstruktoren
    // ===========================

    /**
     * Konstruktor mit allen Parametern.
     */
    public Person(String name, float kg, int cm, char gender, int geburtsjahr) {
        setName(name);               // setzt den Namen mit Prüfung
        setKg(kg);                   // setzt das Gewicht mit Prüfung
        setCm(cm);                   // setzt die Größe mit Prüfung
        setGender(gender);           // setzt das Geschlecht mit Prüfung
        setGeburtsjahr(geburtsjahr); // berechnet auch das Alter
    }

    // ===========================
    // Setter-Methoden (ändern Werte)
    // ===========================

    public void setGeburtsjahr(int geburtsjahr) {
        this.geburtsjahr = geburtsjahr;
        this.alter = Calendar.getInstance().get(Calendar.YEAR) - geburtsjahr; // berechnet Alter
    }

    public void setName(String name) {
        if (name.length() < 3 || name.length() > 50) {
            throw new IllegalArgumentException("Name muss 3-50 Buchstaben haben");
        }
        this.name = name;
    }

    public void setKg(float kg) {
        if (kg < 2 || kg > 635) {
            throw new IllegalArgumentException("Ungültiges Gewicht!");
        }
        this.kg = kg;
    }

    public void setCm(int cm) {
        if (cm < 50 || cm > 250) {
            throw new IllegalArgumentException("Ungültige Körpergröße!");
        }
        this.cm = cm;
    }

    public void setGender(char gender) {
        gender = Character.toLowerCase(gender);
        if (gender != 'm' && gender != 'f') {
            throw new IllegalArgumentException("Ungültiges Geschlecht!");
        }
        this.gender = gender;
    }

    // ===========================
    // Getter-Methoden (lesen Werte)
    // ===========================

    public int getAlter() { return this.alter; }
    public String getName() { return this.name; }
    public float getKg() { return this.kg; }
    public int getCm() { return this.cm; }
    public char getGender() { return this.gender; }

    // ===========================
    // BMI-Berechnung
    // ===========================
    public float bmi() {
        float meter = this.cm / 100.0f;     // Zentimeter in Meter umrechnen
        return this.kg / (meter * meter);   // BMI = Gewicht / (Größe²)
    }

    // ===========================
    // Geschlecht als Text
    // ===========================
    public String mannOderFrau() {
        if (this.gender == 'm') return "männlich";
        if (this.gender == 'f') return "weiblich";
        return "unbekannt";
    }

    // ===========================
    // Gewichtsklasse anhand BMI
    // ===========================
    public String gewichtsklasse() {
        float bmi = this.bmi(); // BMI berechnen
        if (this.gender == 'm') {
            if (bmi < 20f) return "Untergewicht";
            else if (bmi <= 25f) return "Normalgewicht";
            else return "Übergewicht";
        } else { // weiblich
            if (bmi < 19f) return "Untergewicht";
            else if (bmi <= 24f) return "Normalgewicht";
            else return "Übergewicht";
        }
    }

    // ===========================
    // Alle Daten als Text zurückgeben
    // ===========================
    public String printPerson() {
        return "Name: " + this.name + " (" + mannOderFrau() + "), "
                + this.kg + "kg, " + this.cm + "cm, "
                + this.alter + " Jahre, " + this.gewichtsklasse();
    }
}
