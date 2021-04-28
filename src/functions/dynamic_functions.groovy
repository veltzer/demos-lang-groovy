#!/usr/bin/groovy

print_hello = {
	println "Hello, World!"
}
print_hello = {
	println "Goodbye, World!"
}

// This is how you get parameters in a dynamic function
/*
def add(a,b) {
	return a+b
}
*/
add = { a,b -> a+b }
println add(2,2)

def print_hello_2() {
	println "Hello, World!"
}

println print_hello.getClass()
// println print_hello_2.getClass()

print_hello()
print_hello_2()
