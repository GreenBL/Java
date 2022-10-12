# `Programmazione 12/10/22`

<!--- <p style="color:red">text_field</p> --->
## Array multidimensionali
Gli array multidimensionali sono array di array, che possono avere anche più di due dimensioni.

```java
int arrayRettangolare [][] = new int[4][8];
int array3D[][][] = new int[10][10][5];
// Array 2D
arrayRettangolare [0][0] = 1;
arrayRettangolare [0][1] = 2;
arrayRettangolare [1][0] = 1;

// Array 3D
array3D [3][7][3] = 10;
```

+ Non sono necessariamente rettangolari
+ Le righe possono avere numeri diversi di colonne, per esempio una matrice a forma triangolare
```java
int arrayNonRettangolare [][] = new int[4][]; 
arrayNonRettangolare [0] = new int[2]; 
arrayNonRettangolare [1] = new int[4]; 
arrayNonRettangolare [2] = new int[6]; 
arrayNonRettangolare [3] = new int[8]; 
arrayNonRettangolare [0][0] = 1; 
arrayNonRettangolare [0][1] = 2; 
arrayNonRettangolare [1][0] = 1;
................
arrayNonRettangolare [3][7] = 10;
```
Schema di un array non rettangoalare:
| rows | col0 | col1 | col2 | col3 |
| :-: | :-: | :-: | :-: | :-: |
| 1 | X
| 2 | X | X
| 3 | X | X | X
| 4 | X | X | X | X

#### Sintassi semplificata
```java
int arrayNonRettangolare [][] = {
    {1,2},
    {1,0,0,0},
    {0,0,0,0,0,0},
    {0,0,0,0,0,0,0,10}
};
```
#### Esempio : String args[]
Possiamo passare delle stringhe assieme al nome della classe principale al comando java
+ java HelloCommand `uno` `due` `tre` `quattro`

In questo caso args[0] conterrà "uno", args[1] conterrà "due" e così via...

+ Con le virgolette posso includere gli spazi nelle stringhe degli argomenti

```java
public class HelloCommand {
  public static void main(String args[]){
    for(int i=0; i<args.length; ++i)
    System.out.println(args[i]);
  }
}
```
# Operatori e strutture di controllo
---
### Outline
+ Operatori
+ Espressioni
+ Gestione del flusso di esecuzione
+ Selezione
+ Iterazione

+ Concetti generali
  + Espressioni
  + Operandi
  + Operandi unari e binari
  + Precedenza e associatività

+ Operatori in Java
  + Ereditati in gran parte da C/C++

## Precedenza degli operatori
|  |  | 
|     :-:    |                     :-: |
| separatori | `.` `[]` `{}` `;` `,` |
| da sx a dx | `++` `--` `+` `-` `~` `!` `(tipi di dati)`
| da sx a dx | `*` `/` `%`
| da sx a dx | `+` `-`
| da sx a dx | `<<` `>>` `>>>`
| da sx a dx | `<` `>` `<=` `>=` `instanceof`
| da sx a dx | `==` `!=`
| da sx a dx | `&`
| da sx a dx | `^`
| da sx a dx | `|`
| da sx a dx | `&&`
| da sx a dx | `||`
| da dx a sx | `?:`
| da dx a sx | `=` `*=` `/=` `%=` `+=` `-=` `<<=` `>>=` ...

### Valutazione di espressioni complesse
+ Ordine di valutazione
  + Precedenza e associatività
+ Tipo delle sottoespressioni
+ Tipo del valore risultante

### Operatori di base
+ Operatore di assegnazione `=`
  + Valore di ritorno : Il valore assegnato (a sx)

+ Operatori aritmetici
+ Operatori composti

### Operatori di pre/post incremento/decremento
+ Funzionano come in C

| Descrizione | Operatore | Esempio |
| :-: | :-: | :-: | 
| Pre-incremento di un'unità | `++` | ++i 
| Pre-decremento di un'unità | `--` | --i
| Post-incremento di un'unità | `++` | i++
| Post-decremento di un'unità | `--` | i--
```java
i = i + 1;
i += 1;
++i; i++;
```
Nota bene : Se usati dentro un espressione hanno un comportamento diverso, se pre-incrementrato, viene prima aumentato il valore e poi utilizzato nell'espressione, altrimenti se post-incrementato, verrà utilizzato il valore senza incremento nell'espressione e verrà successivamente incrementato a operazione conclusa. Per il decremento funziona allo stesso modo. Questo è esattamente ciò che accade in C.

