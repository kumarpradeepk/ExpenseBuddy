package kumar.pradeep.expensebuddy.feature.domain.repository

import kotlinx.coroutines.flow.Flow
import kumar.pradeep.expensebuddy.feature.domain.model.Transaction

interface TransactionRepository {

    fun getTransaction(): Flow<List<Transaction>>

    suspend fun getTransactionById(id:Int):Transaction?

    suspend fun insertTransaction(transaction: Transaction)

    suspend fun deleteTransaction(transaction: Transaction)

}