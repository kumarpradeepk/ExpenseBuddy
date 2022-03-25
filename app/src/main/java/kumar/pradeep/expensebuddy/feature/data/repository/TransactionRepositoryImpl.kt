package kumar.pradeep.expensebuddy.feature.data.repository

import kotlinx.coroutines.flow.Flow
import kumar.pradeep.expensebuddy.feature.data.data_source.TransactionDao
import kumar.pradeep.expensebuddy.feature.domain.model.Transaction
import kumar.pradeep.expensebuddy.feature.domain.repository.TransactionRepository

class TransactionRepositoryImpl(
    private val transactionDao: TransactionDao
):TransactionRepository {
    override fun getTransaction(): Flow<List<Transaction>> {
        return transactionDao.getTransactions()
    }

    override suspend fun getTransactionById(id: Int): Transaction? {
        return transactionDao.getTransactionById(id)
    }

    override suspend fun insertTransaction(transaction: Transaction) {
        return transactionDao.insertTransaction(transaction)
    }

    override suspend fun deleteTransaction(transaction: Transaction) {
        return transactionDao.deleteTransaction(transaction)
    }
}