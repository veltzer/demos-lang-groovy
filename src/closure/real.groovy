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
// make_adder is now NOT CALLED and ALL OF ITS LOCAL VARIABLES ARE SUPPOSED TO BE GONE
// println add5
// println add3
println "next line should say 12..."
println add5(7)
println "next line should say 11..."
println add3(8)
// println add5.delegate
// println add3.delegate
z=0
println add5(7)
