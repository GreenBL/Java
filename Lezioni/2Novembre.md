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

# <p style="color:OrangeRed">Ereditarietà</p>
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

slide 11



