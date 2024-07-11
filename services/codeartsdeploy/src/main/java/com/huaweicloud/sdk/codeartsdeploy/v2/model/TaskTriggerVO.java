package com.huaweicloud.sdk.codeartsdeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 部署任务触发场景配置
 */
public class TaskTriggerVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_source")

    private String triggerSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "artifact_source_system")

    private String artifactSourceSystem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "artifact_type")

    private String artifactType;

    public TaskTriggerVO withTriggerSource(String triggerSource) {
        this.triggerSource = triggerSource;
        return this;
    }

    /**
     * 部署任务允许执行的场景。其中0：所有执行请求均可，1：只允许流水线触发
     * @return triggerSource
     */
    public String getTriggerSource() {
        return triggerSource;
    }

    public void setTriggerSource(String triggerSource) {
        this.triggerSource = triggerSource;
    }

    public TaskTriggerVO withArtifactSourceSystem(String artifactSourceSystem) {
        this.artifactSourceSystem = artifactSourceSystem;
        return this;
    }

    /**
     * 当任务只允许流水线触发执行时，流水线传递的来源信息，当前只有CloudArtifact
     * @return artifactSourceSystem
     */
    public String getArtifactSourceSystem() {
        return artifactSourceSystem;
    }

    public void setArtifactSourceSystem(String artifactSourceSystem) {
        this.artifactSourceSystem = artifactSourceSystem;
    }

    public TaskTriggerVO withArtifactType(String artifactType) {
        this.artifactType = artifactType;
        return this;
    }

    /**
     * 当任务只允许流水线触发执行时，对应流水线源的制品仓库类型（generic、docker）
     * @return artifactType
     */
    public String getArtifactType() {
        return artifactType;
    }

    public void setArtifactType(String artifactType) {
        this.artifactType = artifactType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskTriggerVO that = (TaskTriggerVO) obj;
        return Objects.equals(this.triggerSource, that.triggerSource)
            && Objects.equals(this.artifactSourceSystem, that.artifactSourceSystem)
            && Objects.equals(this.artifactType, that.artifactType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(triggerSource, artifactSourceSystem, artifactType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskTriggerVO {\n");
        sb.append("    triggerSource: ").append(toIndentedString(triggerSource)).append("\n");
        sb.append("    artifactSourceSystem: ").append(toIndentedString(artifactSourceSystem)).append("\n");
        sb.append("    artifactType: ").append(toIndentedString(artifactType)).append("\n");
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
