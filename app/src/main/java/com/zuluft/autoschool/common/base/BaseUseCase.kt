package com.zuluft.autoschool.common.base

import com.zuluft.autoschool.domain.repository.Repository

abstract class BaseUseCase<ArgType, ReturnType>
constructor(protected val repository: Repository) {

    abstract fun createObservable(arg: ArgType? = null): ReturnType
}