package test

impl class C {
    impl var foo: Int
        get() = 1
        set(value) {}

    impl var bar: Int
        get() = 1
        set(value) {}
}

fun test(c: C) {
    c.foo
    c.foo = 1
    c.bar
    c.bar = 1
}