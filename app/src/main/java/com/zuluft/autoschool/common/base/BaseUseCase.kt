package com.zuluft.autoschool.common.base

import com.zuluft.autoschool.domain.repository.Repository
import com.zuluft.mvvm.usecases.BaseUseCase

abstract class BaseUseCase<ARG_TYPE, RETURN_TYPE>(repository: Repository) :
    BaseUseCase<Repository, ARG_TYPE, RETURN_TYPE>(repository)