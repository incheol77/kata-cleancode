#!/bin/bash

cd ..
javac -cp ./decorator_not_java/ ./decorator_not_java/*.java
java decorator_not_java.DecoratorNotMain
cd ./decorator_not_java
rm *.class
