# Java Quotes

Use the file `recentquotes.json` to show random popular book quotes. Your program should use GSON to parse the .json 
file. The app needs no functionality other than showing the quote and the author when it is run. 
The app should choose one quote each time it is run.

## Author
Liz Mahoney

## Version 
1.0.0

## Dependencies

Add the implementation line to build.gradle file:

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

***To clone:***

1. Make a new directory on your local `mkdir java-quotes`, then go into the directory: `cd java-quotes`.
2. Copy the clone link from the repo then run ` git clone https://github.com/emd5/java-quotes.git` 
3. Open the application with IntelliJ: `idea .`, and import any gradle settings.


***To run the application:***

`./gradlew run `

***To run application to find author***

`./gradlew run --args 'author Chimamanda'`

***Testing:***

`./gradlew test`


## Features 

- [x] Start by refactoring anything that you don’t like about your solution from yesterday.
- [x] When running the application, don’t read in the quotes file. Instead, make a request to an API to get a random quote.
- [x] please do not delete your existing code, look at the very next feature task, you will still need that code
Some examples of APIs you could choose to use:
- [x] Ron Swanson Quotes
- [x] Rather than a Quote of the Day, please use an API that allows you to show a random quote.
- [x] We do still have this quotes file, though, and it might still be useful! Ensure that if your app has errors in connecting to the Internet, you instead display a random quote from your file.
- [x] When we grab a random quote from the Internet, we could add it to our file of quotes, for use if the app goes offline in the future. Add that functionality: when a quote comes back from a request, it’s also cached in the json file.



## Resources

GSON User Guide - https://github.com/google/gson/blob/master/UserGuide.md

Design Document Link From GSON Repo: https://github.com/google/gson/blob/master/GsonDesignDocument.md