### Operatori bitwise (bit a bit)\

| Descrizione | Operatore
| :- | :-:
| NOT | `~`
| AND| `&`
| OR| `|`
| XOR| `^`
| Shift a sinistra| `<<`
| Shift a destra| `>>`
| Shift a destra unsigned| `>>>`
| AND e assegnazione| `&=`
| OR e assegnazione | `|=`
| XOR e assegnazione| `^=`
| Shift a sinistra e assegnazione| `<<=`
| Shift a destra e assegnazione| `>>=`
| Shift a destra senza segno e assegnazione| `>>>=`
+ Esempio di un AND bitwise
```javascript
0001 & 0000 = 0000
```

### Operatori relazionali
| Operatore | Simbolo | Applicabilità |
| :- | :-: | :- | 
| Uguale a | `==` | Tutti i tipi
| Diverso da | `!=` | Tutti i tipi
| Maggiore | `>` | Solo i tipi numerici
| Minore | `<` | Solo i tipi numerici
| Maggiore o uguale | `>=` | Solo i tipi numerici
| Minore o uguale | `<=` | Solo i tipi numerici
+ Questi operatori usati in un'espressione ritornano un boolean

### Confronto tra oggetti

+ Vengono confrontati i valori dei reference 
  + `Uguale` se puntano allo STESSO OGGETTO e non a un oggetto avente gli STESSI VALORI delle variabili d'istanza

```java
Quadrato q1, q2;
q1 = new Quadrato(5);
q2 = new Quadrato(5);
if(q1 == q2){
    . . .
}
```
In breve così confronta gli indirizzi, non i valori
+ Esiste un metodo per confrontare i VALORI di due oggetti
```java
if (q1.equals(q2)){
    . . .
}
```
+ Le String a volte fanno eccezione

### Confronto tra String
+ Due modi di creare una String:
```java
// 1
String s = "abcd";
// 2
String s = new String("abcd);
```
Quelle String create con la sintassi semplificata vengono memorizzate in un `"pool di String"` nella JVM
+ Le string di questo tipo che hanno lo stesso contenuto allora avranno anche lo stesso indirizzo e quindi risulteranno uguali all'operatore `==`

In ogni caso il metodo corretto di confrontare String è il metodo `equals` nella classe
```java
s1.equals(s2); // è true se il contenuto di s1 ed s2 è uguale
```
##### Esempio
```java
String a = "Java";
String b = "Java";
String c = new String("Java");
System.out.println(a==b);
System.out.println(b==c);
System.out.println(a.equals(b));
System.out.println(b.equals(c));
```
###### Output:
```bash
true
false
true
true
```

### Operatori logici

| Descrizione | Operatore |
| :- | :-: | :- | 
| NOT logico | `!` | 
| AND logico | `&` | 
| OR logico | `|` | 
| Short circuit AND | `&&` | 
| Short circuit OR | `||` | 
| AND e assegnazione | `&=` | 
| OR e assegnazione | `|=`
| XOR e assegnazione | `^=`
+ Questi operatori usati in un'espressione ritornano un boolean

+ Si usano di più gli operatori di corto circuito
```java
if([espressione] && [espressione]) // -> false alla prima espressione
// non viene eseguita la seconda espressione
```
### Concatenazione di String
+ Operatore `+`
```java
String nome = "James ";
String cognome = "Gosling";
String nomeCompleto = "Mr. " + nome + cognome;
```
+ Se concateniamo col `+` un qualsiasi tipo di dato, ad esempio numerico, con una stringa, il tipo di dato sarà automaticamente convertito in stringa
```java
int b = 5;
String s = "il doppio di b è " + b*2;
```
Es:

```java
int a = 5;
int b = 10;
System.out.println("La somma è " + a + b); // errato
System.out.println("La somma è " + (a+b));
```
```bash
Output:
La somma è 510 
La somma è 15
```

### Operatore ternario
```java
(espressione booleana) ? espressione1 : espressione2;
```
+ Il tipo di ritorno sarà quello di espressione1 o espressione2 (non necessariamente uguali)
+ Non sostituisce __if__ ma a volte semplifica il codice
Per esempio:
```java
int massimo = a > b ? a : b;

String query = "select * from table " +
               (condition != null ? "where " + condition : "";);
```
In breve:

L'espressione booleana è vera? Se si prima espressione, altrimenti seconda espressione.

  





