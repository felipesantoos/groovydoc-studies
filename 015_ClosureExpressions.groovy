def sParameterLessClosure = "1 + 2 = ${-> 3}"
assert sParameterLessClosure == '1 + 2 = 3'

def sOneParameterClosure = "1 + 2 = ${w -> w << 3}"
assert sOneParameterClosure == '1 + 2 = 3'

def number = 1
def eagerGString = "value = ${number}"
def lazyGString = "value = ${-> number}"

assert eagerGString == 'value = 1'
assert lazyGString.toString() == 'value = 1'

number = 2
assert eagerGString == 'value = 1'
assert lazyGString == 'value = 2' // value changed
