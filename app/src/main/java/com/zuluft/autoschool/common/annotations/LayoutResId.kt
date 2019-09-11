package com.zuluft.autoschool.common.annotations


@Target(AnnotationTarget.ANNOTATION_CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class LayoutResId(
    val value: Int
)