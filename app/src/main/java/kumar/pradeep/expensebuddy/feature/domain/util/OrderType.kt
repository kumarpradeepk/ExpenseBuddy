package kumar.pradeep.expensebuddy.feature.domain.util

sealed class OrderType {
    object Ascending :OrderType()
    object Descending :OrderType()
}
