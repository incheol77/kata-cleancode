#!/bin/bash

cd ..
javac -cp ./starbuzz_java ./starbuzz_java/*.java
java starbuzz_java.StarBuzzMain
cd ./starbuzz_java
rm *.class
