package com.example.demofooddelivery.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.demofooddelivery.data.ProductPreviewState
import com.example.demofooddelivery.screens.components.FlavorDelivery
import com.example.demofooddelivery.screens.components.ProductPreviewSection

@Composable
fun ProductDetailsScreen(
    modifier: Modifier = Modifier,
    productPreviewState: ProductPreviewState = ProductPreviewState()
) {
    val scrollableState = rememberScrollState()
    Column(
        modifier = modifier.verticalScroll(scrollableState)
    ) {
        ProductPreviewSection(
            state = productPreviewState
        )
        Spacer(
            modifier = Modifier.height(16.dp)
        )
        FlavorDelivery(
            modifier = Modifier.padding(18.dp)
        )
    }
}