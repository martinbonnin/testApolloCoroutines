import com.apollographql.apollo.ApolloCall
import com.apollographql.apollo.api.Operation
import com.apollographql.apollo.coroutines.toFlow
import org.junit.Test

class Test {
    @Test
    fun test() {
        println()
    }

    fun someFun(operation: Operation<Operation.Data, Unit, Operation.Variables>) {

    }

    suspend fun someFun(apolloCall: ApolloCall<Unit>) {
        apolloCall.toFlow()
    }
}