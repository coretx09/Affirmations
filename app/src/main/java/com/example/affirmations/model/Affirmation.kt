package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/** Class de donnes pour  modéliser (ou représenter) les données.
 * avec un parametre [stringResourceId] de type Int**/
data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)
