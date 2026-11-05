#!/bin/bash
showuptime(){

#  up=$(uptime -p | cut -c4-)
#  since=$(uptime -s)
up=$(uptime)
since=$(uptime)
  cat << EOF
-----
This machine has been up for ${up}
It has been running since ${since}
-----
EOF
}
showuptime
