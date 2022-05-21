def name = 'John Doe'
def greeting = "Hello, ${name}!"

assert greeting.toString() == 'Hello, John Doe!'

def sum = "The sum of 2 and 3 is equals to ${2 + 3}."

assert sum.toString() == 'The sum of 2 and 3 is equals to 5.'

def person = [name: 'John Doe', age: 36]
assert "$person.name is $person.age years old" == 'John Doe is 36 years old'

def number = 3.14
println "${number.toString()}" // it works
// println "$number.toString()" // it doesn't work
