# App Engine/Groovy/Spring Starter App

The App Engine "Hello World" app based on Groovy programming language and Spring framework.

## Requirements

- Java 7
- [Google App Engine SDK for Java](https://cloud.google.com/appengine/downloads) 1.9.33+

The App Engine SDK will be downloaded automatically by default and exploded into ~/.gradle/appengine-sdk. Alternatively,
you can use your current App Engine SDK installation as follows.

1. In the build.gradle set convention property downloadSdk to false
2. Set the environment variable APPENGINE_HOME pointing to the SDK of your choice

## Set Up

Specify the app's registered application ID and the version identifier in the following configuration file.

    application/src/main/application/META-INF/appengine-application.xml

## Usage

**Note: The first time Gradle Wrapper script is executed, it downloads and installs the appropriate Gradle distribution
and runs the build against this downloaded distribution. Any installed Gradle distribution is ignored when using the
wrapper scripts.**

To start the development web server, issue the below command from the project's root.

    $ ./gradlew appengineRun

To test the app, visit the URL [http://localhost:8888/greeting](http://localhost:8888/greeting).

To access the development console, visit the URL [http://localhost:8888/_ah/admin](http://localhost:8888/_ah/admin).

To stop the development web server, issue the below command from the project's root.

    $ ./gradlew appengineStop

To upload application files, run the below command from the project's root.

    $ ./gradlew appengineUpdate

The first time you issue the given command, you have to go through the OAuth2 flow.

For more details, visit Gradle App Engine plugin [documentation](https://github.com/GoogleCloudPlatform/gradle-appengine-plugin).