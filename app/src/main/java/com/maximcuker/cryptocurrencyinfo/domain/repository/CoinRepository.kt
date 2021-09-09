package com.maximcuker.cryptocurrencyinfo.domain.repository

import com.maximcuker.cryptocurrencyinfo.data.remote.dto.CoinDetailDto
import com.maximcuker.cryptocurrencyinfo.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoin(coinId:String): CoinDetailDto
}