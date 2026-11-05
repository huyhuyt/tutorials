#!/bin/bash
read -n 1 c
echo $c
if [[ $c -eq "Y" || $c -eq "y" ]];then
  echo "YES"
elif [[ $c -eq "N" || $c -eq "n" ]];then
  echo "NO"
else
  echo "INVALID"
fi
