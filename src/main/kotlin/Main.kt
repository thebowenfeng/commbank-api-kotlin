import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {
    runBlocking {
        // Initialize client and log on
        val client = CommBankClient("username", "password")
        launch {
            // Get account details
            val account = client.getAccounts()[0]
            // Get transactions
            println(client.getTransactions(account.id))
            // Get page 2 of transactions
            println(client.getTransactions(account.id, 2))
        }
        // Concurrent requests are executed asynchronously (on the same thread)
        launch {
            println(Thread.currentThread().id)
            val account = client.getAccounts()[0]
            println(client.getTransactions(account.id, 3))
            println(client.getTransactions(account.id, 4))
        }
    }
}