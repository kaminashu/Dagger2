package www.uzmd.dagger2.pacage1

class Activity {
    lateinit var unversitet: Universitet

    init {
        val component = Component()
        component.inject(this)
    }
}