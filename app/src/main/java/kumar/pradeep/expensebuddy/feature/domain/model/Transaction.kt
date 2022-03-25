package kumar.pradeep.expensebuddy.feature.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Transaction(
    val value: Int,
    val category: String,
    val mode: String,
    val time: Long,
    @PrimaryKey val id: Int ? = null
)
{
  companion object {
      val category = listOf("Meal","Coffee","Groceries")
      val mode = listOf("Cash","Card","Digital Wallet")
  }
}