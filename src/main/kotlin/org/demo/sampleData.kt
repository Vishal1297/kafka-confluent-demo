package org.demo

import org.demo.model.Book

fun getRandomBook(): String {
    return Book().apply {
        this.author = getRandomString(7)
        this.title = getRandomString(12)
        this.totalPages = (400..1000).random().toString()
        this.category = getRandomString(5)
    }.toString()
}

fun getRandomString(length: Long): String {
    val allowedChars = ('A'..'Z') + ('a'..'z') + ('0'..'9')
    return (1..length).map { allowedChars.random() }.joinToString("")
}