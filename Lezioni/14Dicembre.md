# `Programmazione 14/12/22`

<!--
# <p style="color:OrangeRed">title_big</p>
## <p style="color:SpringGreen">(new)title</p> --->

# <text style=color:red> Generics
## Outline
+ Tipi parametro
+ Generics e Collections
+ Ereditarieta' e Generics
+ Metodi che ricevono argomenti con generics
+ Wildcard
+ Creare propri tipi generics
+ Metodi con argomenti generics
+ Parametri covarianti

## Tipi parametro
I tipi parametro sono stati introdotti in Java 5, e implementano la programmazione generica. E' una alternativa a casting e overload, e permettono di creare classi o interfacce parametrizzate in base al tipo.

```java
class identificatoreDellaClasse <T1, T2, ... Tn> {
    // . . .
}
```

In questo modo verranno create tante versioni della classe in base ai valori di __T1, T2, ... Tn__ che useremo nel programma.
Si potrebbe definire come un overload "automatico", e ne vediamo esempio nella classe ArrayList che usa i generics.

_Esempio contenitore_
```java
// Contenitore di un oggetto qualsiasi
public class Contenitore {
    private Object object;
    public void setObject(Object object) {
        this.object = object;
    }
    public Object getObject() {
        return object;
    }
}
```
+ Ma in questo modo, l'oggetto restituito dal metodo getObject() ha bisogno di un cast per poter essere utilizzato:
```java
Contenitore contenitore = new Contenitore();
contenitore.setObject("Stringa");
// contenitore.setObject(new Integer(1));
String s = (String)contenitore.getObject();
System.out.println();
```
+ Se decommento la linea 3, il codice compila ma non funziona per causa dell'eccezione _ClassCastException_: __type unsafe__

_Esempio contenitore generico_
```java
public class ContenitoreGenerics<T> {
    private T object;
    public void setObject(T object) {
        this.object = object;
    }
    public T getObject() {
        return object;
    }
}
```
```java
ContenitoreGenerics<String> contenitore = new ContenitoreGenerics<String>();
contenitore.setObject("Stringa");
// contenitore.setObject(new Integer(1));
String s = contenitore.getObject();
System.out.println();
```
+ Se decommento la linea 3 non compila: __type safe__

## Generics e Collection
Il framework _Collection_ a partire da Java 5 usa i generics. Ad esempio List e' definita come:
```java
public interface List<E> extends Collection<E> { . . . }
```
+   L'interfaccia _List< E >_ e' implementata nella classe _ArrayList< E >_
    +   ```java sfuso
        List<Shape> lista = new ArrayList<Shape>();
        lista.add(new Shape());
        ```
    +   All'interno di _List< E >_ e' definito il metodo
    +   ```java
        public boolean add(E obj);
        ```
    Per _List< Shape >_ il parametro E diventa Shape e quindi il metodo _add_ accetta solo _Shape_.

Se non viene specificato il parametro si intende _Object_
+   Necessita' di fare cast (type unsafe)

### Esempi

#### _List di String senza generics_
```java
List list = new ArrayList();
// . . .
int size = list.size();
for (int i = 0; i < size; i++) {
    Stringa stringa = (String)list.get(i);
}
```
Senza il cast avrei avuto un errore di compilazione, e per sicurezza dovremmo anche controllare il tipo prima della _add()_:
```java
if (input instanceof String) { 
    list.add(input);
}
```
#### _List di String con generics_
```java
List<String> strings = new ArrayList<String>();
// Da Java 7 in poi
List<String> strings = new ArrayList<>();
```
```java
List<String> strings = new ArrayList<>();
strings.add("e' possibile aggiungere String");
strings.add(new Date()); // ERRORE DI COMPILAZIONE
String str = strings.get(0); // NO CAST!
```

## Uso di primitivi
I generics non si possono applicare ai tipi di dato primitivi
```java
List<int> ints = new ArrayList<int>();
```
<text style=color:red>↑ Errore di compilazione ↑ </text>

