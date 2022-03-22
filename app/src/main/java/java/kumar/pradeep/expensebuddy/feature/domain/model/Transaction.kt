package java.kumar.pradeep.expensebuddy.feature.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Transaction(
 @PrimaryKey val id:Int? = null,
 val title: String,
 val category: String,
 val timestamp: Long
)
