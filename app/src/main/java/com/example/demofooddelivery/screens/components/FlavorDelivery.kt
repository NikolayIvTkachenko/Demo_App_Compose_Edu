package com.example.demofooddelivery.screens.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.demofooddelivery.ui.theme.AppTheme

@Composable
fun FlavorDelivery(
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier,
    ) {
        SectionHeader(
            title = "Add More Item",
            emotion = "\uD83E\uDD29"
        )
    }
}

@Composable
private fun SectionHeader(
    modifier: Modifier = Modifier,
    title: String,
    emotion: String,
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Text(
            text = title,
            style = AppTheme.typography.titleLarge,
            color = AppTheme.colors.onBackground
        )
        Text(
            text = title,
            style = AppTheme.typography.titleLarge,
        )
    }
}