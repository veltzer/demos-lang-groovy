
Create a function called 'common' which receives two maps
and returns a map of the common values to both maps.

If any key is common to the two maps but has diffrent values
in the two maps, raise an exception

Example:
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
m should now be:
[
	'Paris':'France',
]
