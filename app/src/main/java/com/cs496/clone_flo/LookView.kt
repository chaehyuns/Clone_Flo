package com.cs496.clone_flo

interface LookView {
    fun onGetSongLoading()
    fun onGetSongSuccess(code: Int, result: FloChartResult)
    fun onGetSongFailure(code: Int, message: String)
}