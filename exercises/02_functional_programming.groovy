#!/usr/bin/groovy

def repeat(n,f) {
	for(i=0;i<n;i++) {
		f()
	}
}

def print_hello = {
	println "Hello"
}

repeat(10, print_hello)
