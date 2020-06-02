package com.jmarkstar.common

import platform.UIKit.UIDevice

private val systemName = UIDevice.currentDevice.systemName
private val systemVersion = UIDevice.currentDevice.systemVersion
private val name = UIDevice.currentDevice.name

actual fun getPlatformName(): String = "$systemName $systemVersion $name"