#!/bin/bash

cd ..
javac -cp ./decorator_java/ ./decorator_java/*.java
java decorator_java.DecoratorMain
cd ./decorator_java
rm *.class
