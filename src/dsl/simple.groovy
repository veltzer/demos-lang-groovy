#!/usr/bin/groovy

def gal_pipeline(code) {
	// println code.dump()
	println "before the code"
	code()
	println "after the code"
}

gal_pipeline {
	for(x in 1..10) {
		println x
	}
}
