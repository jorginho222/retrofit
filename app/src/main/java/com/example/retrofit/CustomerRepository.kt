package com.example.retrofit

class CustomerRepository(
    private val api: BPApi
) {
    suspend fun getCustomers(): Result<List<CustomerItem>> {
        return try {
            val response = api.getCustomers()
            Result.success(response)
        } catch (e: Exception) {
            return Result.failure(e)
        }
    }
}