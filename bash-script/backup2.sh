#!/bin/bash
# Author: Kevin Nguyen
# This program is used to backup folder
# with 3 options H M L
# H high compress , M for medium and L just tar

read -p "Choose H, M or L compression " file_compression
read -p "Which directory do you want to backup to " dir_name

#create directory if it does not exist
[ -d $HOME/$dir_name ]
