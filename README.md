Groovy Time Extensions
======================
This is a simple library that adds extensions methods to Groovy numbers to generate a Java 8 `Duration` object

Usage
=====
```
Duration.of(8, ChronoUnit.SECONDS) == 8.seconds()
```

The following units are available:

```
NANOS
MILLIS
SECONDS
HOURS	
HALF_DAYS
DAYS
```

Building
========
Groovy Extensions is built using the Gradle wrapper and uses Spock for tests

```
$ ./gradlew test
```
