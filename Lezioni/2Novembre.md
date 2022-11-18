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