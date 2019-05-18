package com.ericschlenz.sistebbins

class Output {
    companion object {
        fun explain(message: String) = println(
            "=================================\n-> $message\n================================\n")
    }
}