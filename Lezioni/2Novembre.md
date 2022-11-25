# `Programmazione 02/11/22`

<!--
# <p style="color:OrangeRed">title_big</p>
## <p style="color:SpringGreen">(new)title</p> --->

### Design Pattern Singleton

Se serve una classe che deve essere istanziata una sola volta, e quindi tutti gli utilizzatori di questa classe utilizzano sempre la stessa istanza, posso usare un _Singleton_

Un Singleton viene implementato con :
+ Un costruttore privato
+ Una variabile privata e statica dello stesso tipo della classe
+ Un metodo statico pubblico che definisce una semplice logica per restituire sempre la stessa istanza (UNICA)

_Esempio_
```java
public class SingletonExample{
    private static SingletonExample instance;
    private SingletonExample(){}
    public static SingletonExample getInstance(){
        if(instance == null){
            instance = new SingletonExample();
        }
        return instance;
    }
}
```
```java
SingletonExample unicaIstanza = SingletonExample.getInstance();
```

# <p style="color:red">Ereditarietà</p>
## Outline
+ Ereditarietà
+ Modificatore _final_
+ Classe __Object__
+ Ereditarietà e incapsulamento
+ Ereditarietà e costruttori

L'ereditarietà è un concetto ispirato al mondo reale, definisce i concetti di _superclasse_ e di _sottoclasse_, e tramite essa è possibile far ereditare codice già scritto ad altre classi, aggiungere dati e metodi alle implementazioni.

La parola chiave in Java è : ___extends___

_Esempio_
```java
public class Libro{
    public String titolo; 
    public String autore; 
    public String editore; 
    public int numeroPagine; 
    public int prezzo; 
     . . .
}
```
```java
public class LibroSuJava{
    public String titolo;
    public String autore;
    public String editore;
    public int numeroPagine;
    public int prezzo;
    public String linkCodice = "http://www.unipa.it/Java";
     . . .
}
```
Con l'ereditarietà invece:

```java
public class LibroSuJava extends Libro{
    public String linkCodice = "http://www.unipa.it/Java";
     . . .
}
```
||Libro|LibroSuJava|
|-|:-:|:-:|
|titolo| X | E
|autore| X | E
|editore| X | E
|numeroPagine| X | E
|prezzo| X | E
|linkCodice| | X

E : Ereditato
X : Nativo

### Modificatore _final_
_final_ indica non modificabile, costante.
Una variabile di istanza dichiarata come final deve essere una costante, una variabile locale o un parametro di metodo dichiarato final non possono essere modificati.

Per l'ereditarietà questo significa che:
+ Un metodo _final_ non può essere riscritto in una sottoclasse
+ Una classe dichiarata _final_ non può essere estesa
  + public final class Math{...}
  + public final class String{...}

## Classe _Object_
La classe Object astrae il concetto di oggetto generico, locata nel package java.lang, questa classe è la superclasse di _ogni_ classe, poichè il compilatore Java estende tutte le classi che scriviamo da Object.
```java
public class Libro extends Object{. . .}
```
Ogni classe dunque eredita tutti i metodi di Object

## Ereditarietà e Incapsulamento
Da una classe incapsulata si ereditano tutti i membri non _private_
+   public
+   protected

_Esempio_
Classe Data da cui derivo Ricorrenza
+   Ricorrenza non potrà accedere a giorno, mese e anno __direttamente__ perché sono privati
+   Ma Ricorrenza potrà accedere ai metodi pubblici _set_ e _get_
+   Ricorrenza avrà dunque una sua copia incapsulata di giorno, mese e anno

Non è necessario mettere i dati _protected_ per potervi accedere dalle classi derivate. Posso sempre usare metodi set e get pubblici e avere un buon incapsulamento. I dati protected sono direttamente accessibili a tutte le classi dello stesso package, ed è un incapsulamento debole.

## Uso dell'ereditarietà
Avere solo qualche campo in comune fra due classi non è sufficiente per usare l'ereditarietà.

_Esempio di ereditarietà scorretta_
    Triangolo e Quadrilatero
+ La relazione "_is a_" deve essere verificata
+ Triangolo is a Quadrilatero? No.

Per distinguere tra eredità o composizioni si utilizzano le relazioni "is a" e "has a" rispettivamente.

In caso di ambiguità, è sempre meglio usare la composizione.

_Esempio_
+   Punto2D e Cerchio
    +   Un Punto2D potrebbe essere un cerchio di raggio 0
    +   Cerchio come luogo geometrico di Punto2D
    +   Cerchio ha un Punto2D come centro
    +   ecc.

