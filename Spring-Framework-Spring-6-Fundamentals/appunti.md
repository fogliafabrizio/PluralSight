# Spring Framework: Spring 6 Fundamentals

Data Inizio: 04 Aprile 2024

Data Fine:

Requisiti:

* Java 17
* Spring Boot 3
* Spring Framework 6

**Definizione Spring**:

* Iniziato come un **Inversion of Control Container**
* Spesso collegato al concetto di **Dependency Injection**
* Ridurre o sostituire la complessa configuration di **Jave Enterprise Edition**: usare Java senza _Enterprise
  JavaBeans (EJBs)_.

**Dependecy Injection**: utile per eliminare la difficile configurazione tramite _wiring_ tramite l'utilizzo del
framework dove sono necessarie.

Cos'è Spring:

1. Framework per ridurre complessità di **JEE**. Utilizzare Java senza EJBs. Sviluppo Enterprise senza Application
   Server. **Tomcat è un Web Server molto comodo per questo lo troviamo _Embedded_**. Lo troviamo all'interno di un jar.
   Quindi non ci accorgiamo
2. **Plain Old Java Object Based (POJO Based)**: ci permette di semplificare il codice.
3. Non ci ostacola!
4. **AOP/Proxies**: codice più pulito e corto
5. **Best Practices**: abbiamo pattern che ci aiutano che possiamo utilizzare. Avere più efficienza. Ad esempio il
   Template Method, Annotation Based, Singleton...

Il problema che prova a risolvere Spring qual è?

Vantaggi:

* **Testability**
* **Maintainability**
* **Scalability**
* **Complexity** (riduce)
* **Business Focus**: Spring ci aiuta a rimanere concentrati sul Business dell'applicazione. Il business non interessa
  quale framework si usa, Spring aiuta a raggiungere l'obbiettivo più velocemente.

Esempio: JDBC

Per usare JDBC abbiamo bisogno della `Connection`, `PreparedStatement`, `DriverManager`...
Per una semplice query dobbiamo fare un blocco try-catch, chiudere la connessione, ...
Troppa complessità anche.

Il nostro business si interessa solo di avere l'oggetto che si aspetta come risultato della query.
Tutte le altre cose possono essere gestite tramite Spring.

Quindi, la soluzione ci permette di 

* Rimuovere la configurazione.
* Concentrarsi sulla soluzione necessaria.
* Testing: ci permette di testare le principali funzionalità
* Annotation o (storico) XML based
* Interface based: sviluppo tramite Interfacce che ci permettono di semplificare il codice.

Senza JDBC il nostro codice può essere semplificato con usa semplice operazione.
Nessuna connessione, resultSet, chiusura di connessione, try catch ...

FindBy e return statement. Stop. Utilizza il Template Method Pattern e non ci interessa cosa c'è dietro.
Non c'è nessuna ragione per scrivere ciò che abbiamo di configurazione. Concentriamo tutto.

Come fa a fare tutto ciò?
Tramite **POJOs**, **Hashmap** (_chiamato anche Application Context_, che è dove saranno contenute le nostre dipendenze), **Registry**.

EXISTING TASK EASIER.. BETTER CODE... REPEATABLE PROCESSES..
Utilizziamo alcuni Design Pattern da **JEE Blueprints** per aiutarci.
Make code brittle!

Ci permette di cambiare l'ambiente senza problemi.

**Write Once Run Anywhere WORA!**

##  Spring Configuration

### Java Configuration

La configurazione tramite Java è stata introdotta per eliminare la necessità di utilizzare XML (come si faceva prima).
Non si usa più `applicationContext.xml` ma si crea il nostro contesto tramite le classi Java.
Prima c'era troppo XML. 

Tutto è disponibile tramite la configurazione Java.

_Abbiamo duplicato conference in confence-java_

@Configuration è una annotazione a livello di classe che ci permette di 
sostituire XML file.
Nel file di configurazione creiamo il nostro context.

Viene usato in combinazione con @Bean (method level): quello che ritorna il metodo è un Bean.
I nomi di classi e metodi possono essere qualsiasi. Possiamo anche dare nome specifici tramite l'annotazione.

**Setter Injection** ci permette di capire la **Dependency Injection**.
Basta settare un bean.

**Constructor Injection** è come la Setter, semplicemente la dipendenza viene passato attraverso il costruttore.