Possiamo pero' fare una lista del corrispondente tipo wrapper _Integer_ e sfruttare autoboxing-autounboxing:
```java
List<Integer> ints = new ArrayList<Integer>;
ints.add(1);
int intero = ints.get(0);
```

<text style=color:lightgreen>↑ Compila perfettamente ↑</text>

## Interfaccia Iterator
```java
interface Iterator<T> { . . .}
```
Permette di iterare fra gli elementi di una collezione, ed e' un interfaccia parametrizzata in base al tipo dell'elemento della collezione. Il metodo _iterator_() di <text style=color:turquoise> _List_ </text> restituisce una implementazione concreta:

```java
List<String> strings = new ArrayList<String>();
strings.add("Autoboxing & Auto-Unboxing");
strings.add("Generics");
strings.add("Static imports");
// . . .
Iterator<String> i = strings.iterator();
while (i.hasNext()) {
    String string = i.next();
    System.out.println(string);
}
```
Iterator ha due metodi utili da implementare, _hasNext()_ e _next()_. Cio' consente di iterare qualsiasi lista poiche' con il metodo _hasNext()_ possiamo verificare la presenza del prossimo indice.

## Interfaccia Map
```java
interface Map<K,V> { . . .}
```
Map e' un interfaccia di collezione che associa chiavi ai suoi elementi, ogni chiave e' associata a un valore e non ci possono naturalmente essere chiavi duplicate.
```java
Map<Integer, String> map = new HashMap<Integer, String>();
map.put(0, "generics");
map.put(1, "metadata");
map.put(2, "enums");
map.put(3, "varargs");
for (int i = 0; i < 4; i++) {
    System.out.println(map.get(i));
}
```
HashMap<K,V> implementa Map<K,V>.

## Generics innestati
_Esempi_:
Lista di liste di Integer, mappa di liste di String:
```java
ArrayList<ArrayList<Integer>> m = new ArrayList<>();

Map<Integer, ArrayList<String>> map = new HashMap<Integer, ArrayList<String>>();
```
+ Per accedere a un elemento...
```java
int i = m.get(2).get(3);

String s = map.get(chiave).get(i);
```

## Deduzione automatica del tipo
Nuova sintassi introdotta in Java 7, elimina la ridondanza quando si crea un'istanza di un tipo generico:
```java
//pre-java 7
ArrayList<String> arrayList = new ArrayList<String>();
```
```java
//post-java 7
ArrayList<String> arrayList = new ArrayList<>();
```
E' utile nei casi piu' complessi:
```java
Map<String, Set<String>> hashMap = new HashMap<String, Set<String>>();
. . .
Map<String, Set<String>> hashMap = new HashMap<>();
```
## Ereditarietà e generics
I tipi con generics formano gerarchie come gli altri e valgono le stesse regole del polimorfismo fra classi e interfacce.

Ad esempio, con un reference a $List<Integer>$ posso riferirmi ad $ArrayList<Integer>$:
```java
ArrayList<Integer> arrayList = new ArrayList<Integer>();
List<Integer> list = arrayList; // ok!
```
Ma non posso avere gerarchia basate su gerarchie dei tipi parametro:
Con un reference ad $ArrayList<Number>$ non posso riferirmi ad $ArrayList<Integer>$:
```java
ArrayList<Number> list = new ArrayList<Intger>(); // ERRORE: TYPE UNSAFE
```
### Type erasure
A runtime i tipi parametro non esistono piu', per mantenere la compatibilita' con versioni precedenti a Java 5 il compilatore processa i generics e li traduce in codice senza generics (type erasure) e quindi compilato. Non potendo fare controlli a tempo di esecuzione tutte le operazioni potenzialmente pericolose non sono consentite.

