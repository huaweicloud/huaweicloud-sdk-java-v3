package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * WorkitemStatusRecords
 */
public class WorkitemStatusRecords {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "work_item_record_id")

    private String workItemRecordId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "work_item_id")

    private String workItemId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "work_item_statuses")

    private List<WorkitemStatus> workItemStatuses = null;

    public WorkitemStatusRecords withWorkItemRecordId(String workItemRecordId) {
        this.workItemRecordId = workItemRecordId;
        return this;
    }

    /**
     * 工作项的记录id，一个工作项对应一条记录
     * @return workItemRecordId
     */
    public String getWorkItemRecordId() {
        return workItemRecordId;
    }

    public void setWorkItemRecordId(String workItemRecordId) {
        this.workItemRecordId = workItemRecordId;
    }

    public WorkitemStatusRecords withWorkItemId(String workItemId) {
        this.workItemId = workItemId;
        return this;
    }

    /**
     * 工作项id
     * @return workItemId
     */
    public String getWorkItemId() {
        return workItemId;
    }

    public void setWorkItemId(String workItemId) {
        this.workItemId = workItemId;
    }

    public WorkitemStatusRecords withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * devcloud项目的32位id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public WorkitemStatusRecords withWorkItemStatuses(List<WorkitemStatus> workItemStatuses) {
        this.workItemStatuses = workItemStatuses;
        return this;
    }

    public WorkitemStatusRecords addWorkItemStatusesItem(WorkitemStatus workItemStatusesItem) {
        if (this.workItemStatuses == null) {
            this.workItemStatuses = new ArrayList<>();
        }
        this.workItemStatuses.add(workItemStatusesItem);
        return this;
    }

    public WorkitemStatusRecords withWorkItemStatuses(Consumer<List<WorkitemStatus>> workItemStatusesSetter) {
        if (this.workItemStatuses == null) {
            this.workItemStatuses = new ArrayList<>();
        }
        workItemStatusesSetter.accept(this.workItemStatuses);
        return this;
    }

    /**
     * 操作历史
     * @return workItemStatuses
     */
    public List<WorkitemStatus> getWorkItemStatuses() {
        return workItemStatuses;
    }

    public void setWorkItemStatuses(List<WorkitemStatus> workItemStatuses) {
        this.workItemStatuses = workItemStatuses;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WorkitemStatusRecords workitemStatusRecords = (WorkitemStatusRecords) o;
        return Objects.equals(this.workItemRecordId, workitemStatusRecords.workItemRecordId)
            && Objects.equals(this.workItemId, workitemStatusRecords.workItemId)
            && Objects.equals(this.projectId, workitemStatusRecords.projectId)
            && Objects.equals(this.workItemStatuses, workitemStatusRecords.workItemStatuses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workItemRecordId, workItemId, projectId, workItemStatuses);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkitemStatusRecords {\n");
        sb.append("    workItemRecordId: ").append(toIndentedString(workItemRecordId)).append("\n");
        sb.append("    workItemId: ").append(toIndentedString(workItemId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    workItemStatuses: ").append(toIndentedString(workItemStatuses)).append("\n");
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
