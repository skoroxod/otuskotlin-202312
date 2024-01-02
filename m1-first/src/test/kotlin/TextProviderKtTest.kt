import org.junit.jupiter.api.Assertions.*
import ru.skoroxod.urdm.provideGreetingText
import kotlin.test.Test

class TextProviderKtTest {

    @Test
    fun testGreetingText() {
        assertEquals( "Hello world from M1 module", provideGreetingText())
    }
}