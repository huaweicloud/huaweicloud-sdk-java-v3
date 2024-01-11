package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.Document;
import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateShardKeyKv
 */
public class UpdateShardKeyKv {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition_expression")
    @BsonProperty(value = "condition_expression")

    private ConditionExpression conditionExpression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")
    @BsonProperty(value = "sort_key")

    private Document sortKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_fields")
    @BsonProperty(value = "update_fields")

    private UpdateFields updateFields;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_blob")
    @BsonProperty(value = "update_blob")

    private UpdateBlob updateBlob;

    public UpdateShardKeyKv withConditionExpression(ConditionExpression conditionExpression) {
        this.conditionExpression = conditionExpression;
        return this;
    }

    public UpdateShardKeyKv withConditionExpression(Consumer<ConditionExpression> conditionExpressionSetter) {
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

    public UpdateShardKeyKv withSortKey(Document sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * 用户自定义的排序键及值
     * @return sortKey
     */
    public Document getSortKey() {
        return sortKey;
    }

    public void setSortKey(Document sortKey) {
        this.sortKey = sortKey;
    }

    public UpdateShardKeyKv withUpdateFields(UpdateFields updateFields) {
        this.updateFields = updateFields;
        return this;
    }

    public UpdateShardKeyKv withUpdateFields(Consumer<UpdateFields> updateFieldsSetter) {
        if (this.updateFields == null) {
            this.updateFields = new UpdateFields();
            updateFieldsSetter.accept(this.updateFields);
        }

        return this;
    }

    /**
     * Get updateFields
     * @return updateFields
     */
    public UpdateFields getUpdateFields() {
        return updateFields;
    }

    public void setUpdateFields(UpdateFields updateFields) {
        this.updateFields = updateFields;
    }

    public UpdateShardKeyKv withUpdateBlob(UpdateBlob updateBlob) {
        this.updateBlob = updateBlob;
        return this;
    }

    public UpdateShardKeyKv withUpdateBlob(Consumer<UpdateBlob> updateBlobSetter) {
        if (this.updateBlob == null) {
            this.updateBlob = new UpdateBlob();
            updateBlobSetter.accept(this.updateBlob);
        }

        return this;
    }

    /**
     * Get updateBlob
     * @return updateBlob
     */
    public UpdateBlob getUpdateBlob() {
        return updateBlob;
    }

    public void setUpdateBlob(UpdateBlob updateBlob) {
        this.updateBlob = updateBlob;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateShardKeyKv that = (UpdateShardKeyKv) obj;
        return Objects.equals(this.conditionExpression, that.conditionExpression)
            && Objects.equals(this.sortKey, that.sortKey) && Objects.equals(this.updateFields, that.updateFields)
            && Objects.equals(this.updateBlob, that.updateBlob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conditionExpression, sortKey, updateFields, updateBlob);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateShardKeyKv {\n");
        sb.append("    conditionExpression: ").append(toIndentedString(conditionExpression)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    updateFields: ").append(toIndentedString(updateFields)).append("\n");
        sb.append("    updateBlob: ").append(toIndentedString(updateBlob)).append("\n");
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
