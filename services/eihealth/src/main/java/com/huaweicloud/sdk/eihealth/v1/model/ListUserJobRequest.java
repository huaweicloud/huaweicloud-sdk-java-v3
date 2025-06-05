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
public class ListUserJobRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_creator")

    private Boolean isCreator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eihealth_project_names")

    private List<String> eihealthProjectNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "types")

    private List<String> types = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_list")

    private List<String> statusList = null;

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
    @JsonProperty(value = "start_finish_time")

    private Long startFinishTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_finish_time")

    private Long endFinishTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private String sortKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private String sortDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    public ListUserJobRequest withIsCreator(Boolean isCreator) {
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

    public ListUserJobRequest withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * 作业名称，取值范围：长度为[1,63]，以小写字母开头，允许出现中划线（-）、小写字母和数字，且必须以小写字母或数字结尾。
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public ListUserJobRequest withEihealthProjectNames(List<String> eihealthProjectNames) {
        this.eihealthProjectNames = eihealthProjectNames;
        return this;
    }

    public ListUserJobRequest addEihealthProjectNamesItem(String eihealthProjectNamesItem) {
        if (this.eihealthProjectNames == null) {
            this.eihealthProjectNames = new ArrayList<>();
        }
        this.eihealthProjectNames.add(eihealthProjectNamesItem);
        return this;
    }

    public ListUserJobRequest withEihealthProjectNames(Consumer<List<String>> eihealthProjectNamesSetter) {
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

    public ListUserJobRequest withTypes(List<String> types) {
        this.types = types;
        return this;
    }

    public ListUserJobRequest addTypesItem(String typesItem) {
        if (this.types == null) {
            this.types = new ArrayList<>();
        }
        this.types.add(typesItem);
        return this;
    }

    public ListUserJobRequest withTypes(Consumer<List<String>> typesSetter) {
        if (this.types == null) {
            this.types = new ArrayList<>();
        }
        typesSetter.accept(this.types);
        return this;
    }

    /**
     * 作业类型列表，支持workflow|app。
     * @return types
     */
    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public ListUserJobRequest withStatusList(List<String> statusList) {
        this.statusList = statusList;
        return this;
    }

    public ListUserJobRequest addStatusListItem(String statusListItem) {
        if (this.statusList == null) {
            this.statusList = new ArrayList<>();
        }
        this.statusList.add(statusListItem);
        return this;
    }

    public ListUserJobRequest withStatusList(Consumer<List<String>> statusListSetter) {
        if (this.statusList == null) {
            this.statusList = new ArrayList<>();
        }
        statusListSetter.accept(this.statusList);
        return this;
    }

    /**
     * 作业运行状态列表，支持Succeeded|Running|Pending|Failed|Cancelling|Cancelled|Unknown。
     * @return statusList
     */
    public List<String> getStatusList() {
        return statusList;
    }

    public void setStatusList(List<String> statusList) {
        this.statusList = statusList;
    }

    public ListUserJobRequest withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public ListUserJobRequest addLabelsItem(String labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public ListUserJobRequest withLabels(Consumer<List<String>> labelsSetter) {
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

    public ListUserJobRequest withStartCreateTime(Long startCreateTime) {
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

    public ListUserJobRequest withEndCreateTime(Long endCreateTime) {
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

    public ListUserJobRequest withStartFinishTime(Long startFinishTime) {
        this.startFinishTime = startFinishTime;
        return this;
    }

    /**
     * 开始完成时间。
     * minimum: 1000000000000
     * maximum: 9999999999999
     * @return startFinishTime
     */
    public Long getStartFinishTime() {
        return startFinishTime;
    }

    public void setStartFinishTime(Long startFinishTime) {
        this.startFinishTime = startFinishTime;
    }

    public ListUserJobRequest withEndFinishTime(Long endFinishTime) {
        this.endFinishTime = endFinishTime;
        return this;
    }

    /**
     * 结束完成时间。
     * minimum: 1000000000000
     * maximum: 9999999999999
     * @return endFinishTime
     */
    public Long getEndFinishTime() {
        return endFinishTime;
    }

    public void setEndFinishTime(Long endFinishTime) {
        this.endFinishTime = endFinishTime;
    }

    public ListUserJobRequest withSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * 排序规则，默认根据创建时间降序，支持create_time|finish_time。
     * @return sortKey
     */
    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public ListUserJobRequest withSortDir(String sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /**
     * 排序规则，目前默认时间降序。
     * @return sortDir
     */
    public String getSortDir() {
        return sortDir;
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
    }

    public ListUserJobRequest withLimit(Integer limit) {
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

    public ListUserJobRequest withOffset(Integer offset) {
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
        ListUserJobRequest that = (ListUserJobRequest) obj;
        return Objects.equals(this.isCreator, that.isCreator) && Objects.equals(this.jobName, that.jobName)
            && Objects.equals(this.eihealthProjectNames, that.eihealthProjectNames)
            && Objects.equals(this.types, that.types) && Objects.equals(this.statusList, that.statusList)
            && Objects.equals(this.labels, that.labels) && Objects.equals(this.startCreateTime, that.startCreateTime)
            && Objects.equals(this.endCreateTime, that.endCreateTime)
            && Objects.equals(this.startFinishTime, that.startFinishTime)
            && Objects.equals(this.endFinishTime, that.endFinishTime) && Objects.equals(this.sortKey, that.sortKey)
            && Objects.equals(this.sortDir, that.sortDir) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isCreator,
            jobName,
            eihealthProjectNames,
            types,
            statusList,
            labels,
            startCreateTime,
            endCreateTime,
            startFinishTime,
            endFinishTime,
            sortKey,
            sortDir,
            limit,
            offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUserJobRequest {\n");
        sb.append("    isCreator: ").append(toIndentedString(isCreator)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    eihealthProjectNames: ").append(toIndentedString(eihealthProjectNames)).append("\n");
        sb.append("    types: ").append(toIndentedString(types)).append("\n");
        sb.append("    statusList: ").append(toIndentedString(statusList)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    startCreateTime: ").append(toIndentedString(startCreateTime)).append("\n");
        sb.append("    endCreateTime: ").append(toIndentedString(endCreateTime)).append("\n");
        sb.append("    startFinishTime: ").append(toIndentedString(startFinishTime)).append("\n");
        sb.append("    endFinishTime: ").append(toIndentedString(endFinishTime)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
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
