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
 * GetKvRequestBody
 */
public class GetKvRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "TableName")
    @BsonProperty(value = "TableName")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Consistency")
    @BsonProperty(value = "Consistency")

    private Boolean consistency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "PrimaryKey")
    @BsonProperty(value = "PrimaryKey")

    private Document primaryKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ProjectionFields")
    @BsonProperty(value = "ProjectionFields")

    private List<String> projectionFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ReturnPartialBlob")
    @BsonProperty(value = "ReturnPartialBlob")

    private ReturnPartialBlob returnPartialBlob;

    public GetKvRequestBody withTableName(String tableName) {
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

    public GetKvRequestBody withConsistency(Boolean consistency) {
        this.consistency = consistency;
        return this;
    }

    /**
     * Get consistency
     * @return consistency
     */
    public Boolean getConsistency() {
        return consistency;
    }

    public void setConsistency(Boolean consistency) {
        this.consistency = consistency;
    }

    public GetKvRequestBody withPrimaryKey(Document primaryKey) {
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

    public GetKvRequestBody withProjectionFields(List<String> projectionFields) {
        this.projectionFields = projectionFields;
        return this;
    }

    public GetKvRequestBody addProjectionFieldsItem(String projectionFieldsItem) {
        if (this.projectionFields == null) {
            this.projectionFields = new ArrayList<>();
        }
        this.projectionFields.add(projectionFieldsItem);
        return this;
    }

    public GetKvRequestBody withProjectionFields(Consumer<List<String>> projectionFieldsSetter) {
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

    public GetKvRequestBody withReturnPartialBlob(ReturnPartialBlob returnPartialBlob) {
        this.returnPartialBlob = returnPartialBlob;
        return this;
    }

    public GetKvRequestBody withReturnPartialBlob(Consumer<ReturnPartialBlob> returnPartialBlobSetter) {
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
        GetKvRequestBody that = (GetKvRequestBody) obj;
        return Objects.equals(this.tableName, that.tableName) && Objects.equals(this.consistency, that.consistency)
            && Objects.equals(this.primaryKey, that.primaryKey)
            && Objects.equals(this.projectionFields, that.projectionFields)
            && Objects.equals(this.returnPartialBlob, that.returnPartialBlob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableName, consistency, primaryKey, projectionFields, returnPartialBlob);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetKvRequestBody {\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    consistency: ").append(toIndentedString(consistency)).append("\n");
        sb.append("    primaryKey: ").append(toIndentedString(primaryKey)).append("\n");
        sb.append("    projectionFields: ").append(toIndentedString(projectionFields)).append("\n");
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
