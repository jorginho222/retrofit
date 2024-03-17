package com.example.retrofit

class NodeRepository(
    private val api: NodeApi
) {
    suspend fun getMovies(): Result<List<NodeItem>> {
        return try {
            val response = api.getMovies()
            Result.success(response)
        } catch (e: Exception) {
            return Result.failure(e)
        }
    }
}