package kumar.pradeep.expensebuddy.feature.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import kumar.pradeep.expensebuddy.feature.domain.model.Transaction

@Database(
    entities = [Transaction::class],
    version = 1
)
abstract class TransactionDataBase : RoomDatabase() {

    abstract val transactionDao:TransactionDao

}