#!/usr/bin/groovy

def sum(a,b) {
	return a+b
}

def mul(x,n) {
	agg=0
	for(i=0;i<n;i++) {
		agg=sum(agg, x)
	}
	return agg
}

println '4+5 is '+sum(4,5)
println '4*5 is '+mul(4,5)
