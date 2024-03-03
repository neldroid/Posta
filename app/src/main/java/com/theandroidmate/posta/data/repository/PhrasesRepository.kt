package com.theandroidmate.posta.data.repository

import com.theandroidmate.posta.model.Phrase
import kotlinx.coroutines.flow.Flow

interface PhrasesRepository {

    suspend fun getPhrases(): Flow<Phrase>

}