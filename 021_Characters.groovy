char c1 = 'A'
assert c1 instanceof Character

def c2 = 'B' as char
assert c2 instanceof Character

def c3 = (char) 'C'
assert c3 instanceof Character

Character c4 = 'D'
assert c4 instanceof Character
