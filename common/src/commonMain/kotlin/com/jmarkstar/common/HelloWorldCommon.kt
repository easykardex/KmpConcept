package com.jmarkstar.common

fun helloWorld(): String = "Hello, ${getPlatformName()}!"

expect fun getPlatformName(): String
