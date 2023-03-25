object Modules {
    const val lib = ":library"
    const val libkts = ":librarykts"

    // works only for build.gradle (does not work with buidl.gradle.kts)
    val Dependencies = object {
        val dep = ":dependency"
        val depkts = ":dependencykts"
    }
}