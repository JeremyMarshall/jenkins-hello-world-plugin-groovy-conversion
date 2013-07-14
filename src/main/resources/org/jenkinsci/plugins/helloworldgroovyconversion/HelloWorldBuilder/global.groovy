// Namespaces
l = namespace("/lib/layout")
st = namespace("jelly:stapler")
j = namespace("jelly:core")
t = namespace("/lib/hudson")
f = namespace("/lib/form")
d = namespace("jelly:define")


f.section(title: "Groovy Hello World Builder") {
  f.entry(field: "useFrench", title: "French", description: "Check if we should say hello in French") {
    f.checkbox() 
  }
}
