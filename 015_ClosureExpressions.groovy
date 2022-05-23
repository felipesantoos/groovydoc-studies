def sParameterLessClosure = "1 + 2 = ${-> 3}"
assert sParameterLessClosure == '1 + 2 = 3'

def sOneParameterClosure = "1 + 2 = ${w -> w << 3}"
assert sOneParameterClosure == '1 + 2 = 3'

def number = 1
def eagerGString = "value = ${number}"
def lazyGString = "value = $..."
