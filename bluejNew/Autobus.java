class Autobus {

    private Person[] sitze;

    public Autobus(int sitze) {
        this.sitze = new Person[sitze];
    }

    // Anforderungen an die Methode:

    // 1) Exception werfen wenn
    // 1a) person is null
    // 2a) person ist bereits im Bus (caller über logikfehler informieren)   
    // 2) die Person auf den ersten freien Sitz setzten und "true" zurückgeben
    // 3) wenn kein Platz mehr frei ist, nix machen und "false" zurückgeben
    public boolean einsteigen(Person person) {
        //1a
        if (person == null) {
            throw new IllegalArgumentException("null sollte nie einsteigen");
        }
        //2a
        if (istDrin(person)/* == true */) {
            throw new IllegalArgumentException("null sollte nie einsteigen"); 
        }
        //2.Schleife um ersten leeren Sitzplatz zu finden
        for (int i = 0; i < sitze.length; i++ ) {
            //wäre hier break; würde es in Zeile 32 weitergehen Außer man würde unten else { continue } einfügen
            //wäre hier ein continue; würde es bei 24 weitergehen
            if (sitze[i] == null) { //Sitz ist also frei
                sitze[i] = person;
                return true;
            } //hier wäre else { continue
            //}
            //hier kein break, sonst nur ein Durchlauf
/*          positve Variante
 *          if (sitze[i] != null) continue;
 *          //sitze[i] ist sicher null wenn ich hier lande
 *          sitze[i] = person;
 *          return true;     
 */
        }

        return false;
    }

    // gibt zurück, ob die Person im Bus ist ( true / false )
    // throws on NULL
    public boolean istDrin(Person person) {
        //Schleifen-Iterator mit Doppelpunkten
        //if (person == null) {
        //    throw new IllegalArgumentException("Du fragst ob null drin ist...?");
        //}
        for (Person p: sitze) {
            if (p == person) {
                return true;
            }
        }
        return false;
    }
    //Aufgabe 
    public boolean istVoll () {
        //Todoo implement
        return false;
        
    }
    public boolean hatPlatz () {
        //Todoo implement
        return false;
        
    }
}
