#!/usr/bin/groovy

/*
	This example shows how to iterate a map in groovy
*/

def myMap = [ 'France':'Paris','Israel':'Jerusalem' ]

myMap.each { key, val -> println "$key -> $val" }
