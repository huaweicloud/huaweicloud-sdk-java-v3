package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.Document;
import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * PutShardKeyKv
 */
public class PutShardKeyKv {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition_expression")
    @BsonProperty(value = "condition_expression")

    private ConditionExpression conditionExpression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kv_doc")
    @BsonProperty(value = "kv_doc")

    private Document kvDoc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kv_blob")
    @BsonProperty(value = "kv_blob")

    private KvBlob kvBlob;

    public PutShardKeyKv withConditionExpression(ConditionExpression conditionExpression) {
        this.conditionExpression = conditionExpression;
        return this;
    }

    public PutShardKeyKv withConditionExpression(Consumer<ConditionExpression> conditionExpressionSetter) {
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

    public PutShardKeyKv withKvDoc(Document kvDoc) {
        this.kvDoc = kvDoc;
        return this;
    }

    /**
     * 用户文档，含分区键字段，同\"shard_key\"参数值
     * @return kvDoc
     */
    public Document getKvDoc() {
        return kvDoc;
    }

    public void setKvDoc(Document kvDoc) {
        this.kvDoc = kvDoc;
    }

    public PutShardKeyKv withKvBlob(KvBlob kvBlob) {
        this.kvBlob = kvBlob;
        return this;
    }

    public PutShardKeyKv withKvBlob(Consumer<KvBlob> kvBlobSetter) {
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
        PutShardKeyKv that = (PutShardKeyKv) obj;
        return Objects.equals(this.conditionExpression, that.conditionExpression)
            && Objects.equals(this.kvDoc, that.kvDoc) && Objects.equals(this.kvBlob, that.kvBlob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conditionExpression, kvDoc, kvBlob);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutShardKeyKv {\n");
        sb.append("    conditionExpression: ").append(toIndentedString(conditionExpression)).append("\n");
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
