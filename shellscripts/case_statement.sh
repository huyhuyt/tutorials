#!/bin/bash
case $1 in
  kevin | administrator)
    echo "you are kevin and administrator"
    ;;
  help)
    echo "just enter your name"
    ;;
  *)
    echo "you are not administrator"
    ;;
esac
