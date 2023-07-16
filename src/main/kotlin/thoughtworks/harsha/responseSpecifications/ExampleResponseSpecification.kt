package thoughtworks.harsha.responseSpecifications

import io.restassured.builder.ResponseSpecBuilder
import io.restassured.specification.ResponseSpecification

object ExampleResponseSpecification {
    val exampleSpec: ResponseSpecification = ResponseSpecBuilder()
        .expectStatusCode(200)
        .build()
}
