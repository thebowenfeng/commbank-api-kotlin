import java.time.ZonedDateTime

data class Account(
    val accountNumber: String,
    val id: String,
    val name: String,
    val balance: Double,
    val currency: String,
    val funds: Double
)

data class Transaction(
    val id: String?,
    val transactionDetailsRequest: String?,
    val description: String,
    val created: ZonedDateTime,
    val amount: Double,
    val pending: Boolean
)
