package by.gavr.hierarhy.view

open class View {
    fun click() {
        println("View clicked")
    }
}

open class TextView(s: String) : View() {
    val text = "Text from TextView"
}