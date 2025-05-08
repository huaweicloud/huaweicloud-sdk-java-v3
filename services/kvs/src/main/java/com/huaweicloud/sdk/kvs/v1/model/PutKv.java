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
    @JsonProperty(value = "oper_id")
    @BsonProperty(value = "oper_id")

    private Integer operId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kv_doc")
    @BsonProperty(value = "kv_doc")

    private Document kvDoc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kv_blob")
    @BsonProperty(value = "kv_blob")

    private KvBlob kvBlob;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition_expression")
    @BsonProperty(value = "condition_expression")

    private ConditionExpression conditionExpression;

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

    public PutKv withConditionExpression(ConditionExpression conditionExpression) {
        this.conditionExpression = conditionExpression;
        return this;
    }

    public PutKv withConditionExpression(Consumer<ConditionExpression> conditionExpressionSetter) {
        if (this.conditionExpression == null) {
            this.conditionExpression = new ConditionExpression();
            conditionExpressionSetter.accept(this.conditionExpression);
        }

        return this;
    }

    /**
     * Get conditionExpression
     * @return conditionExpression
     */
    public ConditionExpression getConditionExpression() {
        return conditionExpression;
    }

    public void setConditionExpression(ConditionExpression conditionExpression) {
        this.conditionExpression = conditionExpression;
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
            && Objects.equals(this.kvBlob, that.kvBlob)
            && Objects.equals(this.conditionExpression, that.conditionExpression);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operId, kvDoc, kvBlob, conditionExpression);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutKv {\n");
        sb.append("    operId: ").append(toIndentedString(operId)).append("\n");
        sb.append("    kvDoc: ").append(toIndentedString(kvDoc)).append("\n");
        sb.append("    kvBlob: ").append(toIndentedString(kvBlob)).append("\n");
        sb.append("    conditionExpression: ").append(toIndentedString(conditionExpression)).append("\n");
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
