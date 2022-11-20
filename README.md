# kotlin-get-started-api

API to learn Kotlin

https://spring.pleiades.io/guides/tutorials/spring-boot-kotlin/

https://github.com/spring-guides/tut-spring-boot-kotlin

```bash
# Starter
curl https://start.spring.io/starter.zip -d language=kotlin -d dependencies=web,mustache,jpa,h2,devtools -d packageName=kotlin.get.started.api -d name=Blog -d type=maven-project -o blog.zip
```

Server is running on http://localhost:8080

## Run

```bash
# generate jar file
mvn package
java -jar target/blog-0.0.1-SNAPSHOT.jar
```

```bash
# run by spring boot
mvn spring-boot:run
```

## Troubleshooting

### バージョンエラーで実行できない

```bash
Exception in thread "main" java.lang.UnsupportedClassVersionError: get/started/api/BlogApplicationKt has been compiled by a more recent version of the Java Runtime (class file version 61.0), this version of the Java Runtime only recognizes class file versions up to 55.0
        at java.base/java.lang.ClassLoader.defineClass1(Native Method)
        at java.base/java.lang.ClassLoader.defineClass(ClassLoader.java:1017)
        at java.base/java.security.SecureClassLoader.defineClass(SecureClassLoader.java:174)
        at java.base/java.net.URLClassLoader.defineClass(URLClassLoader.java:555)
        at java.base/java.net.URLClassLoader$1.run(URLClassLoader.java:458)
        at java.base/java.net.URLClassLoader$1.run(URLClassLoader.java:452)
        at java.base/java.security.AccessController.doPrivileged(Native Method)
        at java.base/java.net.URLClassLoader.findClass(URLClassLoader.java:451)
        at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:589)
        at org.springframework.boot.loader.LaunchedURLClassLoader.loadClass(LaunchedURLClassLoader.java:151)
        at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:522)
        at java.base/java.lang.Class.forName0(Native Method)
        at java.base/java.lang.Class.forName(Class.java:398)
        at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:46)
        at org.springframework.boot.loader.Launcher.launch(Launcher.java:108)
        at org.springframework.boot.loader.Launcher.launch(Launcher.java:58)
        at org.springframework.boot.loader.JarLauncher.main(JarLauncher.java:65)
```
