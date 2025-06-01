package com.example.demofooddelivery.data

import androidx.annotation.DrawableRes
import com.example.demofooddelivery.R

data class ProductHighlightState(
    val text: String,
    val type: ProductionHighlightType
)

enum class ProductionHighlightType {
    PRIMARY, SECONDARY
}

data class ProductPreviewState(
    val headline: String = "Item Component",
    @DrawableRes val productImg: Int = R.drawable.img_burger_02,
    val hightlights: List<ProductHighlightState> = listOf(
        ProductHighlightState(
            text = "Classic type",
            type = ProductionHighlightType.SECONDARY
        ),
        ProductHighlightState(
            text = "Best Seller",
            type = ProductionHighlightType.PRIMARY
        ),
    )
)
