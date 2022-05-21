singleQuotedString = 'single quoted string'
assert singleQuotedString == 'single' + ' quoted ' + 'string'
tripleSingleQuotedString = '''triple quoted string'''
aMultilineString = '''line one
line two
line three'''

println singleQuotedString
println tripleSingleQuotedString
println aMultilineString

def startingAndEndingWithANewLine = '''
    |first line
    |secondline
    |third line
'''

println startingAndEndingWithANewLine
println startingAndEndingWithANewLine.stripIndent()
println startingAndEndingWithANewLine.stripMargin()

def startingAndEndingWithoutANewLine = '''\
    first line
    secondline
    third line\
'''

println startingAndEndingWithoutANewLine

assert !startingAndEndingWithoutANewLine.startsWith('\n')
assert !startingAndEndingWithoutANewLine.endsWith('\n')
