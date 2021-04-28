#!/usr/bin/groovy

/*
	Some basic examples of dictionaries...
	Associative array, hashmap, map, hash, dictionary, key/value

	Notes:
	- m.class is null for maps
	- use m.getClass() to see the class.
	- could be used as the target of a foreach type loop

*/

Map m=[
	'Paris':'France',
	'Jerusalem':'Israel',
]

println "m is ${m} and it's type is ${m.class}"

println m.getClass()

// foreach loop
for(x in m) {
	println "The capital of ${x.value} is ${x.key}"
}

// get value of key
println m['Paris']

// change a value
m['Paris']='England'
println m
