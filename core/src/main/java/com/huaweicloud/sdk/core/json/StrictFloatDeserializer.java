package com.huaweicloud.sdk.core.json;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

public class StrictFloatDeserializer extends JsonDeserializer<Float> {

    @Override
    public Float deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return Float.valueOf(jsonParser.getFloatValue());
    }
}
