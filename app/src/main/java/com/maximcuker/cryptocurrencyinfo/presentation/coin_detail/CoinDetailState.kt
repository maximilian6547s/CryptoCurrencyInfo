package com.maximcuker.cryptocurrencyinfo.presentation.coin_detail

import com.maximcuker.cryptocurrencyinfo.domain.model.Coin
import com.maximcuker.cryptocurrencyinfo.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
