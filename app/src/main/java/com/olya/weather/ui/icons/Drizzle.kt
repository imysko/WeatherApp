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

public val Icons.Drizzle: ImageVector
    get() {
        if (_drizzle != null) {
            return _drizzle!!
        }
        _drizzle = Builder(name = "Drizzle", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 960.0f, viewportHeight = 960.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(558.0f, 877.0f)
                quadToRelative(-11.0f, 5.0f, -23.5f, 1.0f)
                reflectiveQuadTo(517.0f, 863.0f)
                lineToRelative(-69.0f, -138.0f)
                quadToRelative(-5.0f, -11.0f, -1.5f, -23.5f)
                reflectiveQuadTo(461.0f, 684.0f)
                quadToRelative(11.0f, -5.0f, 23.5f, -1.0f)
                reflectiveQuadToRelative(17.5f, 15.0f)
                lineToRelative(69.0f, 138.0f)
                quadToRelative(5.0f, 11.0f, 1.5f, 23.5f)
                reflectiveQuadTo(558.0f, 877.0f)
                close()
                moveTo(798.0f, 876.0f)
                quadToRelative(-11.0f, 5.0f, -23.5f, 1.0f)
                reflectiveQuadTo(757.0f, 862.0f)
                lineToRelative(-69.0f, -138.0f)
                quadToRelative(-5.0f, -11.0f, -1.5f, -23.5f)
                reflectiveQuadTo(701.0f, 683.0f)
                quadToRelative(11.0f, -5.0f, 23.5f, -1.0f)
                reflectiveQuadToRelative(17.5f, 15.0f)
                lineToRelative(69.0f, 138.0f)
                quadToRelative(5.0f, 11.0f, 1.5f, 23.5f)
                reflectiveQuadTo(798.0f, 876.0f)
                close()
                moveTo(318.0f, 876.0f)
                quadToRelative(-11.0f, 5.0f, -23.5f, 1.5f)
                reflectiveQuadTo(277.0f, 863.0f)
                lineToRelative(-69.0f, -138.0f)
                quadToRelative(-5.0f, -11.0f, -1.0f, -23.5f)
                reflectiveQuadToRelative(15.0f, -17.5f)
                quadToRelative(11.0f, -5.0f, 23.5f, -1.5f)
                reflectiveQuadTo(263.0f, 697.0f)
                lineToRelative(69.0f, 139.0f)
                quadToRelative(5.0f, 11.0f, 1.0f, 23.0f)
                reflectiveQuadToRelative(-15.0f, 17.0f)
                close()
                moveTo(290.0f, 620.0f)
                quadToRelative(-87.0f, 0.0f, -148.5f, -61.5f)
                reflectiveQuadTo(80.0f, 410.0f)
                quadToRelative(0.0f, -79.0f, 56.5f, -141.0f)
                reflectiveQuadTo(277.0f, 201.0f)
                quadToRelative(32.0f, -56.0f, 84.5f, -88.5f)
                reflectiveQuadTo(480.0f, 80.0f)
                quadToRelative(91.0f, 0.0f, 152.5f, 57.5f)
                reflectiveQuadTo(708.0f, 280.0f)
                quadToRelative(79.0f, 4.0f, 125.5f, 53.5f)
                reflectiveQuadTo(880.0f, 450.0f)
                quadToRelative(0.0f, 70.0f, -49.5f, 120.0f)
                reflectiveQuadTo(710.0f, 620.0f)
                lineTo(290.0f, 620.0f)
                close()
                moveTo(290.0f, 560.0f)
                horizontalLineToRelative(420.0f)
                quadToRelative(46.0f, 0.0f, 78.0f, -32.5f)
                reflectiveQuadToRelative(32.0f, -77.5f)
                quadToRelative(0.0f, -46.0f, -32.0f, -78.0f)
                reflectiveQuadToRelative(-78.0f, -32.0f)
                horizontalLineToRelative(-60.0f)
                verticalLineToRelative(-30.0f)
                quadToRelative(0.0f, -71.0f, -49.5f, -120.5f)
                reflectiveQuadTo(480.0f, 140.0f)
                quadToRelative(-51.0f, 0.0f, -93.5f, 27.5f)
                reflectiveQuadTo(324.0f, 242.0f)
                lineToRelative(-8.0f, 18.0f)
                horizontalLineToRelative(-28.0f)
                quadToRelative(-62.0f, 2.0f, -105.0f, 45.5f)
                reflectiveQuadTo(140.0f, 410.0f)
                quadToRelative(0.0f, 62.0f, 44.0f, 106.0f)
                reflectiveQuadToRelative(106.0f, 44.0f)
                close()
                moveTo(480.0f, 350.0f)
                close()
            }
        }
        .build()
        return _drizzle!!
    }

private var _drizzle: ImageVector? = null
