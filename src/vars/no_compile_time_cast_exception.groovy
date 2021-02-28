#!/usr/bin/groovy

/*
	This example shows that you cannot get a compile time class cast
	exception from Groovy even when using two typed variables that
	have no castring between them.
*/

class Car {
}

class Plane {
}

Car c=new Car()
println c.getClass()
Plane p=new Plane()

println "I am here"
c=p
println c.getClass()
