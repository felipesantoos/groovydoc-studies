def fooPattern = /.*foo.*/
assert fooPattern == '.*foo.*'

def escapeSlash = /The character \/ is a foward slash/
assert escapeSlash == 'The character / is a foward slash'

def multilineSlashy = /one
    two
    three/

assert multilineSlashy.contains('\n')

def color = 'blue'
def interpolatedSlashy = /a ${color} car/

assert interpolatedSlashy == 'a blue car'

// println "$()"
// println "$5"
x = /$()/
println x
y = /$5/
println y
