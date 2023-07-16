package thoughtworks.harsha.deserializers

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import thoughtworks.harsha.models.ExampleModel

class ExampleDeserializer {
    private val objectMapper = jacksonObjectMapper()

    fun deserialize(exampleJson: String): ExampleModel {
        return objectMapper.readValue(exampleJson)
    }
}