## Metodi che ricevono parametri generics
La cancellazione dei tipo ha alcune conseguenze. Ad esempio se vogliamo passare a un metodo degli ArrayList di tipo diverso:
```java
public void print(ArrayList al) {
    Iterator i = al.iterator();
    while (i.hasNext()) {
        Object o = i.next();
        System.out.println(o);
    }
}
```
↑ A questo metodo posso passare ArrayList di tipo diverso... compila ma potrebbe dare dei warnings, e per eliminarli possiamo usare i generics e specificare Object in ArrayList e Iterator:
```java
public void print(ArrayList<Object> al) {
    Iterator<Object> i = al.iterator();
    while (i.hasNext()) {
        Object o = i.next();
        System.out.println(o);
    }
}
```
Questo metodo compila senza warning, ma purtroppo accettera' solamente $ArrayList<Object>$.

In base a quanto detto prima non potro' passare ad esempio un $ArrayList<String>$, ma adesso vediamo cosa succede con le wildcards.

## Wildcards
Si puo' usare il carattere jolly `?` per indicare qualsiasi tipo parametro:
```java
public void print(ArrayList<?> al) {
    Iterator<?> i = al.iterator();
    while (i.hasNext()) {
        Object o = i.next();
        System.out.println(o);
    }
}
```
↑ Questa versione del metodo non causa nessun warning e accetta qualsiasi tipo di ArrayList in input.

Ma poiche' il compilatore non puo' fare controlli di validita' __non sono ammesse modifiche all'ArrayList__.

Quindi passandolo in questo modo possiamo solo leggere e non scrivere, l'ArrayList diventa di __sola lettura__.

## Wildcard upper bounded
Possiamo limitare superiormente anche una wildcard definita in un metodo ad essere sottoclasse di una certa classe
```java
public void print(ArrayList<? extends Number> list) {
    for (Iterator<? extends Number> i = list.iterator(); i.hasNext(); ) {
            System.out.println(i.next());
    }
}
```
↑ Questo metodo accettera' come argomento una List di un qualsiasi tipo che __estende Number__
Ma non possiamo comunque modificare la list come gia visto per le wildcard unbounded.

## Wildcard lower bounded
```java
public void riempiLista(List<? super Integer> list) {
    int size = list.size();
    for (int i = 1; i <= size; i++) {
        list.add(i);
    }
    System.out.println(list);
}
```
Il metodo permette di riempire e stampare una lista Integer, Number o Object (le superclassi di Integer):
__Con le wildcard lower bounded possiamo modificare la List__
Possiamo aggiungere un oggetto del tipo lower bound o una sua qualsiasi sottoclasse.

## Creare propri tipi con generics
```java
public class OwnGeneric<E> {
    private List<E> list;
    public OwnGeneric () {
        list = new ArrayList<E>();
    }
    public void add(E e) {
        list.add(e);
    }
    public void remove(int i) {
        list.remove(i);
    }
    public E get(int i) {
        return list.get(i);
    }
    public int size() {
        return list.size();
    }
    public boolean isEmpty() {
        return list.size() == 0;
    }
}
```
## Usare propri tipi con generics
```java
OwnGeneric<String> own = new OwnGeneric<String>();
for (int i = 0; i < 10; ++i) {
    own.add(""+ (i));
}
System.out.println(own);
```

## Metodi generici
I metodi generici sono metodi che definiscono i propri tipi parametro. I tipi parametro hanno visibilita' di metodo e vanno
definiti subito prima del tipo di ritorno (se presente)
_Esempio_
```java
public class GenericMethod {
    public static <N> String getValue(N number) {
        String value = number.toString();
        return value;
    }
    public static void main(String args[]) {
        String value = GenericMethod.getValue(new Integer(25));
        System.out.println(value);
    }
}
```
## Parametri tipo bounded
E' possibile creare tipi generici o metodi generici con restrizioni sui parametri tipo ammessi, quindi
posso limitare il tipo parametro a sottoclassi:
_Esempio_
```java
public class OwnGeneric <E extends Number> {}
```
+ Potro' creare oggetti di $OwnGeneric<Integer>$, $OwnGeneric<Double>$ ecc.
## Parametri covarianti
Quando facciamo override di metodi il tipo di ritorno del metodo ridefinito puo' essere una sottoclasse di quello del metodo originale.
I parametri pero' devono essere dello stesso tipo. Possiamo usare instanceof ed eccezioni per verificare a runtime la correttezza dei parametri.
Sarebbe molto meglio intercettare i problemi a tempo di compilazione, possiamo usare i generics.
```java
interface Cibo {String getColore();}

interface Animale {void mangia(Cibo cibo);}

public class Carnivoro implements Animale {
    public void mangia(Cibo cibo) {
        // un carnivoro potrebbe mangiare erbivori
    }
}

public class Erbivoro implements Cibo, Animale {
    public void mangia(Cibo cibo) {
        // un erbivoro mangia erba
    }
    public String getColore() { . . . }
}
```
Con le classi appena scritte carnivori ed erbivori potrebbero mangiare qualsiasi oggetto Cibo
+ Un carnivoro potrebbe mangiare erba
+ Un erbivoro potrebbe mangiare un altro erbivoro

