package com.example.interactrestapiapp.ui.auth

import androidx.lifecycle.ViewModel
import com.example.interactrestapiapp.repository.auth.AuthRepository

class AuthViewModel
constructor(
    val authRepository: AuthRepository
):ViewModel(){
}