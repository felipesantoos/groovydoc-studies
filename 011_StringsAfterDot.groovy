def map = [:]

map.'single quote' = 'single quote'
map."double quote" = "double quote"
map.'''triple single quote''' = '''triple single quote'''
map."""triple double quote""" = """triple double quote"""
map./slashy string/ = /slashy string/
map.$/dollar slashy string/$ = $/dollar slashy string/$
def firstName = 'Homer'
map."Simpson-${firstName}" = 'Homer Simpson'

println map.'single quote'
println map."double quote"
println map.'''triple single quote'''
println map."""triple double quote"""
println map./slashy string/
println map.$/dollar slashy string/$
println map.'Simpson-Homer'
