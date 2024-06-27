package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.Document;
import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.Objects;

/**
 * PutKv
 */
public class PutKv {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "oper_id")
    @BsonProperty(value = "oper_id")

    private Integer operId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kv_doc")
    @BsonProperty(value = "kv_doc")

    private Document kvDoc;

    public PutKv withOperId(Integer operId) {
        this.operId = operId;
        return this;
    }

    /**
     * 请求内的操作编码，未成功的操作返回该标识。
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
     * 用户文档。
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
        PutKv that = (PutKv) obj;
        return Objects.equals(this.operId, that.operId) && Objects.equals(this.kvDoc, that.kvDoc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operId, kvDoc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutKv {\n");
        sb.append("    operId: ").append(toIndentedString(operId)).append("\n");
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

}
