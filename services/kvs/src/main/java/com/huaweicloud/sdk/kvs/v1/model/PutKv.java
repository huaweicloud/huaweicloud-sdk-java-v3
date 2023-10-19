package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.Document;
import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * PutKv
 */
public class PutKv {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OperId")
    @BsonProperty(value = "OperId")

    private Integer operId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "KvDoc")
    @BsonProperty(value = "KvDoc")

    private Document kvDoc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "KvBlob")
    @BsonProperty(value = "KvBlob")

    private KvBlob kvBlob;

    public PutKv withOperId(Integer operId) {
        this.operId = operId;
        return this;
    }

    /**
     * Get operId
     * @return operId
     */
    public Integer getOperId() {
        return operId;
    }

    public void setOperId(Integer operId) {
        this.operId = operId;
    }

    public PutKv withKvDoc(Document kvDoc) {
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

    public PutKv withKvBlob(KvBlob kvBlob) {
        this.kvBlob = kvBlob;
        return this;
    }

    public PutKv withKvBlob(Consumer<KvBlob> kvBlobSetter) {
        if (this.kvBlob == null) {
            this.kvBlob = new KvBlob();
            kvBlobSetter.accept(this.kvBlob);
        }

        return this;
    }

    /**
     * Get kvBlob
     * @return kvBlob
     */
    public KvBlob getKvBlob() {
        return kvBlob;
    }

    public void setKvBlob(KvBlob kvBlob) {
        this.kvBlob = kvBlob;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PutKv that = (PutKv) obj;
        return Objects.equals(this.operId, that.operId) && Objects.equals(this.kvDoc, that.kvDoc)
            && Objects.equals(this.kvBlob, that.kvBlob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operId, kvDoc, kvBlob);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutKv {\n");
        sb.append("    operId: ").append(toIndentedString(operId)).append("\n");
        sb.append("    kvDoc: ").append(toIndentedString(kvDoc)).append("\n");
        sb.append("    kvBlob: ").append(toIndentedString(kvBlob)).append("\n");
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

}
