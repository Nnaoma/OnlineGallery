package com.virtual.onlinegallery.api

import com.virtual.onlinegallery.data.UnsplashPhoto

data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)