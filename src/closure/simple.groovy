#!/usr/bin/groovy

/*
	A simple example of a myClosure that does not have any arguments
	supplied to it. This myClosure does not return anything.
*/

myClosure = { println "hello!" }

println "Executing the Closure:"
myClosure()

m="this is a message"
def do_it() {
	println m
	println n 
	println myClosure
	println z
}
n="this is another message"
do_it()
z="foobar"
