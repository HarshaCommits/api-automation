package thoughtworks.harsha.serializers

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import thoughtworks.harsha.models.ExampleModel

class ExampleSerializer {
    private val objectMapper = jacksonObjectMapper()

    fun serialize(exampleModel: ExampleModel): String {
        return objectMapper.writeValueAsString(exampleModel)
    }
}
