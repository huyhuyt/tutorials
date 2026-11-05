#!/bin/bash
list_files=$(ls -l | awk '{print $9}')
for i in ${list_files[@]};
 do echo $i;
done
