def map = [:]

map."an indentifier with a space and double quotes" = "ALLOWED"
map."an-indentifier-with-dash-sign-and-single-quotes" = "ALLOWED"

assert map."an indentifier with a space and double quotes" == "ALLOWED"
assert map."an-indentifier-with-dash-sign-and-single-quotes" == "ALLOWED"

println map."an indentifier with a space and double quotes"
println map."an-indentifier-with-dash-sign-and-single-quotes"
