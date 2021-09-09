package com.maximcuker.cryptocurrencyinfo.data.repository

import com.maximcuker.cryptocurrencyinfo.data.remote.CoinPaprikaApi
import com.maximcuker.cryptocurrencyinfo.data.remote.dto.CoinDetailDto
import com.maximcuker.cryptocurrencyinfo.data.remote.dto.CoinDto
import com.maximcuker.cryptocurrencyinfo.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
): CoinRepository{

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}