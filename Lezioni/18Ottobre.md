# `Programmazione 18/10/22`
<!--- <p style="color:crimson">text_field</p> --->
## <p style="color:crimson">Strutture di gestione del flusso di esecuzione </p>
+ Condizioni (strutture di selezione)
+ Cicli (strutture di iterazione)
+ Sequenza (comportamento standard)

Tutti i costrutti possono essere annidati quanto si vuole.

## Costrutti semplici
+ `if` e `if else`
+ `while`

Con if e while è possibile implementare qualsiasi struttura di controllo.

### Costrutti `if` e `if else`
```java
if(espressione-booleana) istruzione;
```

```java
if (numeroLati == 3);
    System.out.println("Questo è un triangolo");
```

```java
if (espressione-booleana) istruzione-1;
else istruzione-2;
```

```java
if (numeroLati == 3)
    System.out.println("Questo è un triangolo");
else
    System.out.println("Questo non è un triangolo");
```

#### Costrutto if else if a cascata
```java
if(espr-booleana-1)
    istruzione-1
else { if(espr-booleana-2)
    istruzione-2
...

else { if(espr-booleana-n)
    istruzione-n
else {
    istruzione-default
}
}
}
```
La prima che viene trovata vera esegue l'istruzione, tutto il resto viene skippato
```java
if(a == 1){
    a = 2;
} else {
    if(a == 2){
        a = 3;
    }
    else {
        if(a == 3){
            a = 4;
        }
        else {
            a = 5;
        }
    }
}
```
### Costrutto `while`
```java
while(espressionebooleana) istruzione;
```
In generale è anche presente inizializzazione e aggiornamento
```java
[inizializzazione;]
while (espr-bool) {
    istruzione;
    [aggiornamento iterazione;]
}
```

```java
es da agg
```
## <p style="color:cyan">Costrutti avanzati</p>
### Costrutto `for`
```java
for (inizializzazione; espr-bool; incremento/decremento)
    istruzione;
```

```java
public class ForDemo {
    public static void main(String args[]) {
        for (int n = 10; n > 0; n--){
            System.out.println(n);
        } 
    }
}
```
La variabile `n` ha "scope di ciclo for", cioè appena finisce viene cancellata
+ Inizializzazione, espressione e aggiornamento sono tutte e tre opzionali, per esempio `for(;;)` risulta in un ciclo infinito

L'inizializzazione può riferirsi a più variabili (purchè siano dello stesso tipo) usando la virgola come separatore.

L'aggiornamento può esere una qualsiasi sequenza di istruzioni (o chiamate a metodi) separate dalla virgola

```java
for (int i = 0, j = 10; i < 5 || j > 5; i++, j--, System.out.println("aggiornamento")) 
{ ...
}
```

### Costrutto `do while`
```java
do {
    istruzione;
} while (espr-bool);
```
L'istruzione viene eseguita almeno una volta

## Costrutto `for migliorato`
Il for migliorato permette automaticamente di ciclare attraverso una collezione di dati
```java
for(variabile_temporanea : oggetto_iterabile){
    istruzione;
}
```
```java
int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
for (int tmp : arr) {
    System.out.println(tmp);
}
```
La variabile temporanea è una `copia` dell'elemento dell'array che quindi non potrà essere modificato tramite questo costrutto, ma con array di oggetti si perchè crea una copia dell'indirizzo, e da quella copia del riferimento è possibile modificare l'oggetto nell'iterabile.
```java
Object[] arr = {new Object(), new Object(), new Object()};

for(Object tempObj : arr){
    tempObj.x = 0; // tempObj è una copia del riferimento
}
```
Inoltre, un modo per cambiare i valori di un array è quello di crearne uno nuovo, cambiando l'oggetto del riferimento originale.

### Costrutto `switch`
```java
switch (variabile di test) {
     case valore_1:
        istruzione;
        break;
    case valore_2:
        istruzione;
        break;
    case valore_3: 
    case valore_4:
        istruzione;
        break;
        ... 
        default:
            istruzione_default;
}
```
La variabile di test deve essere o di tipo `String`, o di un tipo di dato compatibile con un intero, tranne i long.

I valori devono essere tutti diversi e devono essere espressioni costanti e diverse tra loro

`ATTENZIONE AL BREAK DOPO IL CASE`

Buona prassi mettere sempre il caso default

### Istruzioni `break` e `continue`
+ `break` termina l'intero ciclo
+ `continue` salta l'iterazione corrente

### <p style="color:cyan">Labels con `break` e `continue`</p>
break e continue possono utilizzare **label** per specificare su quale ciclo devono essere applicati. La label è posizionata prima di un blocco che di solito è un ciclo o contiene un ciclo.

```java
int j = 1;
pippo: //possiamo dare un qualsiasi nome ad una label 
while (true){
    while (true){
        if (j > 10) 
            break pippo;
            System.out.println(j);
            j++;
    } 
}
```
Senza l'etichetta `pippo` il break avrebbe interrotto il ciclo più interno (lo scope dove si trova il break)

Meglio lanciare un'eccezione per gestire problemi in runtime e non questo.
