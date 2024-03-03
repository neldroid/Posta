package com.theandroidmate.posta.presentation.ui.elements

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.theandroidmate.posta.R

@Composable
fun LogoComponent() =
    Text(text = buildAnnotatedString {
        withStyle(style = SpanStyle(fontWeight = FontWeight.Light, fontSize = 6.sp)) {
            append(stringResource(id = R.string.by))
        }
        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, fontSize = 6.sp)) {
            append(stringResource(id = R.string.app_name))
        }
    }, fontFamily = FontFamily.Serif)

@Preview
@Composable
fun PreviewLogo(){
    LogoComponent()
}
