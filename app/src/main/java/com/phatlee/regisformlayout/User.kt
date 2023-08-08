package com.phatlee.regisformlayout

import java.io.Serializable

data class User(
    val title: String,
    val firstname: String,
    val lastname: String,
    val phone: String,
    val email: String,
    val password: String
):Serializable
