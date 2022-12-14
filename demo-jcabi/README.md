# Jcabi AOP-Logging Lösung

Vorgefertigte @Loggable Annotations mit ein paar Einstellmöglichkeiten.
Verwendung durch anpassungen an der pom

> Nötige Anpassungen: https://aspects.jcabi.com/example-weaving.html

# Möglichkeiten

## Pro Methode

```java
public class Resource {
  @Loggable
  public String load(URL url) {
    return url.openConnection().getContent();
  }
}
```

Führ z.B. zu:
`#load('http://www.google.com'): returned "<html ..." in 23ms`

## Pro Klasse

```java
public class Resource {
  @Loggable(Loggable.DEBUG)
  public class Foo {
    // All methods of the class will be logged.
  }
}
```

## Log Log bei Start und Ende der Ausführung

```java
public class Resource {
  @Loggable(prepend = true)
  public void run() {
    // Something that takes too long.
  }
}
```

## Ignorieren bestimmter Exceptions

```java
@Path("/")
public class JaxRsResource {
  @GET
  @Loggable(ignore = WebApplicationException.class)
  public String get() {
    if (/* not a logged in user */) {
      throw new WebApplicationException(Response.seeOther(/* URI */));
    }
  }
}
```

## Argumente oder Ergebnisse nicht mitloggen

```java
public class VerboseClass {
  @Loggable(skipResult = true)
  public List<String> get(String name) {
    // Returns a long list of texts which are not
    // important and should not pollute the log.
  }
}
```

`skipArgs oder skipResult ` 

## Ergebnis der toString Methode mitloggen

```java
public class LoggingThis {
  private final String name = "John";

  @Loggable(logThis = true)
  public List<String> get(String name) {
    // Returns a long list of texts which are not
    // important and should not pollute the log.
  }

  public String toString() {
    return String.format("{name=%s}", this.name);
  }
}
```

## Bestimmten Logger nutzen

```java
public class LoggingName {
  @Loggable(name = "com.foo.my-custom-logger")
  public List<String> get(String name) {
      // will log to com.foo.my-custom-logger
```

## genauigkeit der Zeitangabe verändern

```java 
public class LoggingPrecision {
  @Loggable(precision = 4)
  public List<String> get(String name) {
      // time logged will have 4 fractional digits
  }
}
```

## Only Log Exceptions

```java
public class Resource {
  @LogExceptions
  public String load(URL url) {
    return url.openConnection().getContent();
  }
}
```

> Source: https://aspects.jcabi.com/annotation-loggable.html
