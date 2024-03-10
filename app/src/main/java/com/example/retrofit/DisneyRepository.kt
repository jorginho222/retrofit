package com.example.retrofit

class DisneyRepository(
    private val api: DisneyApi
) {
    suspend fun getCharacters(): Result<List<DisneyCharacter>> {
        return try {
            val response = api.getCharacters().data
            val characters = response.map { convert(it) }
            Result.success(characters)
        } catch (e: Exception) {
            return Result.failure(e)
        }
    }

    private fun convert(data: Data): DisneyCharacter {
        return DisneyCharacter(
            name = data.name,
            image = data.imageUrl
        )
    }
}