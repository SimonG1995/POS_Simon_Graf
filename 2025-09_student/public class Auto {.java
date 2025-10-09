public class Auto {
  private String name;
  private int eigengewicht;
  private Person fahrer;
  private Person beifahrer;
  private Person rueckbank;
  public Auto() {
  setName("n/a");
  setEigengewicht(1300);
  }
  public Auto(String name, int eigengewicht) {
  setName(this.name);
  setEigengewicht(this.eigengewicht);
  }
  public String getName() {
  return name;
  }
  public int getEigengewicht() {
  return eigengewicht;
  }
  public void setName(String name) {
  if (name != null) {
  this.name = name;
  } else {
  System.out.println("Fehler: kein Name!");
  this.name = "n/a";
  }
  }
  public void setEigengewicht(int eigengewicht) {
  if ((eigengewicht >= 600) && (eigengewicht <= 3000)) {
  this.eigengewicht = eigengewicht;
  } else {
  System.out.println("Fehler: kein gültiges Eigengewicht (600..3000)!");
  this.eigengewicht = 1300;
  }
  }

   public void einsteigen(Person person) {
  // 1. Pruefung ob Referenz person nicht null
  if (person != null) {
  if (this.fahrer == null) {
  this.fahrer = person; // this kann man hier weglassen
  } else {
  if (this.beifahrer == null) {
  this.beifahrer = person;
  } else {
  if (this.rueckbank == null) {
  this.rueckbank = person;
  } else {
  System.out.println("Fehler: das Auto ist voll!");
  }
  }
  }
  } else { // entsprechende Fehlermeldung
  System.out.println("Fehler: Parameter person ist null!");
  }
  }
  public void aussteigenFahrer() {
  fahrer = null;
  }
  public void aussteigenBeifahrer() {
  beifahrer = null;
  }
  public void aussteigenRueckbank() {
  rueckbank = null;
  }
  public void aussteigen(Person person) {
  if (person != null) {
  if (this.fahrer == person) {
  aussteigenFahrer();
  } else {
  if (this.beifahrer == person) {
  aussteigenBeifahrer();
  } else {
  if (this.rueckbank == person) {
  aussteigenRueckbank();
  } else {
  System.out.println("Fehler: Person nicht im Auto.");
  }
  }
  }
  } else {
  System.out.println("Fehler: Parameter person ist null.");
  }
  }
  public void aussteigen(String name) {
  if (name != null) {
  // Achtung: String-Vergleich immer mit der equals-Methode!

  (this.fahrer != null && name.equals(fahrer.getName())) {
  aussteigenFahrer();
  } else {
  if (this.beifahrer != null && name.equals(beifahrer.getName())) {
  aussteigenBeifahrer();
  } else {
  if (this.rueckbank != null && name.equals(rueckbank.getName())) {
  aussteigenRueckbank();
  } else {
  System.out.println("Fehler: Person nicht im Fahrzeug");
  }
  }
  }
  } else {
  System.out.println("Fehler: name ist null.");
  }
  }
  public int gesamtGewicht() {
  int gesamtGewicht = getEigengewicht();
  if (this.fahrer != null) {
  gesamtGewicht = gesamtGewicht + this.fahrer.getGewicht();
  }
  if (this.beifahrer != null) {
  gesamtGewicht = gesamtGewicht + this.beifahrer.getGewicht();
  }
  if (this.rueckbank != null) {
  gesamtGewicht = gesamtGewicht + this.rueckbank.getGewicht();
  }
  return gesamtGewicht;
  }
  public void printAuto() {
  System.out.println("Auto: " + name + ", Eigengewicht: " + eigengewicht);
  System.out.println("--------------------------------------------------------");
  System.out.print("Fahrer: ");
  if (this.fahrer != null) {
  this.fahrer.print();
  } else {
  System.out.println(" --frei-- ");
  }
  System.out.print("Beifahrer: ");
  if (this.beifahrer != null) {
  this.beifahrer.print();
  } else {
  System.out.println(" --frei--");
  }
  System.out.print("Rueckbank: ");
  if (this.rueckbank != null) {
  this.rueckbank.print();
  } else {

   System.out.println(" --frei--");
  }
  System.out.println("--------------------------------------------------------");
  }
}