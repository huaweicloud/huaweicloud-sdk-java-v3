package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class SwitchedPacketRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_group_id")

    private String sourceGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_group_id")

    private String targetGroupId;

    public SwitchedPacketRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * CodeArts项目ID，32位数字、小写字母组合。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public SwitchedPacketRequest withSourceGroupId(String sourceGroupId) {
        this.sourceGroupId = sourceGroupId;
        return this;
    }

    /**
     * 源分组编号
     * @return sourceGroupId
     */
    public String getSourceGroupId() {
        return sourceGroupId;
    }

    public void setSourceGroupId(String sourceGroupId) {
        this.sourceGroupId = sourceGroupId;
    }

    public SwitchedPacketRequest withTargetGroupId(String targetGroupId) {
        this.targetGroupId = targetGroupId;
        return this;
    }

    /**
     * 目标分组编号
     * @return targetGroupId
     */
    public String getTargetGroupId() {
        return targetGroupId;
    }

    public void setTargetGroupId(String targetGroupId) {
        this.targetGroupId = targetGroupId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SwitchedPacketRequest that = (SwitchedPacketRequest) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.sourceGroupId, that.sourceGroupId)
            && Objects.equals(this.targetGroupId, that.targetGroupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, sourceGroupId, targetGroupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchedPacketRequest {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    sourceGroupId: ").append(toIndentedString(sourceGroupId)).append("\n");
        sb.append("    targetGroupId: ").append(toIndentedString(targetGroupId)).append("\n");
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
