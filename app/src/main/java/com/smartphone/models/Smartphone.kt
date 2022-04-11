package com.smartphone.models

import java.io.Serializable

data class Smartphone(
    var name: String,
    var model: String,
    var price: String,
    var color: String,
    val urls: Array<String>
) : Serializable