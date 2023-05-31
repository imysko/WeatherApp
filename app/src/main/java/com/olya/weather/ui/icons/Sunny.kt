package com.olya.weather.ui.icons

import androidx.compose.material.icons.Icons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val Icons.Sunny: ImageVector
    get() {
        if (_sunny != null) {
            return _sunny!!
        }
        _sunny = Builder(name = "Sunny", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 960.0f, viewportHeight = 960.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(479.825f, 190.0f)
                quadTo(467.0f, 190.0f, 458.5f, 181.375f)
                reflectiveQuadTo(450.0f, 160.0f)
                verticalLineToRelative(-90.0f)
                quadToRelative(0.0f, -12.75f, 8.675f, -21.375f)
                quadToRelative(8.676f, -8.625f, 21.5f, -8.625f)
                quadToRelative(12.825f, 0.0f, 21.325f, 8.625f)
                reflectiveQuadTo(510.0f, 70.0f)
                verticalLineToRelative(90.0f)
                quadToRelative(0.0f, 12.75f, -8.675f, 21.375f)
                quadToRelative(-8.676f, 8.625f, -21.5f, 8.625f)
                close()
                moveTo(685.0f, 275.0f)
                quadToRelative(-9.0f, -9.0f, -9.0f, -21.1f)
                quadToRelative(0.0f, -12.1f, 9.0f, -20.9f)
                lineToRelative(63.0f, -64.0f)
                quadToRelative(9.067f, -9.0f, 21.533f, -9.0f)
                quadTo(782.0f, 160.0f, 791.0f, 169.0f)
                quadToRelative(9.0f, 9.0f, 9.0f, 21.0f)
                reflectiveQuadToRelative(-9.0f, 21.0f)
                lineToRelative(-64.0f, 64.0f)
                quadToRelative(-9.0f, 9.0f, -21.0f, 9.0f)
                reflectiveQuadToRelative(-21.0f, -9.0f)
                close()
                moveTo(800.0f, 510.0f)
                quadToRelative(-12.75f, 0.0f, -21.375f, -8.675f)
                quadToRelative(-8.625f, -8.676f, -8.625f, -21.5f)
                quadToRelative(0.0f, -12.825f, 8.625f, -21.325f)
                reflectiveQuadTo(800.0f, 450.0f)
                horizontalLineToRelative(90.0f)
                quadToRelative(12.75f, 0.0f, 21.375f, 8.675f)
                quadToRelative(8.625f, 8.676f, 8.625f, 21.5f)
                quadToRelative(0.0f, 12.825f, -8.625f, 21.325f)
                reflectiveQuadTo(890.0f, 510.0f)
                horizontalLineToRelative(-90.0f)
                close()
                moveTo(479.825f, 920.0f)
                quadTo(467.0f, 920.0f, 458.5f, 911.375f)
                reflectiveQuadTo(450.0f, 890.0f)
                verticalLineToRelative(-90.0f)
                quadToRelative(0.0f, -12.75f, 8.675f, -21.375f)
                quadToRelative(8.676f, -8.625f, 21.5f, -8.625f)
                quadToRelative(12.825f, 0.0f, 21.325f, 8.625f)
                reflectiveQuadTo(510.0f, 800.0f)
                verticalLineToRelative(90.0f)
                quadToRelative(0.0f, 12.75f, -8.675f, 21.375f)
                quadTo(492.649f, 920.0f, 479.825f, 920.0f)
                close()
                moveTo(233.0f, 275.0f)
                lineToRelative(-64.0f, -63.0f)
                quadToRelative(-9.0f, -8.87f, -9.0f, -21.435f)
                reflectiveQuadTo(169.391f, 169.0f)
                quadTo(178.0f, 160.0f, 190.0f, 160.0f)
                quadToRelative(12.0f, 0.0f, 21.0f, 9.0f)
                lineToRelative(64.0f, 64.0f)
                quadToRelative(9.0f, 9.0f, 9.0f, 21.0f)
                reflectiveQuadToRelative(-9.0f, 21.0f)
                quadToRelative(-9.273f, 8.0f, -21.636f, 8.0f)
                quadTo(241.0f, 283.0f, 233.0f, 275.0f)
                close()
                moveTo(749.0f, 791.0f)
                lineTo(685.0f, 727.0f)
                quadToRelative(-9.0f, -8.8f, -9.0f, -20.9f)
                quadToRelative(0.0f, -12.1f, 9.0f, -21.1f)
                quadToRelative(8.25f, -8.0f, 20.625f, -8.0f)
                reflectiveQuadTo(727.0f, 685.0f)
                lineToRelative(65.0f, 63.0f)
                quadToRelative(9.0f, 9.0f, 8.629f, 21.603f)
                quadToRelative(-0.37f, 12.604f, -8.526f, 21.5f)
                quadToRelative(-8.896f, 8.897f, -21.5f, 8.897f)
                quadTo(758.0f, 800.0f, 749.0f, 791.0f)
                close()
                moveTo(70.0f, 510.0f)
                quadToRelative(-12.75f, 0.0f, -21.375f, -8.675f)
                quadTo(40.0f, 492.649f, 40.0f, 479.825f)
                quadTo(40.0f, 467.0f, 48.625f, 458.5f)
                reflectiveQuadTo(70.0f, 450.0f)
                horizontalLineToRelative(90.0f)
                quadToRelative(12.75f, 0.0f, 21.375f, 8.675f)
                quadToRelative(8.625f, 8.676f, 8.625f, 21.5f)
                quadToRelative(0.0f, 12.825f, -8.625f, 21.325f)
                reflectiveQuadTo(160.0f, 510.0f)
                lineTo(70.0f, 510.0f)
                close()
                moveTo(169.0f, 790.609f)
                quadTo(160.0f, 782.0f, 160.0f, 770.0f)
                quadToRelative(0.0f, -12.0f, 9.0f, -21.0f)
                lineToRelative(64.0f, -64.0f)
                quadToRelative(8.25f, -8.0f, 20.625f, -8.0f)
                reflectiveQuadTo(275.0f, 685.25f)
                quadToRelative(9.0f, 9.0f, 9.0f, 21.375f)
                reflectiveQuadTo(275.0f, 728.0f)
                lineToRelative(-63.0f, 63.0f)
                quadToRelative(-8.87f, 9.0f, -21.435f, 9.0f)
                reflectiveQuadTo(169.0f, 790.609f)
                close()
                moveTo(480.0f, 720.0f)
                quadToRelative(-100.0f, 0.0f, -170.0f, -70.0f)
                reflectiveQuadToRelative(-70.0f, -170.0f)
                quadToRelative(0.0f, -100.0f, 70.0f, -170.0f)
                reflectiveQuadToRelative(170.0f, -70.0f)
                quadToRelative(100.0f, 0.0f, 170.0f, 70.0f)
                reflectiveQuadToRelative(70.0f, 170.0f)
                quadToRelative(0.0f, 100.0f, -70.0f, 170.0f)
                reflectiveQuadToRelative(-170.0f, 70.0f)
                close()
                moveTo(480.0f, 660.0f)
                quadToRelative(75.0f, 0.0f, 127.5f, -52.5f)
                reflectiveQuadTo(660.0f, 480.0f)
                quadToRelative(0.0f, -75.0f, -52.5f, -127.5f)
                reflectiveQuadTo(480.0f, 300.0f)
                quadToRelative(-75.0f, 0.0f, -127.5f, 52.5f)
                reflectiveQuadTo(300.0f, 480.0f)
                quadToRelative(0.0f, 75.0f, 52.5f, 127.5f)
                reflectiveQuadTo(480.0f, 660.0f)
                close()
                moveTo(480.0f, 480.0f)
                close()
            }
        }
        .build()
        return _sunny!!
    }

private var _sunny: ImageVector? = null
