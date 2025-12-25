package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListPlaybookInstancesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "playbook_name")

    private String playbookName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataclass_name")

    private String dataclassName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataobject_name")

    private String dataobjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_type")

    private String triggerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from_date")

    private String fromDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to_date")

    private String toDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date_type")

    private String dateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    public ListPlaybookInstancesRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间ID
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ListPlaybookInstancesRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 剧本实例状态. (RUNNING--运行中、FINISHED--成功、FAILED--失败、RETRYING--重试中、TERMINATING--终止中、TERMINATED--已终止)
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListPlaybookInstancesRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListPlaybookInstancesRequest withPlaybookName(String playbookName) {
        this.playbookName = playbookName;
        return this;
    }

    /**
     * 剧本名称
     * @return playbookName
     */
    public String getPlaybookName() {
        return playbookName;
    }

    public void setPlaybookName(String playbookName) {
        this.playbookName = playbookName;
    }

    public ListPlaybookInstancesRequest withDataclassName(String dataclassName) {
        this.dataclassName = dataclassName;
        return this;
    }

    /**
     * 数据类名称
     * @return dataclassName
     */
    public String getDataclassName() {
        return dataclassName;
    }

    public void setDataclassName(String dataclassName) {
        this.dataclassName = dataclassName;
    }

    public ListPlaybookInstancesRequest withDataobjectName(String dataobjectName) {
        this.dataobjectName = dataobjectName;
        return this;
    }

    /**
     * 数据对象名称
     * @return dataobjectName
     */
    public String getDataobjectName() {
        return dataobjectName;
    }

    public void setDataobjectName(String dataobjectName) {
        this.dataobjectName = dataobjectName;
    }

    public ListPlaybookInstancesRequest withTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }

    /**
     * 触发类型. TIMER--定时触发, EVENT--事件触发
     * @return triggerType
     */
    public String getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType;
    }

    public ListPlaybookInstancesRequest withFromDate(String fromDate) {
        this.fromDate = fromDate;
        return this;
    }

    /**
     * 查询起始时间，时间格式 yyyy-MM-dd'T'HH:mm:ss.SSS'Z'Z
     * @return fromDate
     */
    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public ListPlaybookInstancesRequest withToDate(String toDate) {
        this.toDate = toDate;
        return this;
    }

    /**
     * 查询结束时间，时间格式 yyyy-MM-dd'T'HH:mm:ss.SSS'Z'Z
     * @return toDate
     */
    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public ListPlaybookInstancesRequest withDateType(String dateType) {
        this.dateType = dateType;
        return this;
    }

    /**
     * 时间类型. START--按照开始时间检索, END--按照结束时间检索
     * @return dateType
     */
    public String getDateType() {
        return dateType;
    }

    public void setDateType(String dateType) {
        this.dateType = dateType;
    }

    public ListPlaybookInstancesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页查询参数，用于指定一次查询最多的结果数，从1开始，limit 和 offset相加需要小于10000
     * minimum: 1
     * maximum: 9999
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListPlaybookInstancesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页查询参数。用于指定查询结果的起始位置，从0开始, limit 和 offset相加需要小于10000
     * minimum: 0
     * maximum: 9999
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
        ListPlaybookInstancesRequest that = (ListPlaybookInstancesRequest) obj;
        return Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.name, that.name) && Objects.equals(this.playbookName, that.playbookName)
            && Objects.equals(this.dataclassName, that.dataclassName)
            && Objects.equals(this.dataobjectName, that.dataobjectName)
            && Objects.equals(this.triggerType, that.triggerType) && Objects.equals(this.fromDate, that.fromDate)
            && Objects.equals(this.toDate, that.toDate) && Objects.equals(this.dateType, that.dateType)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId,
            status,
            name,
            playbookName,
            dataclassName,
            dataobjectName,
            triggerType,
            fromDate,
            toDate,
            dateType,
            limit,
            offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPlaybookInstancesRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    playbookName: ").append(toIndentedString(playbookName)).append("\n");
        sb.append("    dataclassName: ").append(toIndentedString(dataclassName)).append("\n");
        sb.append("    dataobjectName: ").append(toIndentedString(dataobjectName)).append("\n");
        sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
        sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
        sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
        sb.append("    dateType: ").append(toIndentedString(dateType)).append("\n");
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
