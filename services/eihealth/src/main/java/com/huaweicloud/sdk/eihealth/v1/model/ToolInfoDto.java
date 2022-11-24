package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ToolInfoDto
 */
public class ToolInfoDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tool_id")

    private String toolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tool_name")

    private String toolName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tool_version")

    private String toolVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tool_type")

    private String toolType;

    public ToolInfoDto withToolId(String toolId) {
        this.toolId = toolId;
        return this;
    }

    /**
     * 作业依赖的组件id
     * @return toolId
     */
    public String getToolId() {
        return toolId;
    }

    public void setToolId(String toolId) {
        this.toolId = toolId;
    }

    public ToolInfoDto withToolName(String toolName) {
        this.toolName = toolName;
        return this;
    }

    /**
     * 作业依赖的组件名称
     * @return toolName
     */
    public String getToolName() {
        return toolName;
    }

    public void setToolName(String toolName) {
        this.toolName = toolName;
    }

    public ToolInfoDto withToolVersion(String toolVersion) {
        this.toolVersion = toolVersion;
        return this;
    }

    /**
     * 作业依赖的组件版本
     * @return toolVersion
     */
    public String getToolVersion() {
        return toolVersion;
    }

    public void setToolVersion(String toolVersion) {
        this.toolVersion = toolVersion;
    }

    public ToolInfoDto withToolType(String toolType) {
        this.toolType = toolType;
        return this;
    }

    /**
     * 作业依赖的组件类型，取值范围app|workflow
     * @return toolType
     */
    public String getToolType() {
        return toolType;
    }

    public void setToolType(String toolType) {
        this.toolType = toolType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ToolInfoDto toolInfoDto = (ToolInfoDto) o;
        return Objects.equals(this.toolId, toolInfoDto.toolId) && Objects.equals(this.toolName, toolInfoDto.toolName)
            && Objects.equals(this.toolVersion, toolInfoDto.toolVersion)
            && Objects.equals(this.toolType, toolInfoDto.toolType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(toolId, toolName, toolVersion, toolType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ToolInfoDto {\n");
        sb.append("    toolId: ").append(toIndentedString(toolId)).append("\n");
        sb.append("    toolName: ").append(toIndentedString(toolName)).append("\n");
        sb.append("    toolVersion: ").append(toIndentedString(toolVersion)).append("\n");
        sb.append("    toolType: ").append(toIndentedString(toolType)).append("\n");
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
