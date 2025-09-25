package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateMessageAdditionsReq
 */
public class CreateMessageAdditionsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private QaType type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tool_type")

    private ToolType toolType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    private String jobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_path")

    private String dataPath;

    public CreateMessageAdditionsReq withType(QaType type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    public QaType getType() {
        return type;
    }

    public void setType(QaType type) {
        this.type = type;
    }

    public CreateMessageAdditionsReq withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * **参数解释**： 实验问答使用的空间ID。 **约束限制**： 不涉及 **取值范围**： 仅支持字母、数字、中划线和下划线，长度为[1-128]个字符。 **默认取值**： 不涉及 
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public CreateMessageAdditionsReq withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * **参数解释**： 实验问答的作业ID。 **约束限制**： 不涉及 **取值范围**： 仅支持字母、数字、中划线和下划线，长度为[1-128]个字符。 **默认取值**： 不涉及 
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public CreateMessageAdditionsReq withToolType(ToolType toolType) {
        this.toolType = toolType;
        return this;
    }

    /**
     * Get toolType
     * @return toolType
     */
    public ToolType getToolType() {
        return toolType;
    }

    public void setToolType(ToolType toolType) {
        this.toolType = toolType;
    }

    public CreateMessageAdditionsReq withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * **参数解释**： 作业类型。 **约束限制**： 不涉及 **取值范围**： 取值范围为[1-64]个字符。 **默认取值**： 不涉及 
     * @return jobType
     */
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public CreateMessageAdditionsReq withDataPath(String dataPath) {
        this.dataPath = dataPath;
        return this;
    }

    /**
     * **参数解释**： 深度探究生成报告存储路径。 **约束限制**： 不涉及 **取值范围**： 取值范围为[1-1024]个字符。 **默认取值**： 不涉及 
     * @return dataPath
     */
    public String getDataPath() {
        return dataPath;
    }

    public void setDataPath(String dataPath) {
        this.dataPath = dataPath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateMessageAdditionsReq that = (CreateMessageAdditionsReq) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.jobId, that.jobId) && Objects.equals(this.toolType, that.toolType)
            && Objects.equals(this.jobType, that.jobType) && Objects.equals(this.dataPath, that.dataPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, workspaceId, jobId, toolType, jobType, dataPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMessageAdditionsReq {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    toolType: ").append(toIndentedString(toolType)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    dataPath: ").append(toIndentedString(dataPath)).append("\n");
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
