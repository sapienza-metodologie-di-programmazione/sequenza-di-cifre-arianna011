# L.3.24 Sequenza Di Cifre

Progettare una classe **SequenzaDiCifre** che rappresenta una sequenza di cifre (considerate caratteri) inizialmente vuota, rappresentata mediante un array. 



La classe espone un metodo *aggiungiCifre(s, N)* che:
- prende in input una stringa *s* e un intero *N*;
- aggiunge alla sequenza le prime *N* cifre contenute nella stringa *s*. Attenzione:
    - se la stringa contiene meno di *N* cifre, aggiungere tutte le cifre della stringa 
    - se *N* è un numero negativo, sollevare un'eccezione *IllegalArgumentException* passandole in input il numero *N*

La classe ridefinisce anche il metodo *toString()*, che fornisce una rappresentazione sotto forma di stringa della
sequenza (rappresentare gli elementi della sequenza tra parentesi quadre, separati da virgole e senza spazi).

### Esempi

```
SequenzaDiCifre s = new SequenzaDiCifre();
s.aggiungiCifre("abc1--23", 2);
s.aggiungiCifre("xx0a8b76543100", 4);
System.out.println(s.toString());
```

Stampa: ``[1,2,0,8,7,6]``

```
SequenzaDiCifre s = new SequenzaDiCifre();
s.aggiungiCifre("abc", 2);
s.aggiungiCifre("xks3vv2", 4);
System.out.println(s.toString());
```

Stampa: ``[3,2]``

```
SequenzaDiCifre s = new SequenzaDiCifre();
s.aggiungiCifre("abc", -2);
```

Solleva: ``IllegalArgumentException: -2``

