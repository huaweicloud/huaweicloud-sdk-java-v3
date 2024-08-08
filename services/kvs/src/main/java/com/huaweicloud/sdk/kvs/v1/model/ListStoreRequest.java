package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.corebson.SdkBsonDocRequest;

import org.bson.BsonWriter;
import org.bson.codecs.Codec;
import org.bson.codecs.EncoderContext;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListStoreRequest extends SdkBsonDocRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")
    @BsonProperty(value = "body")

    private ListStoreRequestBody body;

    private static Codec<ListStoreRequestBody> codec;

    public ListStoreRequest withBody(ListStoreRequestBody body) {
        this.body = body;
        return this;
    }

    public ListStoreRequest withBody(Consumer<ListStoreRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new ListStoreRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ListStoreRequestBody getBody() {
        return body;
    }

    public void setBody(ListStoreRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListStoreRequest that = (ListStoreRequest) obj;
        return Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStoreRequest {\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    @Override
    protected void encodeBody(CodecRegistry codecRegistry, BsonWriter writer) {
        if (codec == null) {
            codec = codecRegistry.get(ListStoreRequestBody.class);
        }
        codec.encode(writer, this.getBody(), EncoderContext.builder().build());
    }
}
