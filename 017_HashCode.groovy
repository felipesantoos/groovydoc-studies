assert "one: ${1}".hashCode() != 'one: 1'.hashCode()

println "one: ${1}".hashCode()
println 'one: 1'.hashCode()

def key = "a"
def map = ["${key}": "letter: ${key}"]

assert map["a"] == null
