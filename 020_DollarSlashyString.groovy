def name = 'John Doe'
def date = 'March, 1st'

def dollarSlashy = $/
    Hello $name,
    today is ${date}

    $ dollar sign
    $$ escaped dollar sign
    \ backslash
    / foward slash
    $/ escaped foward slash
    $$$/ escaped opening dollar slashy
    $/$$ escaped closing dollar slashy
/$

println dollarSlashy

assert [
    'John Doe',
    'March, 1st',
    '$ dollar sign',
    '$ escaped dollar sign',
    '\\ backslash',
    '/ foward slash',
    '/ escaped foward slash',
    '$/ escaped opening dollar slashy',
    '/$ escaped closing dollar slashy'
].every { dollarSlashy.contains(it) }

