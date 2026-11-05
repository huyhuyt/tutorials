#!/bin/bash
if [ ${1,,} = Kevin ]; then
  echo "Hi $1, have a great day"
elif [ $1 = "Kim Hoang" ]; then
  echo "Hi $1, have a beautiful day"
else
  echo "Hi you, I don't know you but have a good day."
fi
