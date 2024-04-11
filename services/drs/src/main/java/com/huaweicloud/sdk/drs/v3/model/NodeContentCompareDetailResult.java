package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 内容对比详情
 */
public class NodeContentCompareDetailResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_db")

    private String sourceDb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_db")

    private String targetDb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_table_name")

    private String sourceTableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_table_name")

    private String targetTableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_row_num")

    private Long sourceRowNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_row_num")

    private Long targetRowNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "difference_row_num")

    private Long differenceRowNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_compare_result")

    private Boolean lineCompareResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_compare_result")

    private Boolean contentCompareResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_line_config_filter")

    private String compareLineConfigFilter;

    public NodeContentCompareDetailResult withSourceDb(String sourceDb) {
        this.sourceDb = sourceDb;
        return this;
    }

    /**
     * 源库名称。
     * @return sourceDb
     */
    public String getSourceDb() {
        return sourceDb;
    }

    public void setSourceDb(String sourceDb) {
        this.sourceDb = sourceDb;
    }

    public NodeContentCompareDetailResult withTargetDb(String targetDb) {
        this.targetDb = targetDb;
        return this;
    }

    /**
     * 目标库名称。
     * @return targetDb
     */
    public String getTargetDb() {
        return targetDb;
    }

    public void setTargetDb(String targetDb) {
        this.targetDb = targetDb;
    }

    public NodeContentCompareDetailResult withSourceTableName(String sourceTableName) {
        this.sourceTableName = sourceTableName;
        return this;
    }

    /**
     * 源库的表名称。
     * @return sourceTableName
     */
    public String getSourceTableName() {
        return sourceTableName;
    }

    public void setSourceTableName(String sourceTableName) {
        this.sourceTableName = sourceTableName;
    }

    public NodeContentCompareDetailResult withTargetTableName(String targetTableName) {
        this.targetTableName = targetTableName;
        return this;
    }

    /**
     * 目标库名称。
     * @return targetTableName
     */
    public String getTargetTableName() {
        return targetTableName;
    }

    public void setTargetTableName(String targetTableName) {
        this.targetTableName = targetTableName;
    }

    public NodeContentCompareDetailResult withSourceRowNum(Long sourceRowNum) {
        this.sourceRowNum = sourceRowNum;
        return this;
    }

    /**
     * 源库表行数。
     * @return sourceRowNum
     */
    public Long getSourceRowNum() {
        return sourceRowNum;
    }

    public void setSourceRowNum(Long sourceRowNum) {
        this.sourceRowNum = sourceRowNum;
    }

    public NodeContentCompareDetailResult withTargetRowNum(Long targetRowNum) {
        this.targetRowNum = targetRowNum;
        return this;
    }

    /**
     * 目标库表行数。
     * @return targetRowNum
     */
    public Long getTargetRowNum() {
        return targetRowNum;
    }

    public void setTargetRowNum(Long targetRowNum) {
        this.targetRowNum = targetRowNum;
    }

    public NodeContentCompareDetailResult withDifferenceRowNum(Long differenceRowNum) {
        this.differenceRowNum = differenceRowNum;
        return this;
    }

    /**
     * 源库的表和目标库的表的差异值。
     * @return differenceRowNum
     */
    public Long getDifferenceRowNum() {
        return differenceRowNum;
    }

    public void setDifferenceRowNum(Long differenceRowNum) {
        this.differenceRowNum = differenceRowNum;
    }

    public NodeContentCompareDetailResult withLineCompareResult(Boolean lineCompareResult) {
        this.lineCompareResult = lineCompareResult;
        return this;
    }

    /**
     * 行对比结果。 - true：一致 - false：不一致
     * @return lineCompareResult
     */
    public Boolean getLineCompareResult() {
        return lineCompareResult;
    }

    public void setLineCompareResult(Boolean lineCompareResult) {
        this.lineCompareResult = lineCompareResult;
    }

    public NodeContentCompareDetailResult withContentCompareResult(Boolean contentCompareResult) {
        this.contentCompareResult = contentCompareResult;
        return this;
    }

    /**
     * 内容对比结果。 - true：一致 - false：不一致
     * @return contentCompareResult
     */
    public Boolean getContentCompareResult() {
        return contentCompareResult;
    }

    public void setContentCompareResult(Boolean contentCompareResult) {
        this.contentCompareResult = contentCompareResult;
    }

    public NodeContentCompareDetailResult withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 附加信息。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public NodeContentCompareDetailResult withCompareLineConfigFilter(String compareLineConfigFilter) {
        this.compareLineConfigFilter = compareLineConfigFilter;
        return this;
    }

    /**
     * 行过滤配置条件
     * @return compareLineConfigFilter
     */
    public String getCompareLineConfigFilter() {
        return compareLineConfigFilter;
    }

    public void setCompareLineConfigFilter(String compareLineConfigFilter) {
        this.compareLineConfigFilter = compareLineConfigFilter;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeContentCompareDetailResult that = (NodeContentCompareDetailResult) obj;
        return Objects.equals(this.sourceDb, that.sourceDb) && Objects.equals(this.targetDb, that.targetDb)
            && Objects.equals(this.sourceTableName, that.sourceTableName)
            && Objects.equals(this.targetTableName, that.targetTableName)
            && Objects.equals(this.sourceRowNum, that.sourceRowNum)
            && Objects.equals(this.targetRowNum, that.targetRowNum)
            && Objects.equals(this.differenceRowNum, that.differenceRowNum)
            && Objects.equals(this.lineCompareResult, that.lineCompareResult)
            && Objects.equals(this.contentCompareResult, that.contentCompareResult)
            && Objects.equals(this.message, that.message)
            && Objects.equals(this.compareLineConfigFilter, that.compareLineConfigFilter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceDb,
            targetDb,
            sourceTableName,
            targetTableName,
            sourceRowNum,
            targetRowNum,
            differenceRowNum,
            lineCompareResult,
            contentCompareResult,
            message,
            compareLineConfigFilter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeContentCompareDetailResult {\n");
        sb.append("    sourceDb: ").append(toIndentedString(sourceDb)).append("\n");
        sb.append("    targetDb: ").append(toIndentedString(targetDb)).append("\n");
        sb.append("    sourceTableName: ").append(toIndentedString(sourceTableName)).append("\n");
        sb.append("    targetTableName: ").append(toIndentedString(targetTableName)).append("\n");
        sb.append("    sourceRowNum: ").append(toIndentedString(sourceRowNum)).append("\n");
        sb.append("    targetRowNum: ").append(toIndentedString(targetRowNum)).append("\n");
        sb.append("    differenceRowNum: ").append(toIndentedString(differenceRowNum)).append("\n");
        sb.append("    lineCompareResult: ").append(toIndentedString(lineCompareResult)).append("\n");
        sb.append("    contentCompareResult: ").append(toIndentedString(contentCompareResult)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    compareLineConfigFilter: ").append(toIndentedString(compareLineConfigFilter)).append("\n");
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
