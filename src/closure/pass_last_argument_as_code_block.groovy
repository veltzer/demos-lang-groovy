#!/usr/bin/groovy

/*
	This example shows that the last argument for a groovy function,
	if it is a closure/function, could be passed outside the parenthesis
	used for the function call.

	This is what makes the groovy syntax look like DSL
*/

def apply(x, op) {
	println op(x)
}
apply(4,{
	Math.cos(it)
})
apply(4) {
	Math.cos(it)
} 
