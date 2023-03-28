object Modules {
    const val lib = ":library"
    const val libkts = ":librarykts"

    @JvmField
    val Dependencies = _Dependencies

    object _Dependencies {
        const val dep = ":dependency"
        const val depkts = ":dependencykts"
    }
}