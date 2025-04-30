package me.fabiansuarez.cambiarfontsjetpackcompse.ui.theme

import androidx.compose.animation.core.TwoWayConverter
import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import me.fabiansuarez.cambiarfontsjetpackcompse.R

//crear la fuente de manrope
val manropeFamily = FontFamily(
    Font(R.font.manrope_regular),
    Font(R.font.manrope_bold, FontWeight.Bold),
    Font(R.font.manrope_regular, FontWeight.Normal),
    Font(R.font.manrope_light, FontWeight.Light),
    Font(R.font.manrope_medium, FontWeight.Medium),
    Font(R.font.manrope_semibold, FontWeight.SemiBold),
    Font(R.font.manrope_extrabold, FontWeight.ExtraBold),
    Font(R.font.manrope_extralight, FontWeight.ExtraLight),
)


// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily =manropeFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)

val MiTypography = Typography(
    displayLarge = TextStyle(fontFamily = manropeFamily),
    displayMedium = TextStyle(fontFamily = manropeFamily),
    displaySmall = TextStyle(fontFamily = manropeFamily),
    headlineLarge = TextStyle(fontFamily = manropeFamily),
    headlineMedium = TextStyle(fontFamily = manropeFamily),
    headlineSmall = TextStyle(fontFamily = manropeFamily),
    titleLarge = TextStyle(fontFamily = manropeFamily),
    titleMedium = TextStyle(fontFamily = manropeFamily),
    titleSmall = TextStyle(fontFamily = manropeFamily),
    bodyLarge = TextStyle(fontFamily = manropeFamily),
    bodyMedium = TextStyle(fontFamily = manropeFamily),
    bodySmall = TextStyle(fontFamily = manropeFamily),
    labelLarge = TextStyle(fontFamily = manropeFamily),
    labelMedium = TextStyle(fontFamily = manropeFamily),
    labelSmall = TextStyle(fontFamily = manropeFamily)
)
