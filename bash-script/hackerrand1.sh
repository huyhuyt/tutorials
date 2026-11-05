#!/bin/bash
x=2
y=2
z=2
echo "$x"
echo $y
echo $z

if (( x == y && y == z )); then
 echo "EQUILATERAL"
elif (( x == y || y == z || x == z )); then
 echo "hehe"
else
 echo "SCALENE"
fi
