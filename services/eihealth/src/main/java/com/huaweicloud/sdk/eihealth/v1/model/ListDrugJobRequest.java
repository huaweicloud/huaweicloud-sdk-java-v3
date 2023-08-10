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
public class ListDrugJobRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eihealth_project_id")

    private String eihealthProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private String sortDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private String sortKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private List<String> labels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_list")

    private List<String> statusList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type_list")

    private List<String> typeList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_start_time")

    private Long createStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_end_time")

    private Long createEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finish_start_time")

    private Long finishStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finish_end_time")

    private Long finishEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_time_range")

    private String totalTimeRange;

    public ListDrugJobRequest withEihealthProjectId(String eihealthProjectId) {
        this.eihealthProjectId = eihealthProjectId;
        return this;
    }

    /**
     * 盘古辅助制药平台项目ID。
     * @return eihealthProjectId
     */
    public String getEihealthProjectId() {
        return eihealthProjectId;
    }

    public void setEihealthProjectId(String eihealthProjectId) {
        this.eihealthProjectId = eihealthProjectId;
    }

    public ListDrugJobRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 限制量，单次查询总量，必须由数字组成，默认为100，取值范围[1,1000]
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

    public ListDrugJobRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，查询起始偏移，必须由数字组成，默认为0，取值范围[0,100000000]
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

    public ListDrugJobRequest withSortDir(String sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /**
     * 排序规则 目前默认时间降序
     * @return sortDir
     */
    public String getSortDir() {
        return sortDir;
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
    }

    public ListDrugJobRequest withSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * 排序规则 目前默认时间降序，支持根据status
     * @return sortKey
     */
    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public ListDrugJobRequest withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * 作业名称
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public ListDrugJobRequest withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public ListDrugJobRequest addLabelsItem(String labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public ListDrugJobRequest withLabels(Consumer<List<String>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * 标签列表
     * @return labels
     */
    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public ListDrugJobRequest withStatusList(List<String> statusList) {
        this.statusList = statusList;
        return this;
    }

    public ListDrugJobRequest addStatusListItem(String statusListItem) {
        if (this.statusList == null) {
            this.statusList = new ArrayList<>();
        }
        this.statusList.add(statusListItem);
        return this;
    }

    public ListDrugJobRequest withStatusList(Consumer<List<String>> statusListSetter) {
        if (this.statusList == null) {
            this.statusList = new ArrayList<>();
        }
        statusListSetter.accept(this.statusList);
        return this;
    }

    /**
     * 作业运行状态列表, 支持WAITING|RUNNING|FINISHED|FAILED|CANCELLED
     * @return statusList
     */
    public List<String> getStatusList() {
        return statusList;
    }

    public void setStatusList(List<String> statusList) {
        this.statusList = statusList;
    }

    public ListDrugJobRequest withTypeList(List<String> typeList) {
        this.typeList = typeList;
        return this;
    }

    public ListDrugJobRequest addTypeListItem(String typeListItem) {
        if (this.typeList == null) {
            this.typeList = new ArrayList<>();
        }
        this.typeList.add(typeListItem);
        return this;
    }

    public ListDrugJobRequest withTypeList(Consumer<List<String>> typeListSetter) {
        if (this.typeList == null) {
            this.typeList = new ArrayList<>();
        }
        typeListSetter.accept(this.typeList);
        return this;
    }

    /**
     * 作业类型列表, 支持DOCKING|OPTIMIZATION|SYNTHESIS|FEP
     * @return typeList
     */
    public List<String> getTypeList() {
        return typeList;
    }

    public void setTypeList(List<String> typeList) {
        this.typeList = typeList;
    }

    public ListDrugJobRequest withCreateStartTime(Long createStartTime) {
        this.createStartTime = createStartTime;
        return this;
    }

    /**
     * 最小创建时间
     * minimum: 1000000000000
     * maximum: 9999999999999
     * @return createStartTime
     */
    public Long getCreateStartTime() {
        return createStartTime;
    }

    public void setCreateStartTime(Long createStartTime) {
        this.createStartTime = createStartTime;
    }

    public ListDrugJobRequest withCreateEndTime(Long createEndTime) {
        this.createEndTime = createEndTime;
        return this;
    }

    /**
     * 最大创建时间
     * minimum: 1000000000000
     * maximum: 9999999999999
     * @return createEndTime
     */
    public Long getCreateEndTime() {
        return createEndTime;
    }

    public void setCreateEndTime(Long createEndTime) {
        this.createEndTime = createEndTime;
    }

    public ListDrugJobRequest withFinishStartTime(Long finishStartTime) {
        this.finishStartTime = finishStartTime;
        return this;
    }

    /**
     * 最小结束时间
     * minimum: 1000000000000
     * maximum: 9999999999999
     * @return finishStartTime
     */
    public Long getFinishStartTime() {
        return finishStartTime;
    }

    public void setFinishStartTime(Long finishStartTime) {
        this.finishStartTime = finishStartTime;
    }

    public ListDrugJobRequest withFinishEndTime(Long finishEndTime) {
        this.finishEndTime = finishEndTime;
        return this;
    }

    /**
     * 最大结束时间
     * minimum: 1000000000000
     * maximum: 9999999999999
     * @return finishEndTime
     */
    public Long getFinishEndTime() {
        return finishEndTime;
    }

    public void setFinishEndTime(Long finishEndTime) {
        this.finishEndTime = finishEndTime;
    }

    public ListDrugJobRequest withTotalTimeRange(String totalTimeRange) {
        this.totalTimeRange = totalTimeRange;
        return this;
    }

    /**
     * 总运行时长, 支持ONE_DAY_MORE|ONE_DAY|ONE_HOUR|TWELVE_HOUR
     * @return totalTimeRange
     */
    public String getTotalTimeRange() {
        return totalTimeRange;
    }

    public void setTotalTimeRange(String totalTimeRange) {
        this.totalTimeRange = totalTimeRange;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDrugJobRequest that = (ListDrugJobRequest) obj;
        return Objects.equals(this.eihealthProjectId, that.eihealthProjectId) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.sortDir, that.sortDir)
            && Objects.equals(this.sortKey, that.sortKey) && Objects.equals(this.jobName, that.jobName)
            && Objects.equals(this.labels, that.labels) && Objects.equals(this.statusList, that.statusList)
            && Objects.equals(this.typeList, that.typeList)
            && Objects.equals(this.createStartTime, that.createStartTime)
            && Objects.equals(this.createEndTime, that.createEndTime)
            && Objects.equals(this.finishStartTime, that.finishStartTime)
            && Objects.equals(this.finishEndTime, that.finishEndTime)
            && Objects.equals(this.totalTimeRange, that.totalTimeRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eihealthProjectId,
            limit,
            offset,
            sortDir,
            sortKey,
            jobName,
            labels,
            statusList,
            typeList,
            createStartTime,
            createEndTime,
            finishStartTime,
            finishEndTime,
            totalTimeRange);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDrugJobRequest {\n");
        sb.append("    eihealthProjectId: ").append(toIndentedString(eihealthProjectId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    statusList: ").append(toIndentedString(statusList)).append("\n");
        sb.append("    typeList: ").append(toIndentedString(typeList)).append("\n");
        sb.append("    createStartTime: ").append(toIndentedString(createStartTime)).append("\n");
        sb.append("    createEndTime: ").append(toIndentedString(createEndTime)).append("\n");
        sb.append("    finishStartTime: ").append(toIndentedString(finishStartTime)).append("\n");
        sb.append("    finishEndTime: ").append(toIndentedString(finishEndTime)).append("\n");
        sb.append("    totalTimeRange: ").append(toIndentedString(totalTimeRange)).append("\n");
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
