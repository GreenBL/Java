# `Programmazione 26/10/22`

<!--
# <p style="color:OrangeRed">title_big</p>
## <p style="color:SpringGreen">(new)title</p> --->

### Reference `this` con i metodi

+ Il metodo ___getNome()___
```java
public String getNome(){
    return nome;
}
```
_diventa_
```java
public String getNome(){
    return this.nome;
}
```
Quando accediamo a un metodo con l’operatore `.` il reference dell’oggetto per cui invochiamo il metodo sarà disponibile nella variabile d’istanza `this` dell’oggetto
```java
Dipendente d1 = new Dipendente();
Dipendente d2 = new Dipendente();
…
System.out.println(d1.getNome()); // this sarà d1
System.out.println(d2.getNome()); // this sarà d2
```
### Uso di `this` con le variabili

Le variabili d’istanza sono memorizzate nell’heap e le variabili locali (e parametri di metodi) nello stack.
Si possono avere variabili locali e d’istanza nello stesso scope con lo stesso nome.

Con this possiamo indicare esplicitamente che vogliamo accedere alla variabile d’istanza, altrimenti accede alla variabile locale.

<p style="color:Pink">Non è quindi necessario trovare nomi dei parametri diversi dalle variabili d’istanza, ad esempio nei costruttori prametrizzati o nelle set </p>

__Esempio__

```java
public class Cliente {
    private String nome, indirizzo, numeroDiTelefono;
    public void setDati(String n, String ind, String num) {
        nome = n;
        indirizzo = ind;
        numeroDiTelefono = num;
    }
                    . . .
}
```
_diventa_

```java
public class Cliente {
    private String nome, indirizzo, numeroDiTelefono;
    public void setDati(String nome, String indirizzo, String numeroDiTelefono) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.numeroDiTelefono = numeroDiTelefono;
    }
                    . . .
}
```
##### E' buona prassi utilizzare sempre `this` per riferirsi alle variabili d'istanza

### Uso di `this` con i metodi

__Esempio__

```java
public class Cliente {
    private String nome;
    private String indirizzo;
    private String numeroDiTelefono;
    public Cliente(String nome, String indirizzo, String numeroDiTelefono) {
        this.setNome(nome);
        this.setIndirizzo(indirizzo);
        this.setNumeroDiTelefono(numeroDiTelefono);
    }
    public void setNumeroDiTelefono(String numeroDiTelefono) {
        this.numeroDiTelefono = numeroDiTelefono;
    }
    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
                    . . .
}
```
### Uso di `this` con i costruttori
+ Overload di costruttori
+ Possibilità di chiamare un costruttore dall’interno di un altro costruttore
+ Favorisce il riuso del codice: evitiamo di scrivere più volte lo stesso codice
+ Non si può chiamare un costruttore con la sintassi con cui si
chiamano gli altri metodi
+ Si usa ___this(lista_parametri)___
+ ___this()___ deve essere la prima istruzione del costruttore

__Esempio__
```java
public class Cliente {
// . . .
    public Cliente(String nome, String indirizzo, String numeroDiTelefono) {
    // Validazione dati
    . . .
    this.setNome(nome);
    this.setIndirizzo(indirizzo);
    this.setNumeroDiTelefono(numeroDiTelefono);
    }
    public Cliente (String nome,
    String indirizzo) {
        this(nome,indirizzo,"sconosciuto");
    }
// . . .
}
```
#### L'incapsulamento va usato sempre
Cominciamo col definire una classe senza incapsulamento
```java
public class Punto {
    public int x, y;
    //. . .
}
```
```java
Punto p1 = new Punto();
Punto p2 = new Punto();
p1.x = 5;
p1.y = 6;
p2.x = 10;
p2.y = 20;
//. . .
```
E successivamente nello sviluppo vengono aggiunti dei vincoli (le specifiche del software possono cambiare)

