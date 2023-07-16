package thoughtworks.harsha.requestSpecifications

import thoughtworks.harsha.constants.Constants
import io.restassured.builder.RequestSpecBuilder
import io.restassured.specification.RequestSpecification

object ExampleRequestSpecification {
    val exampleSpec: RequestSpecification = RequestSpecBuilder()
        .setBaseUri(Constants.BASE_URL)
        .addHeader("Accept", "application/json")
        .build()
}
