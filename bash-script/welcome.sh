#!/bin/bash
# Welcome script to display a message to users
# Author: Kevin Nguyen
# Date: 1/1/2027
# read command will take input and assign it to varible
# read [option] [variable_name ...]
# if omit variable_name, read will assign to default variable $REPLY
# if we enter multiple variable name, read will split input line by space/tabs and assign to multiple varilabes

if [ $# -lt 1 ]; then
  read -p "Enter a name: "
  name=$REPLY
else
  name=$1
fi
echo "Hello $name"
exit 0
