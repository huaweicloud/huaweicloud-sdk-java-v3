package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.Document;
import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.Objects;

/**
 * kv元素。
 */
public class ReturnedKvItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kv_doc")
    @BsonProperty(value = "kv_doc")

    private Document kvDoc;

    public ReturnedKvItem withKvDoc(Document kvDoc) {
        this.kvDoc = kvDoc;
        return this;
    }

    /**
     * 对kv_doc有效。
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
        ReturnedKvItem that = (ReturnedKvItem) obj;
        return Objects.equals(this.kvDoc, that.kvDoc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kvDoc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReturnedKvItem {\n");
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
