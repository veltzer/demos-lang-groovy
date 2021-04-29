#!/usr/bin/groovy

def common(m1,m2) {
	Map m=[:]
	for(x in m1) {
		if(m2[x.key]) {
			if(x.value==m2[x.key]) {
				m[x.key]=x.value
			} else {
				throw new Exception("The values dont match")
			}
		}
	}
	return m
}

Map m1=[
	'Paris':'France',
	'Jerusalem':'Israel',
]
Map m2=[
	'Paris':'France',
	'London':'England',
	'Moscow':'Russia',
]
m=common(m1, m2)
println m
