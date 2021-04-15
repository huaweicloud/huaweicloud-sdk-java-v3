package com.huaweicloud.sdk.ecs.v2;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.huaweicloud.sdk.core.utils.StringUtils;
import com.huaweicloud.sdk.ecs.v2.model.ServerImage;

import java.io.IOException;
import java.util.Objects;

public class EcsServerImageDeSerializer extends StdDeserializer<ServerImage> {

    protected EcsServerImageDeSerializer(Class<?> vc) {
        super(vc);
    }

    public EcsServerImageDeSerializer() {
        this(ServerImage.class);
    }

    @Override
    public ServerImage deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
            throws IOException {
        if (StringUtils.isEmpty(jsonParser.getText())) {
            return null;
        }

        JsonNode jsonNode = jsonParser.readValueAsTree();

        return new ServerImage().withId(Objects.isNull(jsonNode.get("id")) || jsonNode.get("id").isNull()
                ? null : jsonNode.get("id").asText());

    }
}
