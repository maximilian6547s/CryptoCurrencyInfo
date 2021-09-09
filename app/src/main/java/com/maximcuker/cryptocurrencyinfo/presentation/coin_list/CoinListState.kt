package com.maximcuker.cryptocurrencyinfo.presentation.coin_list

import com.maximcuker.cryptocurrencyinfo.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
