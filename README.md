# Java Quotes

Use the file `recentquotes.json` to show random popular book quotes. Your program should use GSON to parse the .json 
file. The app needs no functionality other than showing the quote and the author when it is run. 
The app should choose one quote each time it is run.

## Author
Liz Mahoney

## Version 
1.0.0

## Dependencies

```
dependencies {
  implementation 'com.google.code.gson:gson:2.8.5'
}
```

## Getting Started 

1. Make a new directory on your local `mkdir java-quotes`
2. Run gradle command to create a java application `gradle init --type java-application`
3. On terminal run: `idea .` to open the application on IntelliJ
4. An import Project on Gradle screen should pop up, select `Use auto-import`, and for `Gradle JVM`, select the appropriate JDK. *This project is using JDK 12.0.1*
5. Add a `.gitignore` file and add the appropriate paths to ignore certain files and directories when pushing to github.
6. Add a file in the resources directory (../src/main/resources/) called `recentquotes.json` and copy the provided contents.

To run the application:

`./gradlew run --args 'author Chimamanda'`

Testing:

`./gradlew test`

F

## Resources

GSON User Guide - https://github.com/google/gson/blob/master/UserGuide.md
Design Document Link From GSON Repo: https://github.com/google/gson/blob/master/GsonDesignDocument.md