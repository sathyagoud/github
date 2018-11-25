//import groovy.json.*
//import java.security.*
println(new groovy.json.JsonBuilder(java.security.Security.providers).toPrettyString())
