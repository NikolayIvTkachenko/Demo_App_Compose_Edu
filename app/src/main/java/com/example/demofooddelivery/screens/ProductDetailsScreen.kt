package com.example.demofooddelivery.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.demofooddelivery.data.OrderData
import com.example.demofooddelivery.data.OrderState
import com.example.demofooddelivery.data.ProductDescriptionData
import com.example.demofooddelivery.data.ProductFlavourData
import com.example.demofooddelivery.data.ProductFlavourState
import com.example.demofooddelivery.data.ProductNutritionState
import com.example.demofooddelivery.data.ProductPreviewState
import com.example.demofooddelivery.data.ProductionNutritionData
import com.example.demofooddelivery.screens.components.FlavorDelivery
import com.example.demofooddelivery.screens.components.OrderActionBar
import com.example.demofooddelivery.screens.components.ProductDescriptionSection
import com.example.demofooddelivery.screens.components.ProductNutritionSection
import com.example.demofooddelivery.screens.components.ProductPreviewSection

@Composable
fun ProductDetailsScreen(
    modifier: Modifier = Modifier,
    productPreviewState: ProductPreviewState = ProductPreviewState(),
    productFlavours: List<ProductFlavourState> = ProductFlavourData,
    productNutritionState: ProductNutritionState = ProductionNutritionData,
    productDescription: String = ProductDescriptionData,
    orderState: OrderState = OrderData,
    onAddItemClicked: () -> Unit = {},
    onRemoveItemClicked: () -> Unit = {},
    onCheckOutClicked: () -> Unit = {},
) {
    Box(
        modifier = modifier.fillMaxWidth(),
        contentAlignment = Alignment.BottomCenter,
    ) {
        Content(
            modifier = modifier,
            productPreviewState = productPreviewState,
            productFlavours = productFlavours,
            productNutritionState = productNutritionState,
            productDescription = productDescription,
        )
        OrderActionBar(
            state = orderState,
            onAddItemClicked = onAddItemClicked,
            onRemoveItemClicked = onRemoveItemClicked,
            onCheckOutClicked = onCheckOutClicked,
            modifier = Modifier
                .navigationBarsPadding()
                .padding(
                    horizontal = 18.dp,
                    vertical = 8.dp
                )
        )
    }
}

@Composable
private fun Content(
    modifier: Modifier = Modifier,
    productPreviewState: ProductPreviewState,
    productFlavours: List<ProductFlavourState>,
    productNutritionState: ProductNutritionState,
    productDescription: String,
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
            modifier = Modifier.padding(horizontal = 18.dp),
            data = productFlavours,
        )
        Spacer(
            modifier = Modifier.height(16.dp)
        )
        ProductNutritionSection(
            modifier = Modifier
                .padding(horizontal = 18.dp),
            state = productNutritionState,
        )
        Spacer(
            modifier = Modifier.height(32.dp)
        )
        ProductDescriptionSection(
            productDescription = productDescription,
            modifier = Modifier
                .navigationBarsPadding()
                .padding(horizontal = 18.dp)
                .padding(bottom = 128.dp)
        )
    }
}