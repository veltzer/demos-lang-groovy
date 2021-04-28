#!/usr/bin/groovy

/*
	A 'real' closure. One that refers to the environment that it is in.
	How does this work? What if x was a real object, with lots of RAM
	requirements?
*/

def make_adder(x) {
	def return_function = { y -> x+y }
	return return_function
}

def add5=make_adder(5)
def add3=make_adder(3)
println "next line should say 12..."
println add5(7)
println "next line should say 11..."
println add3(8)
