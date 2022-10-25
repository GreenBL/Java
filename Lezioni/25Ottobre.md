# `Programmazione 25/10/22`

<!--
# <p style="color:OrangeRed">title_big</p>
## <p style="color:SpringGreen">(new)title</p> --->

# <p style="color:OrangeRed">Incapsulamento e visibilità</p>
### Outline 
+ Incapsulamento
+ Reference `this`
+ Modificatori di accesso
+ Modificatore `static`
+ Design Pattern Singleton

## Incapsulamento

Tramite l'incapsulamento l'accesso ai dati viene controllato usando metodi definiti opportunamente. L'incapsulamento garantisce robustezza, indipendenza e riusabilità delle classi e semplifica la manutenzione del codice.

### Come incapsulare una classe? 
+ Rendere inaccessibili le variabili tramite il modificatore `private`
+ I dati non saranno accessibili dall'esterno tramite l'operatore `.`
+ Saranno comunque accessibili dagli altri metodi della classe

L'accesso viene controllato mediante metodi con modificatore `public`

#### <p style="color:Red">Classe non incapsulata</p>
```java
public class Data{
     public int giorno; public int mese; public int anno;
}
...
Data unaData = new Data();
unaData.giorno = 14;
unaData.mese = 4;
unaData.anno = 2004;
...
unaData.giorno = form.dammiGiornoInserito();
unaData.mese = form.dammiMeseInserito();
unaData.anno = form.dammiAnnoInserito();
...
```

##### <p style="color:Red">Problema :</p> _L'utente inserisce dati non validi_

+ Possibili soluzioni
  + Utilizzare controlli nella GUI (non si può riutilizzare il codice)
  + `Utilizzare l'incapsulamento`

#### <p style="color:SpringGreen">Classe con incapsulamento [1]</p>

```java
public class Data{
    private int giorno; 
    private int mese; 
    private int anno;
public void setGiorno(int g){
    if (g > 0 && g <= 31){
        giorno = g;
    } else {
        System.out.println("Giorno non valido. Assumo 1. . .");
        giorno = 1;
    }
}

    public int getGiorno(){
        return giorno;
    }

    public void setMese(int m){
        if (m > 0 && m <= 12){
            mese = m;
        } else {
            System.out.println("Mese non valido. Assumo 1. . .");
            m = 1;
        }
    }

    public int getMese(){
        return mese; 
    }

    public void setAnno(int a){
        anno = a;
    }

    public int getAnno(){
        return anno; 
    }
}
```
### Svantaggi dell'incapsulamento
Più codice da scrivere
### Vantaggi dell'incapsulamento
+ Utilizzatore obbligato a utlizzare metodi _get_ e _set_
  + L'accesso diretto ai dati produce errore in compilazione
+ Manutenibilità ed estendibilità
  + Se volessi imporre il vincolo che la _setGiorno()_ ammette valori diversi in base al mese corrente saprei immediatamente dove fare le modifiche

## Metodi _set_ e _get_
+ Convenzione sul nome
  + _getProprietà()_
  + _setProprietà()_

Conosciuti anche come:
+ set - mutator methods - setter methods
+ get - accessor methods - getter methods

I metodi vanno sempre pensati in relazione all’oggetto per cui sono chiamati e possono accedere a tutti gli elementi (anche private) dell’oggetto per cui sono chiamati.

## Incapsulamento funzionale
### Metodi private
I metodi private non saranno accessibili dall'esterno mediante l'operatore `.`, ma saranno comunque accessibili dagli altri metodi della classe che si sta sviluppando.
Sono di solito metodi di utilità utilizzati da diversi metodi della classe ma che non vogliamo siano accessibili dall’esterno.

##### Esempio
```java
public class ContoBancario { 
    ...
    public String getContoBancario() {
        if(controllaCodice(codiceDaTestare){
        ... 
        ...
    }

    private boolean controllaCodice(int codiceDaTestare) {
        if (codiceSegreto == codiceDaTestare) {
            return true;
        } else {
            return false;
        }
    }
}
```

#### <p style="color:Red"> Osservazione
Oggetti di una classe possono accedere alle sezioni private di altri oggetti della stessa classe:
```java
public class Dipendente {
    private String nome;
    private int anni; //intendiamo età in anni. . .
    public String getNome() {
        return nome;
    }
    public void setNome(String n) {
    nome = n; 
    }
    public int getAnni() { 
        return anni;
    }
    public void setAnni(int n) {
        anni = n;
        }
    public int getDifferenzaAnni(Dipendente altro) {
        return (anni – altro.anni); // Meglio usare altro.getAnni()
    } 
}
```
## Il reference `this`
Normalmente si accede alle variabili d'istanza tramite il reference e nella scrittura dei metodi accediamo direttamente alle variabili d'istanza dell'oggetto per cui è chiamato il metodo.

Tutti gli oggetti hanno, fra gli altri dati, un reference che referenzia l’oggetto stesso: il reference `this`.
Il compilatore aggiunge `this` ogni volta che accediamo a una variabile d’istanza da dentro un metodo.

Ad esempio in ___getNome()___ :
```java
return nome; ---> return this.nome;
```

