package com.example.interactrestapiapp.session

import android.app.Application
import com.example.interactrestapiapp.persistance.AuthTokenDao

class SessionManager
constructor(
    val authTokenDao: AuthTokenDao,
    val application: Application
){

}