package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowBaselineSnapshotsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_version_id")

    private String snapshotVersionId;

    public ShowBaselineSnapshotsRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目32位ID，项目唯一标识。通过查询IPD项目列表获取，响应消息体中的id字段的值就是项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowBaselineSnapshotsRequest withSnapshotVersionId(String snapshotVersionId) {
        this.snapshotVersionId = snapshotVersionId;
        return this;
    }

    /**
     * 特性集快照版本ID，不传则查询当前版本特性集，传值则查询对应版本的特性集
     * @return snapshotVersionId
     */
    public String getSnapshotVersionId() {
        return snapshotVersionId;
    }

    public void setSnapshotVersionId(String snapshotVersionId) {
        this.snapshotVersionId = snapshotVersionId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowBaselineSnapshotsRequest that = (ShowBaselineSnapshotsRequest) obj;
        return Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.snapshotVersionId, that.snapshotVersionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, snapshotVersionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBaselineSnapshotsRequest {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    snapshotVersionId: ").append(toIndentedString(snapshotVersionId)).append("\n");
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
