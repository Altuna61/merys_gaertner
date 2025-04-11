// 1. Datenmodell anlegen

package com.example.sexygaertner.data

data class Gaertner(
    val id: Int,
    val name: String,
    val beschreibung: String,
    val bildUrl: String,
    val telefonnummer: String
)
