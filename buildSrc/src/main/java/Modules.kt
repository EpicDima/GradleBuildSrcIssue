object Modules {
    const val lib = ":library"
    const val libkts = ":librarykts"

    // the field name must be equal to the object name. it doesn't matter private or public.
    // if public, you can use the field instead of referring to object
    val dependencies = Dependencies

    object Dependencies {
        const val dep = ":dependency"
        const val depkts = ":dependencykts"
    }
}