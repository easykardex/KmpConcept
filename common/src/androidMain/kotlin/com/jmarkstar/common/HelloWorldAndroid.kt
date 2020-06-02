package com.jmarkstar.common

import android.os.Build

actual fun getPlatformName(): String = "Android ${Build.VERSION.RELEASE}"