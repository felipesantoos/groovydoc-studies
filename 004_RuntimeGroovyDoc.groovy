/**@
 * Some class groovydoc for Foo
 */
class Foo {
    /**@
     * Some method groovydoc for bar
     */
    void bar() {}
}

assert Foo.class.groovydoc.content.contains('Some class groovydoc for Foo')
assert Foo.class.getMethod('bar', new Class[0]).groovydoc.content.contains('Some method groovydoc for bar')

// Execute with `groovy -Dgroovy.attach.runtime.groovydoc=true 004_RuntimeGroovyDoc.groovy`
