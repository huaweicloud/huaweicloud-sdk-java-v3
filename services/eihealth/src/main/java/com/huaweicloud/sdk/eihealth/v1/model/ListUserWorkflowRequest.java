package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListUserWorkflowRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_creator")

    private Boolean isCreator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "summary")

    private String summary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eihealth_project_names")

    private List<String> eihealthProjectNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private List<String> labels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_create_time")

    private Long startCreateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_create_time")

    private Long endCreateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_update_time")

    private Long startUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_update_time")

    private Long endUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private String sortDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private String sortKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    public ListUserWorkflowRequest withIsCreator(Boolean isCreator) {
        this.isCreator = isCreator;
        return this;
    }

    /**
     * 是否仅展示本人创建资源。
     * @return isCreator
     */
    public Boolean getIsCreator() {
        return isCreator;
    }

    public void setIsCreator(Boolean isCreator) {
        this.isCreator = isCreator;
    }

    public ListUserWorkflowRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 流程ID，仅支持精确搜索。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListUserWorkflowRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 流程名称，支持模糊搜索。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListUserWorkflowRequest withSummary(String summary) {
        this.summary = summary;
        return this;
    }

    /**
     * 短描述，支持模糊搜索。
     * @return summary
     */
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public ListUserWorkflowRequest withEihealthProjectNames(List<String> eihealthProjectNames) {
        this.eihealthProjectNames = eihealthProjectNames;
        return this;
    }

    public ListUserWorkflowRequest addEihealthProjectNamesItem(String eihealthProjectNamesItem) {
        if (this.eihealthProjectNames == null) {
            this.eihealthProjectNames = new ArrayList<>();
        }
        this.eihealthProjectNames.add(eihealthProjectNamesItem);
        return this;
    }

    public ListUserWorkflowRequest withEihealthProjectNames(Consumer<List<String>> eihealthProjectNamesSetter) {
        if (this.eihealthProjectNames == null) {
            this.eihealthProjectNames = new ArrayList<>();
        }
        eihealthProjectNamesSetter.accept(this.eihealthProjectNames);
        return this;
    }

    /**
     * 空间名称列表，多个值之间使用逗号分隔。
     * @return eihealthProjectNames
     */
    public List<String> getEihealthProjectNames() {
        return eihealthProjectNames;
    }

    public void setEihealthProjectNames(List<String> eihealthProjectNames) {
        this.eihealthProjectNames = eihealthProjectNames;
    }

    public ListUserWorkflowRequest withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public ListUserWorkflowRequest addLabelsItem(String labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public ListUserWorkflowRequest withLabels(Consumer<List<String>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * 标签列表。
     * @return labels
     */
    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public ListUserWorkflowRequest withStartCreateTime(Long startCreateTime) {
        this.startCreateTime = startCreateTime;
        return this;
    }

    /**
     * 开始创建时间。
     * minimum: 1000000000000
     * maximum: 9999999999999
     * @return startCreateTime
     */
    public Long getStartCreateTime() {
        return startCreateTime;
    }

    public void setStartCreateTime(Long startCreateTime) {
        this.startCreateTime = startCreateTime;
    }

    public ListUserWorkflowRequest withEndCreateTime(Long endCreateTime) {
        this.endCreateTime = endCreateTime;
        return this;
    }

    /**
     * 结束创建时间。
     * minimum: 1000000000000
     * maximum: 9999999999999
     * @return endCreateTime
     */
    public Long getEndCreateTime() {
        return endCreateTime;
    }

    public void setEndCreateTime(Long endCreateTime) {
        this.endCreateTime = endCreateTime;
    }

    public ListUserWorkflowRequest withStartUpdateTime(Long startUpdateTime) {
        this.startUpdateTime = startUpdateTime;
        return this;
    }

    /**
     * 开始更新时间。
     * minimum: 1000000000000
     * maximum: 9999999999999
     * @return startUpdateTime
     */
    public Long getStartUpdateTime() {
        return startUpdateTime;
    }

    public void setStartUpdateTime(Long startUpdateTime) {
        this.startUpdateTime = startUpdateTime;
    }

    public ListUserWorkflowRequest withEndUpdateTime(Long endUpdateTime) {
        this.endUpdateTime = endUpdateTime;
        return this;
    }

    /**
     * 结束更新时间。
     * minimum: 1000000000000
     * maximum: 9999999999999
     * @return endUpdateTime
     */
    public Long getEndUpdateTime() {
        return endUpdateTime;
    }

    public void setEndUpdateTime(Long endUpdateTime) {
        this.endUpdateTime = endUpdateTime;
    }

    public ListUserWorkflowRequest withSortDir(String sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /**
     * 排序规则。
     * @return sortDir
     */
    public String getSortDir() {
        return sortDir;
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
    }

    public ListUserWorkflowRequest withSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * 排序规则，默认根据创建时间降序，支持根据create_time|update_time排序。
     * @return sortKey
     */
    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public ListUserWorkflowRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 限制量，单次查询总量，必须由数字组成，默认为100，取值范围[1,1000]。
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListUserWorkflowRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，查询起始偏移，必须由数字组成，默认为0，取值范围[0,100000000]。
     * minimum: 0
     * maximum: 100000000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListUserWorkflowRequest that = (ListUserWorkflowRequest) obj;
        return Objects.equals(this.isCreator, that.isCreator) && Objects.equals(this.id, that.id)
            && Objects.equals(this.name, that.name) && Objects.equals(this.summary, that.summary)
            && Objects.equals(this.eihealthProjectNames, that.eihealthProjectNames)
            && Objects.equals(this.labels, that.labels) && Objects.equals(this.startCreateTime, that.startCreateTime)
            && Objects.equals(this.endCreateTime, that.endCreateTime)
            && Objects.equals(this.startUpdateTime, that.startUpdateTime)
            && Objects.equals(this.endUpdateTime, that.endUpdateTime) && Objects.equals(this.sortDir, that.sortDir)
            && Objects.equals(this.sortKey, that.sortKey) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isCreator,
            id,
            name,
            summary,
            eihealthProjectNames,
            labels,
            startCreateTime,
            endCreateTime,
            startUpdateTime,
            endUpdateTime,
            sortDir,
            sortKey,
            limit,
            offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUserWorkflowRequest {\n");
        sb.append("    isCreator: ").append(toIndentedString(isCreator)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
        sb.append("    eihealthProjectNames: ").append(toIndentedString(eihealthProjectNames)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    startCreateTime: ").append(toIndentedString(startCreateTime)).append("\n");
        sb.append("    endCreateTime: ").append(toIndentedString(endCreateTime)).append("\n");
        sb.append("    startUpdateTime: ").append(toIndentedString(startUpdateTime)).append("\n");
        sb.append("    endUpdateTime: ").append(toIndentedString(endUpdateTime)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
