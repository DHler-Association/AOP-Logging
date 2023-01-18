# Custon AOP-Logging with Spring AOP

Um Custom AOP-Logging umzusetzen, benötigt man ein AOP-Framework.
Hier gibt es hauptsächlich zwei Optionen: Spring AOP und Aspectj.

Beide haben ihre vor und Nachteile ([Quelle 1](https://stackoverflow.com/questions/1606559/spring-aop-vs-aspectj) und [Quelle 2](https://www.baeldung.com/spring-aop-vs-aspectj)).
Ich habe mich in diesem Fall für Spring AOP entschieden, da es simpler ist und trotzdem alles bietet was wir benötigen und performance nicht extrem wichtig ist.

# Fazit zu AOP-Logging mit Spring-AOP

-	Sehr gute Konfigurationsmöglichkeiten
-	Nur eine dependecy in der pom
-	Robuster als jcabi
-	Verschiedene Annotations möglich
-	Logging auch komplett ohne Annotations möglich

> (Source für implementierung)[https://medium.com/@KosteRico/spring-aop-in-2021-level-up-your-logging-8d1498242ba2]
