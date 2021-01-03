package Days.day9

import java.lang.StringBuilder

//LastChar
var StringBuilder.lastChar:Char
    get() = get(length - 1)
    set(value) {
        this.setCharAt(length - 1, value)
    }