```java
public class Punto {
    private int x, y;
    private static final int VALORE_MASSIMO_PER_X=10 ;
    private static final int VALORE_MINIMO_PER_X=-10 ;
    private static final int VALORE_MASSIMO_PER_Y=10 ;
    private static final int VALORE_MINIMO_PER_Y=-10 ;

    // . . .

    public void setX(int a) {
        if (a <= VALORE_MASSIMO_PER_X && a >= VALORE_MINIMO_PER_X){
            x = a;
            System.out.println("X è OK!");
        } else {
            System.out.println("X non valida. Assumo 0.");
            x = 0;
        }
    }
    public void setY(int a){
        if (a <= VALORE_MASSIMO_PER_Y && a >= VALORE_MINIMO_PER_Y){
            y = a;
            System.out.println("Y è OK!");
        } else {
            System.out.println("Y non valida. Assumo 0.");
            y = 0;
        }
    }

//. . .

}
```
In questo modo bisognerà modificare la parte del programma _main_ che utilizza gli oggetti punto

```java

    // . . .

    Punto p1 = new Punto();
    Punto p2 = new Punto();
    p1.setX(5);
    p1.setY(6);
    p2.setX(10);
    p2.setY(20);

    // . . .

```

##### Era meglio incapsulare sin dall'inizio

```java
public class Punto {
    private int x, y;
    public void setX(int a) {
        x = a;
    }
    public void setY(int a) {
        y = a;
    }

    // . . .

}
```
### Bisogna fornire metodi _set_ e _get_ per tutti i dati?
No, solo per quelli che è opportuno rendere accessibili dall’esterno, possono esserci dati interni usati da altri metodi ma che non ha senso rendere accessibili.

Possono esserci variabili d’istanza che vogliamo leggere ma non modificare (o viceversa)

__Esempio__

```java
public class PuntoFisso {
    private int x, y;
    public PuntoFisso (int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}
```

## Modificatori
I modificatori sono parole chiave che cambiano il significato di un elemento di un programma Java, ad esempio:
+ _public_, _private_, _static_, _final_ 

### Modificatori di accesso
I modificatori _di accesso_ regolano visibilità e accesso a componenti Java
+ __public__
  + Può essere utilizzato sia per un membro (attributo o metodo) di una classe, sia per una classe stessa. Rende l’elemento accessibile a tutti.
+ __nessun modificatore__
  + Può essere utilizzato sia per un membro di una classe, sia per una classe stessa. Rende l’elemento accessibile solo da classi appartenenti al package dove è definito.
+ __protected__
  + Può essere utilizzato solo per membri. Un membro protetto sarà accessibile all’interno dello stesso package ed in tutte le sottoclassi della classe in cui è definito, anche se non appartenenti allo stesso package.
+ __private__
  + Può essere utilizzato solo per membri. Questo modificatore
restringe la visibilità di un membro di una classe alla classe stessa.

_Riassumendo_
__Per funzioni e dati membro__
|MODIFICATORE   | STESSA CLASSE  | STESSO PACKAGE  | SOTTOCLASSE  | OVUNQUE  |
| :- | :-: | :-: | :-: | :-: |
| _public_  | X  | X  | X  |  X |
| _protected_  | X  | X  | X  |   |
| nessun modificatore  | X  |  X |   |   |
| _private_  |  X |   |   |   |

__Per le classi__
Si può usare solo _public_ o nessun modificatore

### Modificatore _static_
Il modificatore _static_ è un punto d'incontro tra programmazione a oggetti e procedurale, va usato raramente e solo quando serve.

Applicato alle variabili d'istanza rende queste condivise fra tutti gli oggetti della classe, dunque diventano _variabili di classe_, non di oggetto.

Inoltre permette la sintassi:
```java
NomeClasse.nomeMembro
```
oltre a
```java
NomeOggetto.nomeMembro
```
Si può applicare anche ai metodi.

Ma il modificatore _static_ non ha senso applicato a variabili locali, parametri di metodi e classi.