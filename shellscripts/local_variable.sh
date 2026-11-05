#!/bin/bash
x=3
y=4
calculate(){
  x=3
  local y=5
}
echo $x
echo $y
calculate
echo $x
echo $y
