package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowStorageRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format_list")

    private String formatList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "in_project")

    private String inProject;

    public ShowStorageRequest withFormatList(String formatList) {
        this.formatList = formatList;
        return this;
    }

    /**
     * 类型列表
     * @return formatList
     */
    public String getFormatList() {
        return formatList;
    }

    public void setFormatList(String formatList) {
        this.formatList = formatList;
    }

    public ShowStorageRequest withInProject(String inProject) {
        this.inProject = inProject;
        return this;
    }

    /**
     * 是否在项目中
     * @return inProject
     */
    public String getInProject() {
        return inProject;
    }

    public void setInProject(String inProject) {
        this.inProject = inProject;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowStorageRequest that = (ShowStorageRequest) obj;
        return Objects.equals(this.formatList, that.formatList) && Objects.equals(this.inProject, that.inProject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(formatList, inProject);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowStorageRequest {\n");
        sb.append("    formatList: ").append(toIndentedString(formatList)).append("\n");
        sb.append("    inProject: ").append(toIndentedString(inProject)).append("\n");
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
