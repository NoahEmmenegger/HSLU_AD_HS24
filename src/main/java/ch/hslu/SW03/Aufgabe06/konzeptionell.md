Die bisherige Lösung dieser Aufgabe setzt perfekte Hashwerte voraus. Das können wir aber nicht
immer erfüllen. Wie sähe eine Lösung aus, welche auch mit Hashwertkollisionen umgehen kann?
Es reicht vorerst eine konzeptionelle Lösung, Sie dürfen es aber auch ausprobieren

## Konzeptionelle Lösung

Eine Möglichkeit wäre, dass wir in der Hash-Tabelle nicht nur einen Wert speichern, sondern eine Liste von Werten.