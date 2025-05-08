package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.Document;
import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateKv
 */
public class UpdateKv {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "oper_id")
    @BsonProperty(value = "oper_id")

    private Integer operId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_key")
    @BsonProperty(value = "primary_key")

    private Document primaryKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_fields")
    @BsonProperty(value = "update_fields")

    private UpdateFields updateFields;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition_expression")
    @BsonProperty(value = "condition_expression")

    private ConditionExpression conditionExpression;

    public UpdateKv withOperId(Integer operId) {
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

    public UpdateKv withPrimaryKey(Document primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }

    /**
     * 用户自定义的主键名及值。
     * @return primaryKey
     */
    public Document getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(Document primaryKey) {
        this.primaryKey = primaryKey;
    }

    public UpdateKv withUpdateFields(UpdateFields updateFields) {
        this.updateFields = updateFields;
        return this;
    }

    public UpdateKv withUpdateFields(Consumer<UpdateFields> updateFieldsSetter) {
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

    public UpdateKv withConditionExpression(ConditionExpression conditionExpression) {
        this.conditionExpression = conditionExpression;
        return this;
    }

    public UpdateKv withConditionExpression(Consumer<ConditionExpression> conditionExpressionSetter) {
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
        UpdateKv that = (UpdateKv) obj;
        return Objects.equals(this.operId, that.operId) && Objects.equals(this.primaryKey, that.primaryKey)
            && Objects.equals(this.updateFields, that.updateFields)
            && Objects.equals(this.conditionExpression, that.conditionExpression);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operId, primaryKey, updateFields, conditionExpression);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateKv {\n");
        sb.append("    operId: ").append(toIndentedString(operId)).append("\n");
        sb.append("    primaryKey: ").append(toIndentedString(primaryKey)).append("\n");
        sb.append("    updateFields: ").append(toIndentedString(updateFields)).append("\n");
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
