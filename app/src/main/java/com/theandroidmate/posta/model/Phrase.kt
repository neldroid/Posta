package com.theandroidmate.posta.model

data class Phrase(
    val sentences: List<Sentence>
) {
    constructor() : this(emptyList())
}
