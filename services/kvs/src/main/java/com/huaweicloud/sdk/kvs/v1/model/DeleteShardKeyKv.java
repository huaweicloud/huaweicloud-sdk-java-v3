package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.Document;
import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeleteShardKeyKv
 */
public class DeleteShardKeyKv {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition_expression")
    @BsonProperty(value = "condition_expression")

    private ConditionExpression conditionExpression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")
    @BsonProperty(value = "sort_key")

    private Document sortKey;

    public DeleteShardKeyKv withConditionExpression(ConditionExpression conditionExpression) {
        this.conditionExpression = conditionExpression;
        return this;
    }

    public DeleteShardKeyKv withConditionExpression(Consumer<ConditionExpression> conditionExpressionSetter) {
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

    public DeleteShardKeyKv withSortKey(Document sortKey) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteShardKeyKv that = (DeleteShardKeyKv) obj;
        return Objects.equals(this.conditionExpression, that.conditionExpression)
            && Objects.equals(this.sortKey, that.sortKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conditionExpression, sortKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteShardKeyKv {\n");
        sb.append("    conditionExpression: ").append(toIndentedString(conditionExpression)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
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
