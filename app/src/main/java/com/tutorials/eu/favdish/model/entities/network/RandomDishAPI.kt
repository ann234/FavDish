package com.tutorials.eu.favdish.model.entities.network

import com.tutorials.eu.favdish.model.entities.RandomDish
import com.tutorials.eu.favdish.viewmodel.utils.Constants
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface RandomDishAPI {
    @GET(Constants.API_ENDPOINT)
    fun getRandomDishes(
        @Query(Constants.API_KEY) apiKey: String,
        @Query(Constants.LIMIT_LICENSE) limitLicense: Boolean,
        @Query(Constants.TAGS) tags: String,
        @Query(Constants.NUMBER) number: Int,
    ): Single<RandomDish.Recipes>
}