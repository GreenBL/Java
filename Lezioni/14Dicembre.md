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