Meglio usare la _composizione_

## Ereditarietà e costruttori
I costruttori della classe parent non vengono ereditati dal child.

Per esempio, un oggetto di classe derivata "is a" oggetto di classe base. Come costruirlo?
+   Ricopiando il codice del costruttore di classe base e aggiungendo la parte specializzata?
+   Riuso?

Ma, in Java, un qualsiasi costruttore (anche quello di default), come prima istruzione, invoca sempre un costruttore della superclasse.

_Esempio_
```java
public class Libro{
    public Libro(){
        System.out.println("Costruito Libro!");
    }
}
```
```java
public class LibroSuJava extends Libro{
    public LibroSuJava(){
        System.out.println("Costruito Libro Java!");
    }
}
```
<text style="color:Violet">new</text> <text style="color:turquoise">LibroSuJava</text>() comporta l'esecuzione del costruttore di `LibroSuJava` (in questo ordine)

Il costruttore di `LibroSuJava` viene automaticamente modificato dal compilatore.

```java
public class LibroSuJava extends Libro{
    public LibroSuJava(){
        super(); // istruzione implicita se non fornita esplicitamente
        System.out.println("Costruito Libro Java!");
    }
}
```

### Parola chiave <text style="color:deepskyblue"> _super_ </text>

`super` vs `this`
+   `this`
    +   Reference implicito all'oggetto corrente
+ `super`
  + Reference implicito all'intersezione fra l'oggetto corrente e la sua superclasse.
  Permette di accedere ai componenti della superclasse e in particolare al costruttore.

_this_ invoca un altro costruttore della classe.
_super_ invoca un costruttore della superclasse

+ Così come _this(...)_ , si usa _super(...)_ come prima istruzione del costruttore.
  + Se non lo facciamo noi il compilatore provvederà

_Nota su esempio_ : anche il costruttore di __Libro__ chiamerà il suo _super_

## Costruttori multipli
Inseriamo un costruttore parametrizzato all'interno della nostra classe _Libro_

```java
public class Libro{
    . . .
    public Libro(String titolo){
        this.titolo = titolo;
    }
}
```
La sottoclasse _LibroSuJava_ non compila più. Il costruttore di _LibroSuJava_ chiama implicitamente _super()_ e quindi il costruttore _Libro()_ che però non è più fornito automaticamente quando abbiamo implementato quello parametrizzato.

Per risolvere:
+   implementare il costruttore non parametrizzato _Libro()_
+   invocare _super()_ con il parametro adatto (_String_)

_Esempio_
```java
public class Libro{
    // . . .
    public Libro (String titolo, String autore){
        this(titolo);
        setAutore(autore);
    }
    public Libro (String titolo){
        this.titolo = titolo;
    }
    // . . .
}
```
```java
public class LibroSuJava extends Libro{
    public LibroSuJava(String titolo){
        super(titolo);
    }
    public LibroSuJava(String titolo, String autore){
        super(titolo, autore);
    }
    // . . .
}
```

### Chiamare metodi con _super_
Così come _this_ chiama metodi dell'oggetto corrente, `super` può chiamare metodi della superclasse.

Per esempio avrebbe senso nel caso in cui nella sottoclasse abbiamo ridefinito un metodo, ma vogliamo chiamare la versione della superclasse:

<text style="color:deepskyblue">_nomemetodo()_</text> o <text style="color:deepskyblue">_this.nomemetodo()_</text> invocano il metodo della classe corrente.

<text style=color:turquoise>_super.nomemetodo()_</text> invoca il metodo della superclasse.

_Esempio_

```java
public class Persona {
    private String nome, cognome;
    public String toString(){
        return nome + " " + cognome;
    }
    . . .
    //accessor e mutator methods (set e get)
}
```
```java
public class Cliente extends Persona {
    private String indirizzo, telefono;
    public String toString() {
        return super.toString() + "\n” + indirizzo + "\nTel:" + telefono;
    }
    . . .
    //accessor e mutator methods (set e get)
}
```

### Note sul _toString_
Nell'esempio antecedente __Persona__ ha dichiarato un metodo _toString()_, ma in realtà ha solamente ridefinito il metodo _toString()_ della classe <text style=color:turquoise>Object</text>.

E' un metodo che tutte le classi possono ridefinire per dare una rappresentazione testuale dell'oggetto. Se il metodo toString() non fosse stato riscritto, Persona avrebbe ereditato quello di Object che ritorna una stringa con il formato: 

+ _NomeClasse@IndirizzoEsadecimale_





