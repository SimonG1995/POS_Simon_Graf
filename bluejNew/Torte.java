public class Torte {
    public static void zeichne(int n) {
        for (int zeile = 0; zeile < n ; zeile++){
            for(int spalte = 0; spalte < ((n * 2) + 1); spalte++) {
                if (spalte + zeile == n-1) {
                    System.out.print("[");
                    continue;
                }
               
                if (spalte - zeile == n+1) {
                    System.out.print("]");
                    continue;
                }
                
                if ((spalte + zeile >= n) & (spalte - zeile <= n)) {
                //(spalte - zeile == n || spalte + zeile == n) {
                    System.out.print("*");
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
/* Übung: Zeichnen einer Hochzeitstorte

beispiel n == 6 (6 Ebenen)

```code
     [*]
    [***]
   [*****]
  [*******]
 [*********]
[***********]
```
*/