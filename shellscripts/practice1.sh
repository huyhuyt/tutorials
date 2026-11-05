#! /bin/zsh
if [ -d "/Users/kevinnguyen" ]; then
  echo "we can create file in this folder"
fi

if [ 2 -gt 3 ] 
then
  echo "2 is greater than 1"
elif [ 3 > 2 ]
then 

  echo "3 is greater than 2"
  echo $?
  exit 1
else
  echo "compare number not correct"
fi
echo $?
