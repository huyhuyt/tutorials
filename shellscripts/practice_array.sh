#!/bin/bash

myarray=(one two three four)
echo ${myarray[1]}

unset myarray[1]
echo ${myarray[1]}
