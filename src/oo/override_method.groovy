#!/usr/bin/groovy

class Book {
	def title
	Book(title) {
		this.title=title
	}
	void printMe() {
		println 'book title is '+this.title
	}
}
/*
def b=new Book("Lord of the Rings")
b.printMe()
*/

def b=new Book("Lord of the rings") << {
	println "Im here"
	void printMe() {
		println 'the greatest book'
	}
}
b.printMe()
