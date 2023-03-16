package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListDataJobRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eihealth_project_id")

    private String eihealthProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from_time")

    private Long fromTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to_time")

    private Long toTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finish_from_time")

    private Long finishFromTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finish_to_time")

    private Long finishToTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private String sortDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private String sortKey;

    public ListDataJobRequest withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 创建者名称
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public ListDataJobRequest withEihealthProjectId(String eihealthProjectId) {
        this.eihealthProjectId = eihealthProjectId;
        return this;
    }

    /**
     * 医疗智能体平台项目ID，您可以在EIHealth平台单击所需的项目名称，进入项目设置页面查看。
     * @return eihealthProjectId
     */
    public String getEihealthProjectId() {
        return eihealthProjectId;
    }

    public void setEihealthProjectId(String eihealthProjectId) {
        this.eihealthProjectId = eihealthProjectId;
    }

    public ListDataJobRequest withFromTime(Long fromTime) {
        this.fromTime = fromTime;
        return this;
    }

    /**
     * 查询该时间之后创建的数据作业
     * minimum: 1000000000000
     * maximum: 9999999999999
     * @return fromTime
     */
    public Long getFromTime() {
        return fromTime;
    }

    public void setFromTime(Long fromTime) {
        this.fromTime = fromTime;
    }

    public ListDataJobRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询条数
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

    public ListDataJobRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 数据作业名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListDataJobRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 查询偏移量
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

    public ListDataJobRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 数据作业状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListDataJobRequest withToTime(Long toTime) {
        this.toTime = toTime;
        return this;
    }

    /**
     * 查询该时间之前创建的数据作业
     * minimum: 1000000000000
     * maximum: 9999999999999
     * @return toTime
     */
    public Long getToTime() {
        return toTime;
    }

    public void setToTime(Long toTime) {
        this.toTime = toTime;
    }

    public ListDataJobRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 数据作业类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ListDataJobRequest withFinishFromTime(Long finishFromTime) {
        this.finishFromTime = finishFromTime;
        return this;
    }

    /**
     * 查询该时间之后完成的数据作业
     * minimum: 1000000000000
     * maximum: 9999999999999
     * @return finishFromTime
     */
    public Long getFinishFromTime() {
        return finishFromTime;
    }

    public void setFinishFromTime(Long finishFromTime) {
        this.finishFromTime = finishFromTime;
    }

    public ListDataJobRequest withFinishToTime(Long finishToTime) {
        this.finishToTime = finishToTime;
        return this;
    }

    /**
     * 查询该时间之前完成的数据作业
     * minimum: 1000000000000
     * maximum: 9999999999999
     * @return finishToTime
     */
    public Long getFinishToTime() {
        return finishToTime;
    }

    public void setFinishToTime(Long finishToTime) {
        this.finishToTime = finishToTime;
    }

    public ListDataJobRequest withSortDir(String sortDir) {
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

    public ListDataJobRequest withSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * 排序规则 目前默认时间降序，支持根据status,name,type,creator,create_time,end_time
     * @return sortKey
     */
    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListDataJobRequest listDataJobRequest = (ListDataJobRequest) o;
        return Objects.equals(this.creator, listDataJobRequest.creator)
            && Objects.equals(this.eihealthProjectId, listDataJobRequest.eihealthProjectId)
            && Objects.equals(this.fromTime, listDataJobRequest.fromTime)
            && Objects.equals(this.limit, listDataJobRequest.limit)
            && Objects.equals(this.name, listDataJobRequest.name)
            && Objects.equals(this.offset, listDataJobRequest.offset)
            && Objects.equals(this.status, listDataJobRequest.status)
            && Objects.equals(this.toTime, listDataJobRequest.toTime)
            && Objects.equals(this.type, listDataJobRequest.type)
            && Objects.equals(this.finishFromTime, listDataJobRequest.finishFromTime)
            && Objects.equals(this.finishToTime, listDataJobRequest.finishToTime)
            && Objects.equals(this.sortDir, listDataJobRequest.sortDir)
            && Objects.equals(this.sortKey, listDataJobRequest.sortKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creator,
            eihealthProjectId,
            fromTime,
            limit,
            name,
            offset,
            status,
            toTime,
            type,
            finishFromTime,
            finishToTime,
            sortDir,
            sortKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDataJobRequest {\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    eihealthProjectId: ").append(toIndentedString(eihealthProjectId)).append("\n");
        sb.append("    fromTime: ").append(toIndentedString(fromTime)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    toTime: ").append(toIndentedString(toTime)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    finishFromTime: ").append(toIndentedString(finishFromTime)).append("\n");
        sb.append("    finishToTime: ").append(toIndentedString(finishToTime)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
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
