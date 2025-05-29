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
public class BatchGetKvRequest extends SdkBsonDocRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "store_name")
    @BsonProperty(value = "store_name")

    private String storeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")
    @BsonProperty(value = "body")

    private BatchGetKvRequestBody body;

    private static Codec<BatchGetKvRequestBody> codec;

    public BatchGetKvRequest withStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }

    /**
     * 仓名
     * @return storeName
     */
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public BatchGetKvRequest withBody(BatchGetKvRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchGetKvRequest withBody(Consumer<BatchGetKvRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new BatchGetKvRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BatchGetKvRequestBody getBody() {
        return body;
    }

    public void setBody(BatchGetKvRequestBody body) {
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
        BatchGetKvRequest that = (BatchGetKvRequest) obj;
        return Objects.equals(this.storeName, that.storeName) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storeName, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchGetKvRequest {\n");
        sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
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
            codec = codecRegistry.get(BatchGetKvRequestBody.class);
        }
        codec.encode(writer, this.getBody(), EncoderContext.builder().build());
    }
}
