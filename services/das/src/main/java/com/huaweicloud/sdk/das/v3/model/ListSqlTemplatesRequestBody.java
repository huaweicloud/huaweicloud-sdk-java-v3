package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询SQL模板列表请求体
 */
public class ListSqlTemplatesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_at")

    private Long startAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_at")

    private Long endAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation")

    private String operation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name_list")

    private List<String> dbNameList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyword")

    private String keyword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_template_id")

    private String sqlTemplateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort")

    private String sort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asc")

    private Boolean asc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    public ListSqlTemplatesRequestBody withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID，实例的唯一标识
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListSqlTemplatesRequestBody withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 节点ID，实例节点的唯一标识
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public ListSqlTemplatesRequestBody withStartAt(Long startAt) {
        this.startAt = startAt;
        return this;
    }

    /**
     * 开始时间，Unix timestamp，单位：毫秒
     * @return startAt
     */
    public Long getStartAt() {
        return startAt;
    }

    public void setStartAt(Long startAt) {
        this.startAt = startAt;
    }

    public ListSqlTemplatesRequestBody withEndAt(Long endAt) {
        this.endAt = endAt;
        return this;
    }

    /**
     * 结束时间，Unix timestamp，单位：毫秒
     * @return endAt
     */
    public Long getEndAt() {
        return endAt;
    }

    public void setEndAt(Long endAt) {
        this.endAt = endAt;
    }

    public ListSqlTemplatesRequestBody withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * 操作类型，可组合，用逗号分隔
     * @return operation
     */
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public ListSqlTemplatesRequestBody withDbNameList(List<String> dbNameList) {
        this.dbNameList = dbNameList;
        return this;
    }

    public ListSqlTemplatesRequestBody addDbNameListItem(String dbNameListItem) {
        if (this.dbNameList == null) {
            this.dbNameList = new ArrayList<>();
        }
        this.dbNameList.add(dbNameListItem);
        return this;
    }

    public ListSqlTemplatesRequestBody withDbNameList(Consumer<List<String>> dbNameListSetter) {
        if (this.dbNameList == null) {
            this.dbNameList = new ArrayList<>();
        }
        dbNameListSetter.accept(this.dbNameList);
        return this;
    }

    /**
     * 数据库名称列表
     * @return dbNameList
     */
    public List<String> getDbNameList() {
        return dbNameList;
    }

    public void setDbNameList(List<String> dbNameList) {
        this.dbNameList = dbNameList;
    }

    public ListSqlTemplatesRequestBody withKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    /**
     * 关键字
     * @return keyword
     */
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public ListSqlTemplatesRequestBody withSqlTemplateId(String sqlTemplateId) {
        this.sqlTemplateId = sqlTemplateId;
        return this;
    }

    /**
     * SQL模板ID
     * @return sqlTemplateId
     */
    public String getSqlTemplateId() {
        return sqlTemplateId;
    }

    public void setSqlTemplateId(String sqlTemplateId) {
        this.sqlTemplateId = sqlTemplateId;
    }

    public ListSqlTemplatesRequestBody withSort(String sort) {
        this.sort = sort;
        return this;
    }

    /**
     * 排序字段，取值范围：executeNum（执行次数）、totalCost（总耗时）、avgCost（平均耗时）、totalScan（总扫描行数）、avgScan（平均扫描行数）
     * @return sort
     */
    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public ListSqlTemplatesRequestBody withAsc(Boolean asc) {
        this.asc = asc;
        return this;
    }

    /**
     * 排序顺序，true（正序）、false（逆序）
     * @return asc
     */
    public Boolean getAsc() {
        return asc;
    }

    public void setAsc(Boolean asc) {
        this.asc = asc;
    }

    public ListSqlTemplatesRequestBody withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 数量，默认30
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSqlTemplatesRequestBody that = (ListSqlTemplatesRequestBody) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.startAt, that.startAt) && Objects.equals(this.endAt, that.endAt)
            && Objects.equals(this.operation, that.operation) && Objects.equals(this.dbNameList, that.dbNameList)
            && Objects.equals(this.keyword, that.keyword) && Objects.equals(this.sqlTemplateId, that.sqlTemplateId)
            && Objects.equals(this.sort, that.sort) && Objects.equals(this.asc, that.asc)
            && Objects.equals(this.size, that.size);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(instanceId, nodeId, startAt, endAt, operation, dbNameList, keyword, sqlTemplateId, sort, asc, size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSqlTemplatesRequestBody {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
        sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    dbNameList: ").append(toIndentedString(dbNameList)).append("\n");
        sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
        sb.append("    sqlTemplateId: ").append(toIndentedString(sqlTemplateId)).append("\n");
        sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
        sb.append("    asc: ").append(toIndentedString(asc)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
