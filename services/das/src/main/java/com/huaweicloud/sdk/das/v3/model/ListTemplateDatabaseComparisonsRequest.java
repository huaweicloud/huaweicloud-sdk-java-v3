package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListTemplateDatabaseComparisonsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_at1")

    private Long startAt1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_at1")

    private Long endAt1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_at2")

    private Long startAt2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_at2")

    private Long endAt2;

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
    @JsonProperty(value = "sort")

    private String sort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asc")

    private Boolean asc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    public ListTemplateDatabaseComparisonsRequest withInstanceId(String instanceId) {
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

    public ListTemplateDatabaseComparisonsRequest withNodeId(String nodeId) {
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

    public ListTemplateDatabaseComparisonsRequest withStartAt1(Long startAt1) {
        this.startAt1 = startAt1;
        return this;
    }

    /**
     * 比较时间段1的开始时间，Unix timestamp，单位：毫秒
     * @return startAt1
     */
    public Long getStartAt1() {
        return startAt1;
    }

    public void setStartAt1(Long startAt1) {
        this.startAt1 = startAt1;
    }

    public ListTemplateDatabaseComparisonsRequest withEndAt1(Long endAt1) {
        this.endAt1 = endAt1;
        return this;
    }

    /**
     * 比较时间段1的结束时间，Unix timestamp，单位：毫秒
     * @return endAt1
     */
    public Long getEndAt1() {
        return endAt1;
    }

    public void setEndAt1(Long endAt1) {
        this.endAt1 = endAt1;
    }

    public ListTemplateDatabaseComparisonsRequest withStartAt2(Long startAt2) {
        this.startAt2 = startAt2;
        return this;
    }

    /**
     * 比较时间段2的开始时间，Unix timestamp，单位：毫秒
     * @return startAt2
     */
    public Long getStartAt2() {
        return startAt2;
    }

    public void setStartAt2(Long startAt2) {
        this.startAt2 = startAt2;
    }

    public ListTemplateDatabaseComparisonsRequest withEndAt2(Long endAt2) {
        this.endAt2 = endAt2;
        return this;
    }

    /**
     * 比较时间段2的结束时间，Unix timestamp，单位：毫秒
     * @return endAt2
     */
    public Long getEndAt2() {
        return endAt2;
    }

    public void setEndAt2(Long endAt2) {
        this.endAt2 = endAt2;
    }

    public ListTemplateDatabaseComparisonsRequest withOperation(String operation) {
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

    public ListTemplateDatabaseComparisonsRequest withDbNameList(List<String> dbNameList) {
        this.dbNameList = dbNameList;
        return this;
    }

    public ListTemplateDatabaseComparisonsRequest addDbNameListItem(String dbNameListItem) {
        if (this.dbNameList == null) {
            this.dbNameList = new ArrayList<>();
        }
        this.dbNameList.add(dbNameListItem);
        return this;
    }

    public ListTemplateDatabaseComparisonsRequest withDbNameList(Consumer<List<String>> dbNameListSetter) {
        if (this.dbNameList == null) {
            this.dbNameList = new ArrayList<>();
        }
        dbNameListSetter.accept(this.dbNameList);
        return this;
    }

    /**
     * 数据库列表
     * @return dbNameList
     */
    public List<String> getDbNameList() {
        return dbNameList;
    }

    public void setDbNameList(List<String> dbNameList) {
        this.dbNameList = dbNameList;
    }

    public ListTemplateDatabaseComparisonsRequest withKeyword(String keyword) {
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

    public ListTemplateDatabaseComparisonsRequest withSort(String sort) {
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

    public ListTemplateDatabaseComparisonsRequest withAsc(Boolean asc) {
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

    public ListTemplateDatabaseComparisonsRequest withSize(Integer size) {
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
        ListTemplateDatabaseComparisonsRequest that = (ListTemplateDatabaseComparisonsRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.startAt1, that.startAt1) && Objects.equals(this.endAt1, that.endAt1)
            && Objects.equals(this.startAt2, that.startAt2) && Objects.equals(this.endAt2, that.endAt2)
            && Objects.equals(this.operation, that.operation) && Objects.equals(this.dbNameList, that.dbNameList)
            && Objects.equals(this.keyword, that.keyword) && Objects.equals(this.sort, that.sort)
            && Objects.equals(this.asc, that.asc) && Objects.equals(this.size, that.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId,
            nodeId,
            startAt1,
            endAt1,
            startAt2,
            endAt2,
            operation,
            dbNameList,
            keyword,
            sort,
            asc,
            size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTemplateDatabaseComparisonsRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    startAt1: ").append(toIndentedString(startAt1)).append("\n");
        sb.append("    endAt1: ").append(toIndentedString(endAt1)).append("\n");
        sb.append("    startAt2: ").append(toIndentedString(startAt2)).append("\n");
        sb.append("    endAt2: ").append(toIndentedString(endAt2)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    dbNameList: ").append(toIndentedString(dbNameList)).append("\n");
        sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
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
