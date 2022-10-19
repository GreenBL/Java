# `Programmazione 19/10/22`

<!--
# <p style="color:OrangeRed">title_big</p>
## <p style="color:SpringGreen">(new)title</p> --->

# <p style="color:OrangeRed">Incapsulamento</p>
Finora abbiamo cambiato gli attributi degli oggetti attraverso l'operatore `.`, se usiamo una classe che non abbiamo scritto noi personalmente, non abbiamo idea di che cosa contiene.
```java
public class Rettangolo {
    public int[] dimensione = new int[2];

}
```
### Esempio senza incapsulamento
```java
public class Data { 
    public int giorno; 
    public int mese; 
    public int anno;
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
```
#### Continua nella prossima lezione

