package com.zuluft.autoschool.common.base

class TransientValue<T> constructor(private var value: T) {

    private var isAlreadyUsed: Boolean = false

    fun getValue(): T? {
        return if (isAlreadyUsed) {
            null
        } else {
            value
        }
    }
}