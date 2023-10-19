package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.Document;
import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateKvRequestBody
 */
public class UpdateKvRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "TableName")
    @BsonProperty(value = "TableName")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "PrimaryKey")
    @BsonProperty(value = "PrimaryKey")

    private Document primaryKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ConditionExpression")
    @BsonProperty(value = "ConditionExpression")

    private ConditionExpression conditionExpression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "KvOptions")
    @BsonProperty(value = "KvOptions")

    private KvOptions kvOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "UpdateFields")
    @BsonProperty(value = "UpdateFields")

    private UpdateFields updateFields;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ProjectionFields")
    @BsonProperty(value = "ProjectionFields")

    private List<String> projectionFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "UpdateBlob")
    @BsonProperty(value = "UpdateBlob")

    private UpdateBlob updateBlob;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ReturnPartialBlob")
    @BsonProperty(value = "ReturnPartialBlob")

    private ReturnPartialBlob returnPartialBlob;

    public UpdateKvRequestBody withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Get tableName
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public UpdateKvRequestBody withPrimaryKey(Document primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }

    /**
     * Get primaryKey
     * @return primaryKey
     */
    public Document getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(Document primaryKey) {
        this.primaryKey = primaryKey;
    }

    public UpdateKvRequestBody withConditionExpression(ConditionExpression conditionExpression) {
        this.conditionExpression = conditionExpression;
        return this;
    }

    public UpdateKvRequestBody withConditionExpression(Consumer<ConditionExpression> conditionExpressionSetter) {
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

    public UpdateKvRequestBody withKvOptions(KvOptions kvOptions) {
        this.kvOptions = kvOptions;
        return this;
    }

    public UpdateKvRequestBody withKvOptions(Consumer<KvOptions> kvOptionsSetter) {
        if (this.kvOptions == null) {
            this.kvOptions = new KvOptions();
            kvOptionsSetter.accept(this.kvOptions);
        }

        return this;
    }

    /**
     * Get kvOptions
     * @return kvOptions
     */
    public KvOptions getKvOptions() {
        return kvOptions;
    }

    public void setKvOptions(KvOptions kvOptions) {
        this.kvOptions = kvOptions;
    }

    public UpdateKvRequestBody withUpdateFields(UpdateFields updateFields) {
        this.updateFields = updateFields;
        return this;
    }

    public UpdateKvRequestBody withUpdateFields(Consumer<UpdateFields> updateFieldsSetter) {
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

    public UpdateKvRequestBody withProjectionFields(List<String> projectionFields) {
        this.projectionFields = projectionFields;
        return this;
    }

    public UpdateKvRequestBody addProjectionFieldsItem(String projectionFieldsItem) {
        if (this.projectionFields == null) {
            this.projectionFields = new ArrayList<>();
        }
        this.projectionFields.add(projectionFieldsItem);
        return this;
    }

    public UpdateKvRequestBody withProjectionFields(Consumer<List<String>> projectionFieldsSetter) {
        if (this.projectionFields == null) {
            this.projectionFields = new ArrayList<>();
        }
        projectionFieldsSetter.accept(this.projectionFields);
        return this;
    }

    /**
     * Get projectionFields
     * @return projectionFields
     */
    public List<String> getProjectionFields() {
        return projectionFields;
    }

    public void setProjectionFields(List<String> projectionFields) {
        this.projectionFields = projectionFields;
    }

    public UpdateKvRequestBody withUpdateBlob(UpdateBlob updateBlob) {
        this.updateBlob = updateBlob;
        return this;
    }

    public UpdateKvRequestBody withUpdateBlob(Consumer<UpdateBlob> updateBlobSetter) {
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

    public UpdateKvRequestBody withReturnPartialBlob(ReturnPartialBlob returnPartialBlob) {
        this.returnPartialBlob = returnPartialBlob;
        return this;
    }

    public UpdateKvRequestBody withReturnPartialBlob(Consumer<ReturnPartialBlob> returnPartialBlobSetter) {
        if (this.returnPartialBlob == null) {
            this.returnPartialBlob = new ReturnPartialBlob();
            returnPartialBlobSetter.accept(this.returnPartialBlob);
        }

        return this;
    }

    /**
     * Get returnPartialBlob
     * @return returnPartialBlob
     */
    public ReturnPartialBlob getReturnPartialBlob() {
        return returnPartialBlob;
    }

    public void setReturnPartialBlob(ReturnPartialBlob returnPartialBlob) {
        this.returnPartialBlob = returnPartialBlob;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateKvRequestBody that = (UpdateKvRequestBody) obj;
        return Objects.equals(this.tableName, that.tableName) && Objects.equals(this.primaryKey, that.primaryKey)
            && Objects.equals(this.conditionExpression, that.conditionExpression)
            && Objects.equals(this.kvOptions, that.kvOptions) && Objects.equals(this.updateFields, that.updateFields)
            && Objects.equals(this.projectionFields, that.projectionFields)
            && Objects.equals(this.updateBlob, that.updateBlob)
            && Objects.equals(this.returnPartialBlob, that.returnPartialBlob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableName,
            primaryKey,
            conditionExpression,
            kvOptions,
            updateFields,
            projectionFields,
            updateBlob,
            returnPartialBlob);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateKvRequestBody {\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    primaryKey: ").append(toIndentedString(primaryKey)).append("\n");
        sb.append("    conditionExpression: ").append(toIndentedString(conditionExpression)).append("\n");
        sb.append("    kvOptions: ").append(toIndentedString(kvOptions)).append("\n");
        sb.append("    updateFields: ").append(toIndentedString(updateFields)).append("\n");
        sb.append("    projectionFields: ").append(toIndentedString(projectionFields)).append("\n");
        sb.append("    updateBlob: ").append(toIndentedString(updateBlob)).append("\n");
        sb.append("    returnPartialBlob: ").append(toIndentedString(returnPartialBlob)).append("\n");
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
