package thoughtworks.harsha.services

import io.restassured.RestAssured
import io.restassured.response.Response
import thoughtworks.harsha.constants.Constants

class ExampleService {
    fun getExampleEndpoint(): Response {
        return RestAssured.given()
            .baseUri(Constants.BASE_URL)
            .get(Constants.THOUGHTWORKS_HOMEPAGE)
    }
}
