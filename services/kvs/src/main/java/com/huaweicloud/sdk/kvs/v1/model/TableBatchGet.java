package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TableBatchGet
 */
public class TableBatchGet {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "TableName")
    @BsonProperty(value = "TableName")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Consistency")
    @BsonProperty(value = "Consistency")

    private Boolean consistency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "KvOpers")
    @BsonProperty(value = "KvOpers")

    private List<OperItem> kvOpers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ProjectionFields")
    @BsonProperty(value = "ProjectionFields")

    private List<String> projectionFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ReturnPartialBlob")
    @BsonProperty(value = "ReturnPartialBlob")

    private ReturnPartialBlob returnPartialBlob;

    public TableBatchGet withTableName(String tableName) {
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

    public TableBatchGet withConsistency(Boolean consistency) {
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

    public TableBatchGet withKvOpers(List<OperItem> kvOpers) {
        this.kvOpers = kvOpers;
        return this;
    }

    public TableBatchGet addKvOpersItem(OperItem kvOpersItem) {
        if (this.kvOpers == null) {
            this.kvOpers = new ArrayList<>();
        }
        this.kvOpers.add(kvOpersItem);
        return this;
    }

    public TableBatchGet withKvOpers(Consumer<List<OperItem>> kvOpersSetter) {
        if (this.kvOpers == null) {
            this.kvOpers = new ArrayList<>();
        }
        kvOpersSetter.accept(this.kvOpers);
        return this;
    }

    /**
     * Get kvOpers
     * @return kvOpers
     */
    public List<OperItem> getKvOpers() {
        return kvOpers;
    }

    public void setKvOpers(List<OperItem> kvOpers) {
        this.kvOpers = kvOpers;
    }

    public TableBatchGet withProjectionFields(List<String> projectionFields) {
        this.projectionFields = projectionFields;
        return this;
    }

    public TableBatchGet addProjectionFieldsItem(String projectionFieldsItem) {
        if (this.projectionFields == null) {
            this.projectionFields = new ArrayList<>();
        }
        this.projectionFields.add(projectionFieldsItem);
        return this;
    }

    public TableBatchGet withProjectionFields(Consumer<List<String>> projectionFieldsSetter) {
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

    public TableBatchGet withReturnPartialBlob(ReturnPartialBlob returnPartialBlob) {
        this.returnPartialBlob = returnPartialBlob;
        return this;
    }

    public TableBatchGet withReturnPartialBlob(Consumer<ReturnPartialBlob> returnPartialBlobSetter) {
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
        TableBatchGet that = (TableBatchGet) obj;
        return Objects.equals(this.tableName, that.tableName) && Objects.equals(this.consistency, that.consistency)
            && Objects.equals(this.kvOpers, that.kvOpers)
            && Objects.equals(this.projectionFields, that.projectionFields)
            && Objects.equals(this.returnPartialBlob, that.returnPartialBlob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableName, consistency, kvOpers, projectionFields, returnPartialBlob);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TableBatchGet {\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    consistency: ").append(toIndentedString(consistency)).append("\n");
        sb.append("    kvOpers: ").append(toIndentedString(kvOpers)).append("\n");
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
