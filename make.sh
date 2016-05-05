#!/bin/bash

function print {
    echo "------------------------------------------------------------------------"
    echo "$@"
    echo "------------------------------------------------------------------------"
    echo ""
    echo ""
}

ANTLR="antlr-4.5.3-complete.jar"

mkdir -p build

cp -r src/* build
cd build

if [ ! -f $ANTLR ]; then
    echo "Downloading antlr"
    wget "http://www.antlr.org/download/$ANTLR"
fi

print "generating parser"
java -jar $ANTLR -no-visitor -listener -encoding utf8 -lib . -o . Tex.g4

print "building"
javac -encoding utf8 -cp "*:$ANTLR:." *.java

print "running"
java -cp "*:." Main ../report.tex ../output/report.html
echo "See output/report.html"





