#!/usr/bin/perl

print("welcome to perl programming");
my $name = "Kevin";
my $age = 54;

print("my name is $name and I am $age years old\n");

@animals = ("dog", "eagles", "elephant");
%students = (
             "kevin" => 55,
             "kim" => 57,
             "yen" => 23,
             "albert" => 17,
             "alice" => 18,
            );
print("number elements in array animals are @animals\n");
print("$animals[0]\n");
print("@animals[0,1]\n");
print("@animals[0..2]\n");
