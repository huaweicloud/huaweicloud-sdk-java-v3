package com.huaweicloud.sdk.kvs.v1.model;

import com.huaweicloud.sdk.corebson.SdkBsonDocResponse;

import org.bson.BsonReader;
import org.bson.codecs.Codec;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.configuration.CodecRegistry;

import java.util.Objects;

/**
 * Response Object
 */
public class PutKvResponse extends SdkBsonDocResponse {

    private static Codec<PutKvResponse> codec;

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutKvResponse {\n");
        sb.append("}");
        return sb.toString();
    }

    @Override
    protected Object decodeBody(CodecRegistry codecRegistry, BsonReader reader) {
        if (codec == null) {
            codec = codecRegistry.get(PutKvResponse.class);
        }
        return codec.decode(reader, DecoderContext.builder().build());
    }
}
