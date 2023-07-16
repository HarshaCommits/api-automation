package thoughtworks.harsha.testCases

import thoughtworks.harsha.services.ExampleService
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import io.qameta.allure.Epic
import io.qameta.allure.Feature

@Epic("Thoughtworks")
@Feature("Homepage endpoint")
class ExampleServiceTest {
    private val exampleService = ExampleService()

    @Test
    fun `Verify example endpoint returns success response`() {
        val response = exampleService.getExampleEndpoint()

        assertEquals(200, response.statusCode())
    }
}
