# Java / Maven / AngularJs + RequireJS seed project

## Introduction

This project aims to be a good starting point for a java / maven / Spring / AngularJs + RequireJs project.
If you don't want to use AngularJS and RequireJS, you can easily modify it to use those technologies.

#### Git Clone:

```bash
git clone https://github.com/ulhas87/java-angularjs-requirejs-seed.git
```

## Prerequisites
* Firefox or Chrome
* [JDK](http://www.wikihow.com/Install-Oracle-Java-JDK-on-Ubuntu-Linux)
* [Maven](https://maven.apache.org/download.cgi) `sudo apt-get install maven`
* [GIT](https://git-scm.com/downloads) `sudo apt-get install git`
* [npm](https://www.npmjs.org) or `sudo apt-get install npm`
* [nodejs](http://nodejs.org) or `sudo apt-get install nodejs-legacy`
* [IDE](http://www.jetbrains.com/)
* [bower](http://bower.io)
* [PhantomJs](http://phantomjs.org) or `brew install phantomjs`
* [Application Server](https://tomcat.apache.org/download-90.cgi) `(tomcat)`
* Copy the tomcat-users.xml file for tomcat managerment and administration to the tomcat/conf

## Installation

```bash
mvn package
```

When running this command a couple of things happen:
* Javascript will be minified.
* All the other standard maven phases.
* The war will to copied to the tomcat folder specified in the tomcat property



