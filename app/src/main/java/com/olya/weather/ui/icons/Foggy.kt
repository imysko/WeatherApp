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

public val Icons.Foggy: ImageVector
    get() {
        if (_foggy != null) {
            return _foggy!!
        }
        _foggy = Builder(name = "Foggy", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 960.0f, viewportHeight = 960.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(720.0f, 755.0f)
                quadToRelative(-14.0f, 0.0f, -24.5f, -10.5f)
                reflectiveQuadTo(685.0f, 720.0f)
                quadToRelative(0.0f, -14.0f, 10.5f, -24.5f)
                reflectiveQuadTo(720.0f, 685.0f)
                quadToRelative(14.0f, 0.0f, 24.5f, 10.5f)
                reflectiveQuadTo(755.0f, 720.0f)
                quadToRelative(0.0f, 14.0f, -10.5f, 24.5f)
                reflectiveQuadTo(720.0f, 755.0f)
                close()
                moveTo(280.0f, 880.0f)
                quadToRelative(-14.0f, 0.0f, -24.5f, -10.5f)
                reflectiveQuadTo(245.0f, 845.0f)
                quadToRelative(0.0f, -14.0f, 10.5f, -24.5f)
                reflectiveQuadTo(280.0f, 810.0f)
                quadToRelative(14.0f, 0.0f, 24.5f, 10.5f)
                reflectiveQuadTo(315.0f, 845.0f)
                quadToRelative(0.0f, 14.0f, -10.5f, 24.5f)
                reflectiveQuadTo(280.0f, 880.0f)
                close()
                moveTo(240.0f, 755.0f)
                quadToRelative(-14.0f, 0.0f, -24.5f, -10.5f)
                reflectiveQuadTo(205.0f, 720.0f)
                quadToRelative(0.0f, -14.0f, 10.5f, -24.5f)
                reflectiveQuadTo(240.0f, 685.0f)
                horizontalLineToRelative(360.0f)
                quadToRelative(14.0f, 0.0f, 24.5f, 10.5f)
                reflectiveQuadTo(635.0f, 720.0f)
                quadToRelative(0.0f, 14.0f, -10.5f, 24.5f)
                reflectiveQuadTo(600.0f, 755.0f)
                lineTo(240.0f, 755.0f)
                close()
                moveTo(400.0f, 880.0f)
                quadToRelative(-14.0f, 0.0f, -24.5f, -10.5f)
                reflectiveQuadTo(365.0f, 845.0f)
                quadToRelative(0.0f, -14.0f, 10.5f, -24.5f)
                reflectiveQuadTo(400.0f, 810.0f)
                horizontalLineToRelative(280.0f)
                quadToRelative(14.0f, 0.0f, 24.5f, 10.5f)
                reflectiveQuadTo(715.0f, 845.0f)
                quadToRelative(0.0f, 14.0f, -10.5f, 24.5f)
                reflectiveQuadTo(680.0f, 880.0f)
                lineTo(400.0f, 880.0f)
                close()
                moveTo(290.0f, 620.0f)
                quadToRelative(-86.864f, 0.0f, -148.432f, -61.52f)
                quadTo(80.0f, 496.96f, 80.0f, 410.165f)
                quadTo(80.0f, 331.0f, 136.5f, 269.0f)
                quadTo(193.0f, 207.0f, 277.0f, 201.0f)
                quadToRelative(32.0f, -56.0f, 84.5f, -88.5f)
                reflectiveQuadTo(480.423f, 80.0f)
                quadTo(571.0f, 80.0f, 632.5f, 137.5f)
                reflectiveQuadTo(708.0f, 280.0f)
                quadToRelative(79.0f, 4.0f, 125.5f, 53.5f)
                reflectiveQuadTo(880.0f, 449.623f)
                quadTo(880.0f, 520.0f, 830.417f, 570.0f)
                quadTo(780.833f, 620.0f, 710.0f, 620.0f)
                lineTo(290.0f, 620.0f)
                close()
                moveTo(290.0f, 560.0f)
                horizontalLineToRelative(420.0f)
                quadToRelative(46.2f, 0.0f, 78.1f, -32.5f)
                quadToRelative(31.9f, -32.5f, 31.9f, -78.0f)
                reflectiveQuadTo(788.1f, 372.0f)
                quadToRelative(-31.9f, -32.0f, -78.1f, -32.0f)
                horizontalLineToRelative(-60.0f)
                verticalLineToRelative(-30.0f)
                quadToRelative(0.0f, -71.0f, -49.5f, -120.5f)
                reflectiveQuadTo(480.212f, 140.0f)
                quadToRelative(-51.481f, 0.0f, -93.847f, 27.5f)
                quadTo(344.0f, 195.0f, 324.0f, 242.0f)
                lineToRelative(-8.0f, 18.0f)
                horizontalLineToRelative(-28.0f)
                quadToRelative(-62.0f, 2.0f, -105.0f, 45.393f)
                reflectiveQuadToRelative(-43.0f, 104.464f)
                quadTo(140.0f, 472.0f, 183.929f, 516.0f)
                quadTo(227.857f, 560.0f, 290.0f, 560.0f)
                close()
                moveTo(480.0f, 350.0f)
                close()
            }
        }
        .build()
        return _foggy!!
    }

private var _foggy: ImageVector? = null
