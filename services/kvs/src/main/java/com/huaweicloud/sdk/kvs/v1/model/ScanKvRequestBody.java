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
 * ScanKvRequestBody
 */
public class ScanKvRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "TableName")
    @BsonProperty(value = "TableName")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "StrongConsistent")
    @BsonProperty(value = "StrongConsistent")

    private Boolean strongConsistent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "HintIndex")
    @BsonProperty(value = "HintIndex")

    private String hintIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "LimitNum")
    @BsonProperty(value = "LimitNum")

    private Integer limitNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "StartKey")
    @BsonProperty(value = "StartKey")

    private Document startKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "EndKey")
    @BsonProperty(value = "EndKey")

    private Document endKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "FilterExpression")
    @BsonProperty(value = "FilterExpression")

    private ConditionExpression filterExpression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "FilterVarDefine")
    @BsonProperty(value = "FilterVarDefine")

    private Document filterVarDefine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ProjectionFields")
    @BsonProperty(value = "ProjectionFields")

    private List<String> projectionFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ReturnPartialBlob")
    @BsonProperty(value = "ReturnPartialBlob")

    private ReturnPartialBlob returnPartialBlob;

    public ScanKvRequestBody withTableName(String tableName) {
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

    public ScanKvRequestBody withStrongConsistent(Boolean strongConsistent) {
        this.strongConsistent = strongConsistent;
        return this;
    }

    /**
     * Get strongConsistent
     * @return strongConsistent
     */
    public Boolean getStrongConsistent() {
        return strongConsistent;
    }

    public void setStrongConsistent(Boolean strongConsistent) {
        this.strongConsistent = strongConsistent;
    }

    public ScanKvRequestBody withHintIndex(String hintIndex) {
        this.hintIndex = hintIndex;
        return this;
    }

    /**
     * Get hintIndex
     * @return hintIndex
     */
    public String getHintIndex() {
        return hintIndex;
    }

    public void setHintIndex(String hintIndex) {
        this.hintIndex = hintIndex;
    }

    public ScanKvRequestBody withLimitNum(Integer limitNum) {
        this.limitNum = limitNum;
        return this;
    }

    /**
     * Get limitNum
     * maximum: 100
     * @return limitNum
     */
    public Integer getLimitNum() {
        return limitNum;
    }

    public void setLimitNum(Integer limitNum) {
        this.limitNum = limitNum;
    }

    public ScanKvRequestBody withStartKey(Document startKey) {
        this.startKey = startKey;
        return this;
    }

    /**
     * Get startKey
     * @return startKey
     */
    public Document getStartKey() {
        return startKey;
    }

    public void setStartKey(Document startKey) {
        this.startKey = startKey;
    }

    public ScanKvRequestBody withEndKey(Document endKey) {
        this.endKey = endKey;
        return this;
    }

    /**
     * Get endKey
     * @return endKey
     */
    public Document getEndKey() {
        return endKey;
    }

    public void setEndKey(Document endKey) {
        this.endKey = endKey;
    }

    public ScanKvRequestBody withFilterExpression(ConditionExpression filterExpression) {
        this.filterExpression = filterExpression;
        return this;
    }

    public ScanKvRequestBody withFilterExpression(Consumer<ConditionExpression> filterExpressionSetter) {
        if (this.filterExpression == null) {
            this.filterExpression = new ConditionExpression();
            filterExpressionSetter.accept(this.filterExpression);
        }

        return this;
    }

    /**
     * Get filterExpression
     * @return filterExpression
     */
    public ConditionExpression getFilterExpression() {
        return filterExpression;
    }

    public void setFilterExpression(ConditionExpression filterExpression) {
        this.filterExpression = filterExpression;
    }

    public ScanKvRequestBody withFilterVarDefine(Document filterVarDefine) {
        this.filterVarDefine = filterVarDefine;
        return this;
    }

    /**
     * Get filterVarDefine
     * @return filterVarDefine
     */
    public Document getFilterVarDefine() {
        return filterVarDefine;
    }

    public void setFilterVarDefine(Document filterVarDefine) {
        this.filterVarDefine = filterVarDefine;
    }

    public ScanKvRequestBody withProjectionFields(List<String> projectionFields) {
        this.projectionFields = projectionFields;
        return this;
    }

    public ScanKvRequestBody addProjectionFieldsItem(String projectionFieldsItem) {
        if (this.projectionFields == null) {
            this.projectionFields = new ArrayList<>();
        }
        this.projectionFields.add(projectionFieldsItem);
        return this;
    }

    public ScanKvRequestBody withProjectionFields(Consumer<List<String>> projectionFieldsSetter) {
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

    public ScanKvRequestBody withReturnPartialBlob(ReturnPartialBlob returnPartialBlob) {
        this.returnPartialBlob = returnPartialBlob;
        return this;
    }

    public ScanKvRequestBody withReturnPartialBlob(Consumer<ReturnPartialBlob> returnPartialBlobSetter) {
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
        ScanKvRequestBody that = (ScanKvRequestBody) obj;
        return Objects.equals(this.tableName, that.tableName)
            && Objects.equals(this.strongConsistent, that.strongConsistent)
            && Objects.equals(this.hintIndex, that.hintIndex) && Objects.equals(this.limitNum, that.limitNum)
            && Objects.equals(this.startKey, that.startKey) && Objects.equals(this.endKey, that.endKey)
            && Objects.equals(this.filterExpression, that.filterExpression)
            && Objects.equals(this.filterVarDefine, that.filterVarDefine)
            && Objects.equals(this.projectionFields, that.projectionFields)
            && Objects.equals(this.returnPartialBlob, that.returnPartialBlob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableName,
            strongConsistent,
            hintIndex,
            limitNum,
            startKey,
            endKey,
            filterExpression,
            filterVarDefine,
            projectionFields,
            returnPartialBlob);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScanKvRequestBody {\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    strongConsistent: ").append(toIndentedString(strongConsistent)).append("\n");
        sb.append("    hintIndex: ").append(toIndentedString(hintIndex)).append("\n");
        sb.append("    limitNum: ").append(toIndentedString(limitNum)).append("\n");
        sb.append("    startKey: ").append(toIndentedString(startKey)).append("\n");
        sb.append("    endKey: ").append(toIndentedString(endKey)).append("\n");
        sb.append("    filterExpression: ").append(toIndentedString(filterExpression)).append("\n");
        sb.append("    filterVarDefine: ").append(toIndentedString(filterVarDefine)).append("\n");
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
