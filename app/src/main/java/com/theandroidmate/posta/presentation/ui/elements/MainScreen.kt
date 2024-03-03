package com.theandroidmate.posta.presentation.ui.elements

import androidx.compose.foundation.layout.Arrangement.Absolute.spacedBy
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.theandroidmate.posta.model.FontWeightType
import com.theandroidmate.posta.model.Sentence
import com.theandroidmate.posta.presentation.theme.PostaTheme

@Composable
fun MainScreenComponent() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalArrangement = spacedBy(32.dp),
        horizontalAlignment = Alignment.End
    ) {
        PhraseComponent(
            sentences = listOf(
                Sentence("No sabia que ponerme,\n"),
                Sentence("y me puse "),
                Sentence("ansioso.", FontWeightType.BOLD, null)
            )
        )
        LogoComponent()
    }
}

@Preview(showBackground = true, widthDp = 300)
@Composable
fun PreviewMainScreen() {
    PostaTheme {
        MainScreenComponent()
    }
}