package com.theandroidmate.posta.model

data class Sentence(
    val text: String,
    val fontWeight: FontWeightType?,
    val brush: List<Long>?
) {
    constructor() : this("", null, null)

    constructor(text: String): this(text, null, null)
}

enum class FontWeightType {
    NORMAL, BOLD, LIGHT
}
