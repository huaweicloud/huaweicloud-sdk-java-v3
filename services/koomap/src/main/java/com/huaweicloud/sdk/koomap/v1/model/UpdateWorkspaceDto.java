package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 更新工作共享空间传输对象。
 */
public class UpdateWorkspaceDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_name")

    private String workspaceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_description")

    private String workspaceDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "star")

    private Integer star;

    public UpdateWorkspaceDto withWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }

    /**
     * 工作共享空间名称。支持中文、英文、数字以及“_”字符，长度限制2~50个字符。
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return workspaceName;
    }

    public void setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
    }

    public UpdateWorkspaceDto withWorkspaceDescription(String workspaceDescription) {
        this.workspaceDescription = workspaceDescription;
        return this;
    }

    /**
     * 工作共享空间描述。支持中文、英文、数字以及“_”字符，长度限制200个字符以内。
     * @return workspaceDescription
     */
    public String getWorkspaceDescription() {
        return workspaceDescription;
    }

    public void setWorkspaceDescription(String workspaceDescription) {
        this.workspaceDescription = workspaceDescription;
    }

    public UpdateWorkspaceDto withStar(Integer star) {
        this.star = star;
        return this;
    }

    /**
     * 工作共享空间是否置顶显示（最多可置顶4个）。
     * @return star
     */
    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateWorkspaceDto that = (UpdateWorkspaceDto) obj;
        return Objects.equals(this.workspaceName, that.workspaceName)
            && Objects.equals(this.workspaceDescription, that.workspaceDescription)
            && Objects.equals(this.star, that.star);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceName, workspaceDescription, star);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateWorkspaceDto {\n");
        sb.append("    workspaceName: ").append(toIndentedString(workspaceName)).append("\n");
        sb.append("    workspaceDescription: ").append(toIndentedString(workspaceDescription)).append("\n");
        sb.append("    star: ").append(toIndentedString(star)).append("\n");
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
