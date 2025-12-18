package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建profiling诊断作业请求体
 */
public class CreateProfilingDiagnosisJobRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_path")

    private String obsPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    public CreateProfilingDiagnosisJobRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：添加的对作业的描述。 **约束限制**：不涉及。 **取值范围**：字符串,长度为0到256之间。 **默认取值**： 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateProfilingDiagnosisJobRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：profiling诊断作业名称。 **约束限制**：不涉及。 **取值范围**：只允许输入长度为 1 到 64 位由数字、中文、英文、下划线（_）或中划线（-）组成的字符。 **默认取值**：不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateProfilingDiagnosisJobRequestBody withObsPath(String obsPath) {
        this.obsPath = obsPath;
        return this;
    }

    /**
     * **参数解释**：profiling诊断输入profiling性能数据obs路径。 **约束限制**：不涉及。 **取值范围**：[0,2048]。 **默认取值**：不涉及。
     * @return obsPath
     */
    public String getObsPath() {
        return obsPath;
    }

    public void setObsPath(String obsPath) {
        this.obsPath = obsPath;
    }

    public CreateProfilingDiagnosisJobRequestBody withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * **参数解释**：工作空间ID。 **约束限制**：不涉及。 **取值范围**：0或长度为32的字符串。 **默认取值**：0。 
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateProfilingDiagnosisJobRequestBody that = (CreateProfilingDiagnosisJobRequestBody) obj;
        return Objects.equals(this.description, that.description) && Objects.equals(this.name, that.name)
            && Objects.equals(this.obsPath, that.obsPath) && Objects.equals(this.workspaceId, that.workspaceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, name, obsPath, workspaceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateProfilingDiagnosisJobRequestBody {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    obsPath: ").append(toIndentedString(obsPath)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
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
