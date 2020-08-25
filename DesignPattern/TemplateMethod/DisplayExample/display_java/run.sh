#!/bin/bash

cd ..
javac -cp ./display_java ./display_java/*.java
java display_java.Main

cd ./display_java
rm *.class


