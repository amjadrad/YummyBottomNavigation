package ir.ffaa00.yummy_bottomnav;

import android.graphics.RectF
import android.graphics.drawable.Drawable

data class BottomBarItem(
        val icon: Drawable,
        var title: String,
        var rect: RectF = RectF(),
        var alpha: Int
)
