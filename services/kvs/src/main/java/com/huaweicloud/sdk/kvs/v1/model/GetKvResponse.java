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
public class GetKvResponse extends SdkBsonDocResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kv_blob_data")
    @BsonProperty(value = "kv_blob_data")

    private KvBlobData kvBlobData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kv_doc")
    @BsonProperty(value = "kv_doc")

    private Document kvDoc;

    public GetKvResponse withKvBlobData(KvBlobData kvBlobData) {
        this.kvBlobData = kvBlobData;
        return this;
    }

    public GetKvResponse withKvBlobData(Consumer<KvBlobData> kvBlobDataSetter) {
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

    public GetKvResponse withKvDoc(Document kvDoc) {
        this.kvDoc = kvDoc;
        return this;
    }

    /**
     * 对kv_doc有效。 > 内容字段：主键字段+投影字段或者全部字段。
     * @return kvDoc
     */
    public Document getKvDoc() {
        return kvDoc;
    }

    public void setKvDoc(Document kvDoc) {
        this.kvDoc = kvDoc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetKvResponse that = (GetKvResponse) obj;
        return Objects.equals(this.kvBlobData, that.kvBlobData) && Objects.equals(this.kvDoc, that.kvDoc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kvBlobData, kvDoc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetKvResponse {\n");
        sb.append("    kvBlobData: ").append(toIndentedString(kvBlobData)).append("\n");
        sb.append("    kvDoc: ").append(toIndentedString(kvDoc)).append("\n");
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
        return codecRegistry.get(GetKvResponse.class).decode(reader, DecoderContext.builder().build());
    }
}
