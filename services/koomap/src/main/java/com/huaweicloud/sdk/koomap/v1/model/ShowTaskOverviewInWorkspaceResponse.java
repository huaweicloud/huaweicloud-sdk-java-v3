package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowTaskOverviewInWorkspaceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "running_count")

    private Integer runningCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_count")

    private Integer successCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_count")

    private Integer failedCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "archived_count")

    private Integer archivedCount;

    public ShowTaskOverviewInWorkspaceResponse withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 统计的工作共享空间ID。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ShowTaskOverviewInWorkspaceResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 任务总数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ShowTaskOverviewInWorkspaceResponse withRunningCount(Integer runningCount) {
        this.runningCount = runningCount;
        return this;
    }

    /**
     * 运行中数量。
     * @return runningCount
     */
    public Integer getRunningCount() {
        return runningCount;
    }

    public void setRunningCount(Integer runningCount) {
        this.runningCount = runningCount;
    }

    public ShowTaskOverviewInWorkspaceResponse withSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }

    /**
     * 成功数量。
     * @return successCount
     */
    public Integer getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
    }

    public ShowTaskOverviewInWorkspaceResponse withFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
        return this;
    }

    /**
     * 失败数量。
     * @return failedCount
     */
    public Integer getFailedCount() {
        return failedCount;
    }

    public void setFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
    }

    public ShowTaskOverviewInWorkspaceResponse withArchivedCount(Integer archivedCount) {
        this.archivedCount = archivedCount;
        return this;
    }

    /**
     * 已归档数量。
     * @return archivedCount
     */
    public Integer getArchivedCount() {
        return archivedCount;
    }

    public void setArchivedCount(Integer archivedCount) {
        this.archivedCount = archivedCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTaskOverviewInWorkspaceResponse that = (ShowTaskOverviewInWorkspaceResponse) obj;
        return Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.runningCount, that.runningCount)
            && Objects.equals(this.successCount, that.successCount)
            && Objects.equals(this.failedCount, that.failedCount)
            && Objects.equals(this.archivedCount, that.archivedCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId, totalCount, runningCount, successCount, failedCount, archivedCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTaskOverviewInWorkspaceResponse {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    runningCount: ").append(toIndentedString(runningCount)).append("\n");
        sb.append("    successCount: ").append(toIndentedString(successCount)).append("\n");
        sb.append("    failedCount: ").append(toIndentedString(failedCount)).append("\n");
        sb.append("    archivedCount: ").append(toIndentedString(archivedCount)).append("\n");
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
