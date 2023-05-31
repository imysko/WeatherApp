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

public val Icons.RainyShowers: ImageVector
    get() {
        if (_rainyShowers != null) {
            return _rainyShowers!!
        }
        _rainyShowers = Builder(name = "RainyShowers", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 960.0f, viewportHeight = 960.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(333.0f, 747.0f)
                quadToRelative(-11.0f, 6.0f, -23.0f, 2.0f)
                reflectiveQuadToRelative(-17.0f, -15.0f)
                lineTo(53.0f, 254.0f)
                quadToRelative(-5.0f, -11.0f, -1.5f, -23.5f)
                reflectiveQuadTo(66.0f, 213.0f)
                quadToRelative(11.0f, -5.0f, 23.5f, -1.5f)
                reflectiveQuadTo(107.0f, 226.0f)
                lineToRelative(240.0f, 480.0f)
                quadToRelative(5.0f, 11.0f, 1.0f, 23.0f)
                reflectiveQuadToRelative(-15.0f, 18.0f)
                close()
                moveTo(520.0f, 747.0f)
                quadToRelative(-11.0f, 6.0f, -23.0f, 2.0f)
                reflectiveQuadToRelative(-17.0f, -15.0f)
                lineTo(240.0f, 254.0f)
                quadToRelative(-5.0f, -11.0f, -1.5f, -23.5f)
                reflectiveQuadTo(253.0f, 213.0f)
                quadToRelative(11.0f, -5.0f, 23.0f, -1.5f)
                reflectiveQuadToRelative(17.0f, 14.5f)
                lineToRelative(241.0f, 480.0f)
                quadToRelative(5.0f, 11.0f, 1.0f, 23.0f)
                reflectiveQuadToRelative(-15.0f, 18.0f)
                close()
                moveTo(894.0f, 747.0f)
                quadToRelative(-11.0f, 5.0f, -23.5f, 1.0f)
                reflectiveQuadTo(853.0f, 733.0f)
                lineTo(613.0f, 253.0f)
                quadToRelative(-5.0f, -11.0f, -1.0f, -23.0f)
                reflectiveQuadToRelative(15.0f, -17.0f)
                quadToRelative(11.0f, -5.0f, 23.0f, -1.5f)
                reflectiveQuadToRelative(17.0f, 14.5f)
                lineToRelative(240.0f, 480.0f)
                quadToRelative(5.0f, 11.0f, 1.5f, 23.5f)
                reflectiveQuadTo(894.0f, 747.0f)
                close()
                moveTo(707.0f, 746.0f)
                quadToRelative(-11.0f, 6.0f, -23.0f, 2.0f)
                reflectiveQuadToRelative(-17.0f, -15.0f)
                lineTo(427.0f, 253.0f)
                quadToRelative(-5.0f, -11.0f, -1.5f, -23.0f)
                reflectiveQuadToRelative(14.5f, -17.0f)
                quadToRelative(11.0f, -5.0f, 23.0f, -1.5f)
                reflectiveQuadToRelative(17.0f, 14.5f)
                lineToRelative(241.0f, 480.0f)
                quadToRelative(5.0f, 11.0f, 1.0f, 22.5f)
                reflectiveQuadTo(707.0f, 746.0f)
                close()
            }
        }
        .build()
        return _rainyShowers!!
    }

private var _rainyShowers: ImageVector? = null
