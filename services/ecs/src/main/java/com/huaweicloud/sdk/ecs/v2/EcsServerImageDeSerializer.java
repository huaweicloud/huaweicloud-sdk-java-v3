package com.huaweicloud.sdk.ecs.v2;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.huaweicloud.sdk.core.exception.SdkException;
import com.huaweicloud.sdk.ecs.v2.model.ServerImage;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;

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
        String msg = String.format("Cannot construct instance of %s", ServerImage.class.getName());
        throw new SdkException(msg);
    }
}
