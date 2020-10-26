package com.example.interactrestapiapp.repository.auth

import com.example.interactrestapiapp.api.auth.OpenApiAuthService
import com.example.interactrestapiapp.persistance.AccountPropertiesDao
import com.example.interactrestapiapp.persistance.AuthTokenDao
import com.example.interactrestapiapp.session.SessionManager

class AuthRepository
constructor(
    val authTokenDao: AuthTokenDao,
    val accountPropertiesDao: AccountPropertiesDao,
    val openApiAuthService: OpenApiAuthService,
    val sessionManager: SessionManager
){
}