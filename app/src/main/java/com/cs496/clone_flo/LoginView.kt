package com.cs496.clone_flo

interface LoginView {
    fun onLoginSuccess(code : Int, result : Result)
    fun onLoginFailure()
}