## 1 Bäume (allgemein): Begriffe und Merkmale

1. a
2. e, e, g,k, i c
3. grad 3
4. d: nivea 1
5. e: 1
6. f: 3
7. g: 4
8. ordnung, kein binär
9. nicht ausgeglichen, höhere differenz zwischen knoten


## 2 Binäre Bäume: Begriffe und Merkmale 

a.) Wie viele Wurzeln hat ein binärer Baum? 1
b.) Was hat ein binärer Baum für eine Ordnung? Ordnung von 2, da max 2 kinder
c.) Wie viele Niveaus benötigt ein binärer Baum im besten Fall für 31 Knoten? 5
Wie berechnet sich dieser Wert? log2 n+1
d.) Wie viele Niveaus ergeben sich im schlechtesten Fall?
Wie berechnet sich dieser Wert? 30
e.) Wie viele Knoten kann ein Binärbaum maximal je für die Niveaus 0 bis 5 enthalten? 1 + 2 + 4 + 8 + 16 + 32 = 63
f.) Können Sie einen binären Baum mit insgesamt fünf Knoten entwerfen, welcher voll ist? voll, letzte ebene von links nach rechts gefüllt
g.) Wie gross ist der Aufwand für die Suche nach einem Element in einem binären Baum im jeweils
Besten und jeweils schlechtesten Fall? Welche Szenarien sind das? bester fall 0(1) o(n)

## 3 Binäre Suchbäume: Suchen, Einfügen und Traversieren

a.) Wir wollen 15 Datenelemente in einen binären Baum einfügen. Wie viele Niveaus benötigen wir
dafür im besten Fall? Welchen Füllgrad hat dieser Baum somit? 15, 4 niveaus
b.) Fügen Sie die folgenden 15 Schlüsselelemente schrittweise und von Hand in einen leeren binären
Baum ein:
H D L B F J N A C E G I K M O
 H
/   \
D     L
/ \   / \
B   F J   N
/ \ / \ / \ / \
A  C E  G I  K M  O
c.) Suchen Sie im Baum von b) nach den folgenden Elementen: N, K und O.
d.) Fügen Sie die folgenden 8 Schlüsselelemente ein einen neuen, leeren binären Baum ein:
G H B F E A D C
e.) Wie sieht ein binärer Baum aus, in welchen die folgenden Elemente eingefügt werden, und
welcher Datenstruktur entspricht er somit?
A B C D E F G H
f.) Sie haben verschiedene Arten wie ein Baum traversiert werden kann kennen gelernt. In welcher
Art müssen Sie binäre Bäume traversieren, damit sie der Sortierung folgen?
g.) Überprüfen Sie ihre Antwort von f), indem Sie die Bäume der Teilaufgaben b), d) und e)
entsprechend traversieren. Formulieren Sie dazu (in Pseudocode) eine Funktion mit einem
rekursiven Algorithmus.
Tipp: Die Funktion nimmt einen Knoten als formalen Parameter entgegen, der initiale Aufruf
bekommt die Wurzel des Baumes als aktuellen Parameter! 

Funktion InOrderTraversal(Knoten)
Wenn Knoten ≠ NULL dann
InOrderTraversal(Knoten.links)
Ausgabe(Knoten.schlüssel)
InOrderTraversal(Knoten.rechts)
Ende wenn
Ende Funktion