Ma noi vogliamo che un erbivoro mangi solo erba e un carnivoro solo erbivori.
Definiamo controlli con le instanceof all'interno dei metodi mangia() e una CiboException da lanciare all'occorrenza.
```java
public class Carnivoro implements Animale { 
    public void mangia(Cibo cibo) throws CiboException {
        if (!(cibo instanceof Erbivoro)) {
            throw new CiboException("Carnivoro deve mangiare " + "erbivori!");
        }
        ...
    }
    ...
}

public class Erbivoro implements Cibo, Animale {
    public void mangia(Cibo cibo) throws CiboException {
        if (!(cibo instanceof Erba)) { 
            throw new CiboException("Erbivoro deve mangiare " + "erba!");
            ...
        }
        ...
    }
    public String getColore() { . . . }
}

public class CiboException extends Exception {
    public CiboException(String msg) { super(msg);}
}
```
```java
public class TestAnimali {
    public static void main(String[] args) {
        try {
            Animale tigre = new Carnivoro();
            Cibo erba = new Erba();
            tigre.mangia(erba);
        } catch (CiboException exc) {
            exc.printStackTrace();
        }
    }
}
```
Compila ma produce in esecuzione:
```
CiboException: Un carnivoro deve mangiare erbivori!
        at Carnivoro.mangia(Carnivoro.java:4)
        at TestAnimali.main(TestAnimali.java:6)
```
Ma se definiamo i metodi mangia() delle due classi in modo diverso non implementiamo correttamente l'interfaccia
e il programma non compila:
+ Interfaccia
  ```java
  void mangia(Cibo cibo);
  ```
+ Classe Carnivoro
  ```java
  public void mangia(Erbivoro e){. . .};
  ```
+ Classe Erbivoro
  ```java
  public void mangia(Erba e){. . .};
  ```

Allora come soluzione utilizziamo i generics, definendo l'interfaccia Animale _parametrizzata_ in base al cibo che mangia e la
implemento opportunamente nelle due classi.
```java
interface Animale<C extends Cibo> {
    void mangia(C cibo);
}

public class Carnivoro<E extends Erbivoro> implements Animale<E> {
    public void mangia(E erbivoro) {
    //un carnivoro potrebbe mangiare erbivori o derivati
    }
}

public class Erbivoro<E extends Erba> implements Cibo, Animale<E> {
    public void mangia(E erba) {
    //un erbivoro mangia erba o suoi derivati
    }
    public String getColore() {. . .}
}   
```
```java
public class TestAnimali {
    public static void main(String[] args) {
        Carnivoro<Erbivoro> tigre = new Carnivoro<Erbivoro>();
        Erbivoro<Erba> erbivoro = new Erbivoro<Erba>();
        Erba erba = new Erba();
        tigre.mangia(erbivoro);
        erbivoro.mangia(erba);
        // tigre.mangia(erba); // COMPILE ERROR
        // erbivoro.mangia(erbivoro); // COMPILE ERROR
    }
}
```
Compila ed esegue correttamente, e se provo a far mangiare cibo inadeguato non compila.
