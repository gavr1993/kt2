package by.gavr.profile

import profile.model.Profile

fun main() {
    val profile = Profile(1, "gavr93", "Антон", "Гаврильчук", "online", 2737)
    println(profile.fullName)
}