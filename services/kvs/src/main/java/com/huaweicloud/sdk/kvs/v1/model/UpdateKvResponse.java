package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.corebson.SdkBsonDocResponse;

import org.bson.BsonReader;
import org.bson.Document;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateKvResponse extends SdkBsonDocResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "KvBlobData")
    @BsonProperty(value = "KvBlobData")

    private KvBlobData kvBlobData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "KvFields")
    @BsonProperty(value = "KvFields")

    private Document kvFields;

    public UpdateKvResponse withKvBlobData(KvBlobData kvBlobData) {
        this.kvBlobData = kvBlobData;
        return this;
    }

    public UpdateKvResponse withKvBlobData(Consumer<KvBlobData> kvBlobDataSetter) {
        if (this.kvBlobData == null) {
            this.kvBlobData = new KvBlobData();
            kvBlobDataSetter.accept(this.kvBlobData);
        }

        return this;
    }

    /**
     * Get kvBlobData
     * @return kvBlobData
     */
    public KvBlobData getKvBlobData() {
        return kvBlobData;
    }

    public void setKvBlobData(KvBlobData kvBlobData) {
        this.kvBlobData = kvBlobData;
    }

    public UpdateKvResponse withKvFields(Document kvFields) {
        this.kvFields = kvFields;
        return this;
    }

    /**
     * Get kvFields
     * @return kvFields
     */
    public Document getKvFields() {
        return kvFields;
    }

    public void setKvFields(Document kvFields) {
        this.kvFields = kvFields;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateKvResponse that = (UpdateKvResponse) obj;
        return Objects.equals(this.kvBlobData, that.kvBlobData) && Objects.equals(this.kvFields, that.kvFields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kvBlobData, kvFields);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateKvResponse {\n");
        sb.append("    kvBlobData: ").append(toIndentedString(kvBlobData)).append("\n");
        sb.append("    kvFields: ").append(toIndentedString(kvFields)).append("\n");
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
    protected Object decodeBody(CodecRegistry codecRegistry, BsonReader reader) {
        return codecRegistry.get(UpdateKvResponse.class).decode(reader, DecoderContext.builder().build());
    }
}
