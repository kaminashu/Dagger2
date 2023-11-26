package www.uzmd.dagger2.pacage1

class Component {
    private fun getUniversitet(): Universitet {
        val bosqichi = Bosqichi()
        val guruhlar = Guruhlar()
        val ismFamiliasi = IsmFamiliasi()
        val talabalar = Talabalar(ismFamiliasi, guruhlar, bosqichi)
        val dekanat = Dekanat()
        return Universitet(talabalar, dekanat)
    }

    fun inject(activity: Activity) {
        activity.unversitet = getUniversitet()
    }
}