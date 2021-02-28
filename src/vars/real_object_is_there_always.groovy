#!/usr/bin/groovy

/*
	This is an example that no matter how you define a variable
	(def, no def, type), the underlying object is the same and is really
	known at runtime
*/

def x=5
y=7
int z="asfasd"
println x.getClass()
println y.getClass()
println z.getClass()
