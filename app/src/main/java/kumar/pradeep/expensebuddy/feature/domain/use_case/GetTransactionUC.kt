package kumar.pradeep.expensebuddy.feature.domain.use_case

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kumar.pradeep.expensebuddy.feature.domain.model.Transaction
import kumar.pradeep.expensebuddy.feature.domain.repository.TransactionRepository
import kumar.pradeep.expensebuddy.feature.domain.util.OrderType
import kumar.pradeep.expensebuddy.feature.domain.util.ViewBy

class GetTransactionUC (
    private val transactionRepository: TransactionRepository
    ) {

    operator fun invoke(
        viewBy: ViewBy = ViewBy.Transaction(OrderType.Ascending)
    ):Flow<List<Transaction>> {
        return transactionRepository.getTransaction().map {
            transaction ->
            when(viewBy) {
               is ViewBy.Transaction -> {
                   transaction.sortedBy { it.time }
               }
                is ViewBy.Categories -> {
                    transaction.sortedBy { it.category }
                }

                is ViewBy.PaymentTypes -> {
                    transaction.sortedBy { it.mode }
                }
            }
        }
    }

}