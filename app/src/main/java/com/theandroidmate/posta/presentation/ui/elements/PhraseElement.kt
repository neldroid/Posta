package com.theandroidmate.posta.presentation.ui.elements

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.em
import com.theandroidmate.posta.model.FontWeightType
import com.theandroidmate.posta.model.Sentence
import com.theandroidmate.posta.presentation.theme.PostaTheme

@Composable
fun PhraseComponent(sentences: List<Sentence>) {
    Text(
        text = buildAnnotatedString {
            sentences.forEach { sentence ->
                withStyle(
                    parseSpanStyle(sentence.brush, sentence.fontWeight)
                ) {
                    append(sentence.text)
                }
            }
        },
        modifier = Modifier.fillMaxWidth(),
        style = LocalTextStyle.current.merge(
            TextStyle(
                lineHeight = 1.5.em,
                lineHeightStyle = LineHeightStyle(
                    alignment = LineHeightStyle.Alignment.Center,
                    trim = LineHeightStyle.Trim.None
                )
            )
        )
    )
}

@OptIn(ExperimentalTextApi::class)
private fun parseSpanStyle(brush: List<Long>?, fontWeight: FontWeightType?) = SpanStyle(
    brush = if (!brush.isNullOrEmpty()) {
        Brush.linearGradient(
            colors = brush.map { Color(it) }
        )
    } else {
        null
    },
    fontWeight = when (fontWeight) {
        FontWeightType.NORMAL -> FontWeight.Normal
        FontWeightType.BOLD -> FontWeight.Bold
        FontWeightType.LIGHT -> FontWeight.Light
        else -> null
    }
)

@Preview(showBackground = true)
@Composable
fun PhrasePreview() {
    PostaTheme {
        val sentence1 = Sentence(
            "Test sentence 1\n",
            FontWeightType.BOLD,
            listOf(0xFF00FF00, 0xFF0000FF, 0xFFFF0000)
        )
        val sentence2 = Sentence(
            "Test sentence 2"
        )
        PhraseComponent(listOf(sentence1, sentence2))
    }
}