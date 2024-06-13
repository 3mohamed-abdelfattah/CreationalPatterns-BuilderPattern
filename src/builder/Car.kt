package builder

data class Car constructor(var color: String, var license: String, var brand: String) {

    private constructor(builder: Builder) : this(
        builder.color, builder.license, builder.brand
    )

    class Builder {

        lateinit var color: String
        lateinit var license: String
        lateinit var brand: String

        fun color(init: Builder.() -> String) = apply { color = init() }
        fun license(init: Builder.() -> String) = apply { license = init() }
        fun brand(init: Builder.() -> String) = apply { brand = init() }

    }

    companion object {
        fun build(init: Builder.() -> Unit) = Car(Builder().apply(init))
    }
}
