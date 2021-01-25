package com.huaweicloud.sdk.core.json;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

public class StrictStringDeserializer extends JsonDeserializer<String> {

    @Override
    public String deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {

        if (jsonParser.getCurrentToken() == JsonToken.VALUE_STRING) {
            return jsonParser.getValueAsString();
        }
        throw new JsonParseException(jsonParser,
                String.format("Current token (%s) not of string type", jsonParser.getCurrentToken()));

    }
}
