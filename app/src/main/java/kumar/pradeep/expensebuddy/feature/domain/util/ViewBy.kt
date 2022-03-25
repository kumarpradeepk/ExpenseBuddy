package kumar.pradeep.expensebuddy.feature.domain.util

sealed class ViewBy (val orderType: OrderType) {
    class Transaction (orderType: OrderType) :ViewBy(orderType)
    class Categories (orderType: OrderType) :ViewBy(orderType)
    class PaymentTypes (orderType: OrderType) :ViewBy(orderType)
}
