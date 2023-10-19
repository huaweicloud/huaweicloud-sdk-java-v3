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
public class RenameKvResponse extends SdkBsonDocResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OldPrimaryKey")
    @BsonProperty(value = "OldPrimaryKey")

    private Document oldPrimaryKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "KvBlobAttr")
    @BsonProperty(value = "KvBlobAttr")

    private KvBlobAttr kvBlobAttr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "KvDoc")
    @BsonProperty(value = "KvDoc")

    private Document kvDoc;

    public RenameKvResponse withOldPrimaryKey(Document oldPrimaryKey) {
        this.oldPrimaryKey = oldPrimaryKey;
        return this;
    }

    /**
     * Get oldPrimaryKey
     * @return oldPrimaryKey
     */
    public Document getOldPrimaryKey() {
        return oldPrimaryKey;
    }

    public void setOldPrimaryKey(Document oldPrimaryKey) {
        this.oldPrimaryKey = oldPrimaryKey;
    }

    public RenameKvResponse withKvBlobAttr(KvBlobAttr kvBlobAttr) {
        this.kvBlobAttr = kvBlobAttr;
        return this;
    }

    public RenameKvResponse withKvBlobAttr(Consumer<KvBlobAttr> kvBlobAttrSetter) {
        if (this.kvBlobAttr == null) {
            this.kvBlobAttr = new KvBlobAttr();
            kvBlobAttrSetter.accept(this.kvBlobAttr);
        }

        return this;
    }

    /**
     * Get kvBlobAttr
     * @return kvBlobAttr
     */
    public KvBlobAttr getKvBlobAttr() {
        return kvBlobAttr;
    }

    public void setKvBlobAttr(KvBlobAttr kvBlobAttr) {
        this.kvBlobAttr = kvBlobAttr;
    }

    public RenameKvResponse withKvDoc(Document kvDoc) {
        this.kvDoc = kvDoc;
        return this;
    }

    /**
     * Get kvDoc
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
        RenameKvResponse that = (RenameKvResponse) obj;
        return Objects.equals(this.oldPrimaryKey, that.oldPrimaryKey)
            && Objects.equals(this.kvBlobAttr, that.kvBlobAttr) && Objects.equals(this.kvDoc, that.kvDoc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oldPrimaryKey, kvBlobAttr, kvDoc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RenameKvResponse {\n");
        sb.append("    oldPrimaryKey: ").append(toIndentedString(oldPrimaryKey)).append("\n");
        sb.append("    kvBlobAttr: ").append(toIndentedString(kvBlobAttr)).append("\n");
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
        return codecRegistry.get(RenameKvResponse.class).decode(reader, DecoderContext.builder().build());
    }
}
