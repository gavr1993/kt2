package by.gavr.hierarhy

import by.gavr.hierarhy.view.TextView
import by.gavr.hierarhy.view.ViewGroup
import by.gavr.hierarhy.widget.Button

fun main() {
    val main = ViewGroup()
    val title = TextView("Main Screen")
    main.addView(title)

    val content = ViewGroup()
    val readMore = Button("Read more")
    content.addView(readMore)
}