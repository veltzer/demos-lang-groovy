#!/usr/bin/groovy

def pipeline(code) {
	// println code.dump()
	code()
}

pipeline {
	println "Hello"
	for(x in 1..10) {
		println x
	}
	do_something {
		println "foo"
	}
}
