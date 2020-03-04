#!/bin/bash
echo "Hello World!"

javac Hello.java # compile the program

for i in {1..10}
do
    echo "Output of Iteration $i" >> outfile
    java Hello >> outfile
done


echo "Bash version ${BASH_VERSION}..."
for i in {0..10..2}
  do 
     echo "Welcome $i times"
 done