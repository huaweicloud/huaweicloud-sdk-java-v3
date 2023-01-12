package com.huaweicloud.sdk.secmaster.v2.model;

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
    @JsonProperty(value = "date_type")

    private String dateType;

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
     * ID of workspace
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
     * Playbook instance status. RUNNING、FINISHED、FAILED、RETRYING、 TERMINATING、TERMINATED
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListPlaybookInstancesRequest withDateType(String dateType) {
        this.dateType = dateType;
        return this;
    }

    /**
     * date type, START END
     * @return dateType
     */
    public String getDateType() {
        return dateType;
    }

    public void setDateType(String dateType) {
        this.dateType = dateType;
    }

    public ListPlaybookInstancesRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * name
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
     * Playbook name.
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
     * Dataclass name.
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
     * Dataobject name.
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
     * trigger type. DEBUG, TIMER, EVENT, MANUAL
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
     * 起始时间
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
     * 结束时间
     * @return toDate
     */
    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public ListPlaybookInstancesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * request limit size
     * minimum: 1
     * maximum: 999999
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
     * request offset, from 0
     * minimum: 0
     * maximum: 999999
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPlaybookInstancesRequest listPlaybookInstancesRequest = (ListPlaybookInstancesRequest) o;
        return Objects.equals(this.workspaceId, listPlaybookInstancesRequest.workspaceId)
            && Objects.equals(this.status, listPlaybookInstancesRequest.status)
            && Objects.equals(this.dateType, listPlaybookInstancesRequest.dateType)
            && Objects.equals(this.name, listPlaybookInstancesRequest.name)
            && Objects.equals(this.playbookName, listPlaybookInstancesRequest.playbookName)
            && Objects.equals(this.dataclassName, listPlaybookInstancesRequest.dataclassName)
            && Objects.equals(this.dataobjectName, listPlaybookInstancesRequest.dataobjectName)
            && Objects.equals(this.triggerType, listPlaybookInstancesRequest.triggerType)
            && Objects.equals(this.fromDate, listPlaybookInstancesRequest.fromDate)
            && Objects.equals(this.toDate, listPlaybookInstancesRequest.toDate)
            && Objects.equals(this.limit, listPlaybookInstancesRequest.limit)
            && Objects.equals(this.offset, listPlaybookInstancesRequest.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId,
            status,
            dateType,
            name,
            playbookName,
            dataclassName,
            dataobjectName,
            triggerType,
            fromDate,
            toDate,
            limit,
            offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPlaybookInstancesRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    dateType: ").append(toIndentedString(dateType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    playbookName: ").append(toIndentedString(playbookName)).append("\n");
        sb.append("    dataclassName: ").append(toIndentedString(dataclassName)).append("\n");
        sb.append("    dataobjectName: ").append(toIndentedString(dataobjectName)).append("\n");
        sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
        sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
        sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
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
