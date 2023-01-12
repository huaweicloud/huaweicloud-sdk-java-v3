package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowPlaybookMonitorsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "playbook_id")

    private String playbookId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_query_type")

    private String versionQueryType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    public ShowPlaybookMonitorsRequest withWorkspaceId(String workspaceId) {
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

    public ShowPlaybookMonitorsRequest withPlaybookId(String playbookId) {
        this.playbookId = playbookId;
        return this;
    }

    /**
     * ID of playbook
     * @return playbookId
     */
    public String getPlaybookId() {
        return playbookId;
    }

    public void setPlaybookId(String playbookId) {
        this.playbookId = playbookId;
    }

    public ShowPlaybookMonitorsRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ShowPlaybookMonitorsRequest withVersionQueryType(String versionQueryType) {
        this.versionQueryType = versionQueryType;
        return this;
    }

    /**
     * 统计剧本版本类型（ALL:全部，VALID:有效的，DELETED:已删除）
     * @return versionQueryType
     */
    public String getVersionQueryType() {
        return versionQueryType;
    }

    public void setVersionQueryType(String versionQueryType) {
        this.versionQueryType = versionQueryType;
    }

    public ShowPlaybookMonitorsRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowPlaybookMonitorsRequest showPlaybookMonitorsRequest = (ShowPlaybookMonitorsRequest) o;
        return Objects.equals(this.workspaceId, showPlaybookMonitorsRequest.workspaceId)
            && Objects.equals(this.playbookId, showPlaybookMonitorsRequest.playbookId)
            && Objects.equals(this.startTime, showPlaybookMonitorsRequest.startTime)
            && Objects.equals(this.versionQueryType, showPlaybookMonitorsRequest.versionQueryType)
            && Objects.equals(this.endTime, showPlaybookMonitorsRequest.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId, playbookId, startTime, versionQueryType, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPlaybookMonitorsRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    playbookId: ").append(toIndentedString(playbookId)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    versionQueryType: ").append(toIndentedString(versionQueryType)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
