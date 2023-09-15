package groovy

/*
 * Groovy can be used as a scripting language,
 * but its code is always compiled to bytecode on the fly
 * and an in-memory wrapper class is generated for a script.
 */
println this
assert this.toString().startsWith("groovy.script@")
