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
 * ScanSkeyKvRequestBody
 */
public class ScanSkeyKvRequestBody {

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
    @JsonProperty(value = "ShardKey")
    @BsonProperty(value = "ShardKey")

    private Document shardKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "StartSortKey")
    @BsonProperty(value = "StartSortKey")

    private Document startSortKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "EndSortKey")
    @BsonProperty(value = "EndSortKey")

    private Document endSortKey;

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

    public ScanSkeyKvRequestBody withTableName(String tableName) {
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

    public ScanSkeyKvRequestBody withStrongConsistent(Boolean strongConsistent) {
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

    public ScanSkeyKvRequestBody withHintIndex(String hintIndex) {
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

    public ScanSkeyKvRequestBody withLimitNum(Integer limitNum) {
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

    public ScanSkeyKvRequestBody withShardKey(Document shardKey) {
        this.shardKey = shardKey;
        return this;
    }

    /**
     * Get shardKey
     * @return shardKey
     */
    public Document getShardKey() {
        return shardKey;
    }

    public void setShardKey(Document shardKey) {
        this.shardKey = shardKey;
    }

    public ScanSkeyKvRequestBody withStartSortKey(Document startSortKey) {
        this.startSortKey = startSortKey;
        return this;
    }

    /**
     * Get startSortKey
     * @return startSortKey
     */
    public Document getStartSortKey() {
        return startSortKey;
    }

    public void setStartSortKey(Document startSortKey) {
        this.startSortKey = startSortKey;
    }

    public ScanSkeyKvRequestBody withEndSortKey(Document endSortKey) {
        this.endSortKey = endSortKey;
        return this;
    }

    /**
     * Get endSortKey
     * @return endSortKey
     */
    public Document getEndSortKey() {
        return endSortKey;
    }

    public void setEndSortKey(Document endSortKey) {
        this.endSortKey = endSortKey;
    }

    public ScanSkeyKvRequestBody withFilterExpression(ConditionExpression filterExpression) {
        this.filterExpression = filterExpression;
        return this;
    }

    public ScanSkeyKvRequestBody withFilterExpression(Consumer<ConditionExpression> filterExpressionSetter) {
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

    public ScanSkeyKvRequestBody withFilterVarDefine(Document filterVarDefine) {
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

    public ScanSkeyKvRequestBody withProjectionFields(List<String> projectionFields) {
        this.projectionFields = projectionFields;
        return this;
    }

    public ScanSkeyKvRequestBody addProjectionFieldsItem(String projectionFieldsItem) {
        if (this.projectionFields == null) {
            this.projectionFields = new ArrayList<>();
        }
        this.projectionFields.add(projectionFieldsItem);
        return this;
    }

    public ScanSkeyKvRequestBody withProjectionFields(Consumer<List<String>> projectionFieldsSetter) {
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

    public ScanSkeyKvRequestBody withReturnPartialBlob(ReturnPartialBlob returnPartialBlob) {
        this.returnPartialBlob = returnPartialBlob;
        return this;
    }

    public ScanSkeyKvRequestBody withReturnPartialBlob(Consumer<ReturnPartialBlob> returnPartialBlobSetter) {
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
        ScanSkeyKvRequestBody that = (ScanSkeyKvRequestBody) obj;
        return Objects.equals(this.tableName, that.tableName)
            && Objects.equals(this.strongConsistent, that.strongConsistent)
            && Objects.equals(this.hintIndex, that.hintIndex) && Objects.equals(this.limitNum, that.limitNum)
            && Objects.equals(this.shardKey, that.shardKey) && Objects.equals(this.startSortKey, that.startSortKey)
            && Objects.equals(this.endSortKey, that.endSortKey)
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
            shardKey,
            startSortKey,
            endSortKey,
            filterExpression,
            filterVarDefine,
            projectionFields,
            returnPartialBlob);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScanSkeyKvRequestBody {\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    strongConsistent: ").append(toIndentedString(strongConsistent)).append("\n");
        sb.append("    hintIndex: ").append(toIndentedString(hintIndex)).append("\n");
        sb.append("    limitNum: ").append(toIndentedString(limitNum)).append("\n");
        sb.append("    shardKey: ").append(toIndentedString(shardKey)).append("\n");
        sb.append("    startSortKey: ").append(toIndentedString(startSortKey)).append("\n");
        sb.append("    endSortKey: ").append(toIndentedString(endSortKey)).append("\n");
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
