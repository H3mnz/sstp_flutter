package com.example.sstp_flutter.extension


internal fun Byte.toIntAsUByte(): Int {
    return this.toInt() and 0x000000FF
}
