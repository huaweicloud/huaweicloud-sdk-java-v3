package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建索引使用导出任务请求体
 */
public class CreateIndexUsageExportTaskNewRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "export_type")

    private String exportType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collect_time")

    private Long collectTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditions")

    private List<IndexUsageCondition> conditions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_name")

    private String objectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_field")

    private String sortField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_asc")

    private Boolean sortAsc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cur_page")

    private Integer curPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "per_page")

    private Integer perPage;

    public CreateIndexUsageExportTaskNewRequestBody withExportType(String exportType) {
        this.exportType = exportType;
        return this;
    }

    /**
     * 导出类型。取值范围：missingindex（导出表数据）、missingindexscript（导出脚本）
     * @return exportType
     */
    public String getExportType() {
        return exportType;
    }

    public void setExportType(String exportType) {
        this.exportType = exportType;
    }

    public CreateIndexUsageExportTaskNewRequestBody withCollectTime(Long collectTime) {
        this.collectTime = collectTime;
        return this;
    }

    /**
     * 采集时间
     * @return collectTime
     */
    public Long getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(Long collectTime) {
        this.collectTime = collectTime;
    }

    public CreateIndexUsageExportTaskNewRequestBody withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * 桶名
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public CreateIndexUsageExportTaskNewRequestBody withConditions(List<IndexUsageCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public CreateIndexUsageExportTaskNewRequestBody addConditionsItem(IndexUsageCondition conditionsItem) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditionsItem);
        return this;
    }

    public CreateIndexUsageExportTaskNewRequestBody withConditions(
        Consumer<List<IndexUsageCondition>> conditionsSetter) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        conditionsSetter.accept(this.conditions);
        return this;
    }

    /**
     * 过滤条件
     * @return conditions
     */
    public List<IndexUsageCondition> getConditions() {
        return conditions;
    }

    public void setConditions(List<IndexUsageCondition> conditions) {
        this.conditions = conditions;
    }

    public CreateIndexUsageExportTaskNewRequestBody withObjectName(String objectName) {
        this.objectName = objectName;
        return this;
    }

    /**
     * 表名称
     * @return objectName
     */
    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public CreateIndexUsageExportTaskNewRequestBody withSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }

    /**
     * 排序字段
     * @return sortField
     */
    public String getSortField() {
        return sortField;
    }

    public void setSortField(String sortField) {
        this.sortField = sortField;
    }

    public CreateIndexUsageExportTaskNewRequestBody withSortAsc(Boolean sortAsc) {
        this.sortAsc = sortAsc;
        return this;
    }

    /**
     * 排序是否升序
     * @return sortAsc
     */
    public Boolean getSortAsc() {
        return sortAsc;
    }

    public void setSortAsc(Boolean sortAsc) {
        this.sortAsc = sortAsc;
    }

    public CreateIndexUsageExportTaskNewRequestBody withCurPage(Integer curPage) {
        this.curPage = curPage;
        return this;
    }

    /**
     * 当前页
     * @return curPage
     */
    public Integer getCurPage() {
        return curPage;
    }

    public void setCurPage(Integer curPage) {
        this.curPage = curPage;
    }

    public CreateIndexUsageExportTaskNewRequestBody withPerPage(Integer perPage) {
        this.perPage = perPage;
        return this;
    }

    /**
     * 页大小
     * @return perPage
     */
    public Integer getPerPage() {
        return perPage;
    }

    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateIndexUsageExportTaskNewRequestBody that = (CreateIndexUsageExportTaskNewRequestBody) obj;
        return Objects.equals(this.exportType, that.exportType) && Objects.equals(this.collectTime, that.collectTime)
            && Objects.equals(this.bucketName, that.bucketName) && Objects.equals(this.conditions, that.conditions)
            && Objects.equals(this.objectName, that.objectName) && Objects.equals(this.sortField, that.sortField)
            && Objects.equals(this.sortAsc, that.sortAsc) && Objects.equals(this.curPage, that.curPage)
            && Objects.equals(this.perPage, that.perPage);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(exportType, collectTime, bucketName, conditions, objectName, sortField, sortAsc, curPage, perPage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateIndexUsageExportTaskNewRequestBody {\n");
        sb.append("    exportType: ").append(toIndentedString(exportType)).append("\n");
        sb.append("    collectTime: ").append(toIndentedString(collectTime)).append("\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
        sb.append("    objectName: ").append(toIndentedString(objectName)).append("\n");
        sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
        sb.append("    sortAsc: ").append(toIndentedString(sortAsc)).append("\n");
        sb.append("    curPage: ").append(toIndentedString(curPage)).append("\n");
        sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
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
