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

public val Icons.PartlyCloudy: ImageVector
    get() {
        if (_partlyCloudy != null) {
            return _partlyCloudy!!
        }
        _partlyCloudy = Builder(name = "PartlyCloudy", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 960.0f, viewportHeight = 960.0f).apply {
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
                quadToRelative(-9.0f, -9.0f, -9.0f, -21.5f)
                reflectiveQuadToRelative(9.0f, -21.5f)
                lineToRelative(63.0f, -63.0f)
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
                moveTo(749.0f, 791.0f)
                lineTo(686.0f, 728.0f)
                quadToRelative(-9.0f, -9.0f, -9.0f, -21.5f)
                reflectiveQuadToRelative(9.0f, -21.5f)
                quadToRelative(9.0f, -9.0f, 21.5f, -9.0f)
                reflectiveQuadToRelative(21.5f, 9.0f)
                lineToRelative(63.0f, 63.0f)
                quadToRelative(9.0f, 9.067f, 9.0f, 21.533f)
                quadTo(801.0f, 782.0f, 791.947f, 791.0f)
                quadToRelative(-9.052f, 9.0f, -21.5f, 9.0f)
                quadTo(758.0f, 800.0f, 749.0f, 791.0f)
                close()
                moveTo(233.0f, 275.0f)
                lineToRelative(-64.0f, -64.0f)
                quadToRelative(-9.0f, -9.0f, -9.0f, -21.0f)
                reflectiveQuadToRelative(9.0f, -21.0f)
                quadToRelative(8.8f, -9.0f, 20.9f, -9.0f)
                quadToRelative(12.1f, 0.0f, 21.1f, 9.0f)
                lineToRelative(64.0f, 64.0f)
                quadToRelative(9.0f, 9.0f, 9.0f, 21.0f)
                reflectiveQuadToRelative(-9.0f, 21.0f)
                quadToRelative(-9.0f, 9.0f, -21.0f, 9.0f)
                reflectiveQuadToRelative(-21.0f, -9.0f)
                close()
                moveTo(240.0f, 780.0f)
                horizontalLineToRelative(180.0f)
                quadToRelative(33.333f, 0.0f, 56.667f, -23.265f)
                quadTo(500.0f, 733.471f, 500.0f, 700.235f)
                quadTo(500.0f, 667.0f, 477.237f, 643.0f)
                quadTo(454.475f, 619.0f, 421.0f, 619.0f)
                horizontalLineToRelative(-44.0f)
                lineToRelative(-18.0f, -41.0f)
                quadToRelative(-15.145f, -35.75f, -47.6f, -56.875f)
                reflectiveQuadTo(240.0f, 500.0f)
                quadToRelative(-58.333f, 0.0f, -99.167f, 40.765f)
                quadToRelative(-40.833f, 40.764f, -40.833f, 99.0f)
                quadTo(100.0f, 698.0f, 140.833f, 739.0f)
                quadToRelative(40.834f, 41.0f, 99.167f, 41.0f)
                close()
                moveTo(240.0f, 840.0f)
                quadToRelative(-83.0f, 0.0f, -141.5f, -58.5f)
                reflectiveQuadTo(40.0f, 640.0f)
                quadToRelative(0.0f, -83.0f, 58.5f, -141.5f)
                reflectiveQuadTo(240.0f, 440.0f)
                quadToRelative(57.736f, 0.0f, 105.368f, 32.5f)
                reflectiveQuadTo(416.0f, 559.0f)
                quadToRelative(60.117f, 0.0f, 101.058f, 43.589f)
                quadTo(558.0f, 646.178f, 558.0f, 707.0f)
                quadToRelative(-5.0f, 56.0f, -44.033f, 94.5f)
                quadTo(474.935f, 840.0f, 420.0f, 840.0f)
                lineTo(240.0f, 840.0f)
                close()
                moveTo(558.0f, 707.0f)
                quadToRelative(-3.0f, -15.385f, -6.0f, -30.0f)
                reflectiveQuadToRelative(-6.0f, -30.0f)
                quadToRelative(52.0f, -20.0f, 83.0f, -65.538f)
                quadToRelative(31.0f, -45.539f, 31.0f, -101.324f)
                quadTo(660.0f, 405.0f, 607.5f, 352.5f)
                reflectiveQuadTo(480.0f, 300.0f)
                quadToRelative(-67.215f, 0.0f, -117.627f, 42.674f)
                quadTo(311.962f, 385.348f, 303.0f, 451.0f)
                quadToRelative(-16.0f, -3.0f, -31.5f, -5.5f)
                reflectiveQuadTo(240.0f, 440.0f)
                quadToRelative(14.0f, -88.0f, 82.5f, -144.0f)
                reflectiveQuadTo(480.0f, 240.0f)
                quadToRelative(100.0f, 0.0f, 170.0f, 70.0f)
                reflectiveQuadToRelative(70.0f, 170.342f)
                quadTo(720.0f, 558.0f, 675.5f, 620.0f)
                quadTo(631.0f, 682.0f, 558.0f, 707.0f)
                close()
                moveTo(481.0f, 480.0f)
                close()
            }
        }
        .build()
        return _partlyCloudy!!
    }

private var _partlyCloudy: ImageVector? = null
